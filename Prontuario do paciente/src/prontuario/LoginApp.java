package prontuario;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LoginApp extends Application {
	private static Stage stage;
	private static BorderPane tela;
	
	@Override
	public void start(Stage stage) {
		LoginApp.stage = stage;
		LoginApp.stage.setTitle("Login: Prontuario do Paciente");
		
		initLayout();
	}
	
	/*
	 * Inicializa a tela de login
	 * */
	private void initLayout() {
		try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(LoginApp.class.getResource("view/Login.fxml"));
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
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
