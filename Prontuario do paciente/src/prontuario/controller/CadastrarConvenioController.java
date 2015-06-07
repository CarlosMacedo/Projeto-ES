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
