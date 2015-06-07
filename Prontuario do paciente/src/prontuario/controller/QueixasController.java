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
