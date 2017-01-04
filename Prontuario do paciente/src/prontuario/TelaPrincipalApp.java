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