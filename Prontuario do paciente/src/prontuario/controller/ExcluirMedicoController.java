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

import prontuario.TelaPrincipalApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ExcluirMedicoController {

    @FXML
    private TableColumn<?, ?> clEmail;

    @FXML
    private TableColumn<?, ?> clCrm;

    @FXML
    private TableColumn<?, ?> clNome;

    @FXML
    private TableColumn<?, ?> clCpf;

    @FXML
    private TableColumn<?, ?> clLogin;

    @FXML
    private TableColumn<?, ?> clSexo;

    @FXML
    private TableColumn<?, ?> clTelefone;

    @FXML
    private TableColumn<?, ?> clEspecialidade;

    @FXML
    private TableView<?> tbMedicos;

    @FXML
    private TableColumn<?, ?> clDataDeNascimento;

    @FXML
    void remover(ActionEvent event) {

    }

    @FXML
    void editar(ActionEvent event) {

    }

    @FXML
    void cancelar(ActionEvent event) {
    	TelaPrincipalApp.initTela("BorderPane");
    }

}


