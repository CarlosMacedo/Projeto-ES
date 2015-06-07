package prontuario;


import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TelaPrincipalApp extends Application {
	private static Stage stage;
	private static BorderPane tela;
	
	@Override
	public void start(Stage stage) {
		TelaPrincipalApp.stage = stage;
		TelaPrincipalApp.stage.setTitle("Prontuario do Paciente");
		
		initLayout();
	}
	
	/*
	 * Inicializa a tela principal
	 * */
	private void initLayout() {
		try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(TelaPrincipalApp.class.getResource("view/Prontuario do Paciente.fxml"));
            tela = (BorderPane) loader.load();

            Scene scene = new Scene(tela);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
	
	public static BorderPane getTela() {
		return tela;
	}
	
	public static Stage getStage(){
		return stage;
	}
	
	/* 
	* Carrega/inicia tela
	* */
	public static void initTela(String tipo, String view, String title) throws IOException {
		if (tipo.equals("BorderPane")){
			try {
				BorderPane tela = TelaPrincipalApp.getTela();
	    		
	        	FXMLLoader loader = new FXMLLoader();
	        	loader.setLocation(TelaPrincipalApp.class.getResource("view/" + view));
	        	BorderPane telaLoader = (BorderPane) loader.load();
	            
	        	tela.setCenter(telaLoader);
				TelaPrincipalApp.getStage().setTitle(title); 
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	}
	
	//Sobrecarga
	public static void initTela(String tipo){
		if (tipo.equals("BorderPane")){
			BorderPane tela = TelaPrincipalApp.getTela();
			tela.setCenter(null);
			TelaPrincipalApp.getStage().setTitle("Prontuario do Paciente");
		}
	}
}