/**
 * Copyright 2017 Carlos Macêdo
 * 
 * This file is part of SeT software.
 * 
 *  SeT is free software: you can 
 *  redistribute it and/or modify it under the terms of the GNU General 
 *  Public License as published by the Free Software Foundation, either 
 *  version 3 of the License, or (at your option) any later version.
 *  
 *  SeT is distributed in the hope that
 *  it will be useful, but WITHOUT ANY WARRANTY; without even the implied 
 *  warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See 
 *  the GNU General Public License for more details.
 *  You should have received a copy of the GNU General Public License
 *  along with SeT
 *  If not, see <http://www.gnu.org/licenses/>.
 *  
 *  Contact: carlosmacedo025 at gmail dot com
 */
package prontuario.controller;

import java.sql.SQLException;
import java.util.Date;

import javax.swing.JOptionPane;

import prontuario.TelaPrincipalApp;
import prontuario.model.Paciente;
import prontuario.model.Queixas;
import prontuario.model.Sistema;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class QueixasController {

    @FXML
    private DatePicker dpDataQueixa;

    @FXML
    private TextField txMotivoQueixa;

    @FXML
    private TextArea txaQueixa;

    @SuppressWarnings("deprecation")
	@FXML
    void adicionar(ActionEvent event) {
    	try {
    		String[] dt = dpDataQueixa.getValue().toString().split("-");
    		String motivo = txMotivoQueixa.getText();
    		String queixa = txaQueixa.getText();
    		
    		Queixas q = new Queixas(new Date(Integer.parseInt(dt[2]), Integer.parseInt(dt[1]), Integer.parseInt(dt[0])),
    				queixa,
    				motivo);
    		
    		Paciente p = (Paciente) Sistema.getUsuarioLogado();
    		try {
				p.addQueixa(q);
				
				JOptionPane.showMessageDialog(null, "Queixa adicionada.");
	    		TelaPrincipalApp.initTela("BorderPane");
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Essa queixa já existe.");
			}
    		
    	} catch (NullPointerException e) {
    		JOptionPane.showMessageDialog(null, "Preencha a data.");
    	}
    }

    @FXML
    void fechar(ActionEvent event) {
    	TelaPrincipalApp.initTela("BorderPane");
    }

}
