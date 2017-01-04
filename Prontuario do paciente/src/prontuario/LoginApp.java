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
