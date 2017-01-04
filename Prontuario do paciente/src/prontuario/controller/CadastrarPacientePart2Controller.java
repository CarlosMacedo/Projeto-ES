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

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class CadastrarPacientePart2Controller {

    @FXML
    private PasswordField txNomePai;

    @FXML
    private TextField txNumRegistro;

    @FXML
    private Label lbTitulo;

    @FXML
    private PasswordField txLocalNascimento;

    @FXML
    private TextField txNomeMae;

    @FXML
    private ToggleGroup estadoCivil;

    @FXML
    private TextField txProfissao;

    @FXML
    private RadioButton rbSolteiro;

    @FXML
    private TextField txNomeConjuge;

    @FXML
    private RadioButton rdCasado;

    @FXML
    void cancelar(ActionEvent event) {

    }

    @FXML
    void voltar(ActionEvent event) {

    }

    @FXML
    void confirmar(ActionEvent event) {

    }

}

