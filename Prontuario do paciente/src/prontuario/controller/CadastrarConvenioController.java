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
import prontuario.model.Adminstrador;
import prontuario.model.Convenio;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class CadastrarConvenioController {

    @FXML
    private TextField txURL;

    @FXML
    private TextField txRegistroANS;

    @FXML
    private TextField txCnpj;

    @FXML
    private TextField txQntDiasRetorno;

    @FXML
    private DatePicker dpDataDoFaturamento;

    @FXML
    private TextField txRazaoSocial;

    @FXML
    private TextField txNome;

    @FXML
    private TextField txCodigoPrestador;

    @FXML
    void cancelar(ActionEvent event) {
    	TelaPrincipalApp.initTela("BorderPane");
    }

    @SuppressWarnings("deprecation")
	@FXML
    void confirmar(ActionEvent event) {
    	Adminstrador adm = Adminstrador.getInstance();
    	
    	try {
    		String DataDoFaturamento = dpDataDoFaturamento.getValue().toString();
    		String[] df = DataDoFaturamento.split("-");
    		
	    	Convenio convenio = new Convenio(txCnpj.getText(), txRazaoSocial.getText(), txNome.getText(),
	    			txRegistroANS.getText(), txURL.getText(), txCodigoPrestador.getText(),
	    			new Date(Integer.parseInt(df[0]), Integer.parseInt(df[1]), Integer.parseInt(df[2])),
	    			Integer.parseInt(txQntDiasRetorno.getText()));
	    	
	    	try {
				adm.cadastrarConvenio(convenio);
				
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
		    	TelaPrincipalApp.initTela("BorderPane");
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Cnpj já está cadastrado.");
			}
	    		    	
    	} catch (NullPointerException e) {
    		JOptionPane.showMessageDialog(null, "As datas devem serem preenchidas.");
    	} catch (NumberFormatException e) {
    		JOptionPane.showMessageDialog(null, "Quantidade de dias de retorno deve ser um número.");
    	}
 
    }

}
