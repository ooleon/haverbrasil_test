package com.haverbr.controluser;

import com.haverbr.Entity.UnidadeFederacao;
import java.io.IOException;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuController {

    private static Stage stage;
    private static Scene scene;
    private static Parent root;

    @FXML
    private ComboBox<UnidadeFederacao> cmbSigla;
    @FXML
    private DatePicker dtpkDadaNascimento;
    

    @FXML
    VBox vboxCadastro;

    @FXML
    private void loadCadastro() throws IOException {

    }

    @FXML
    private void switchToCadastro() throws IOException {
        String stringScene = "cadastro";
        App.setRoot(stringScene);
    }

    void fillComboUF(String sScena) {
        cmbSigla.getItems().addAll(UnidadeFederacao.getListSigla());
//        cmbSigla.getItems().addAll(UnidadeFederacao.getMapSigla().values());
        System.out.println("UF cargadas em " + sScena +" comboBox1 ? -> " + cmbSigla.getItems().size());
        System.out.println("UF selecionada em comboBox1 ? -> " + cmbSigla.getValue());
//        dtpkDadaNascimento

    }

    public void limpar(ActionEvent actionEvent) throws IOException {
        cmbSigla.setValue(null);
        System.out.println(
        dtpkDadaNascimento.getValue());
    }

    public void fillUF(ActionEvent actionEvent) throws IOException {
        fillComboUF("cadastro");
    }

    @FXML
    private void switchToInformarpais() throws IOException {
        App.setRoot("informarpais");
    }

    @FXML
    private void switchToVisualizar() throws IOException {
        App.setRoot("visualizar");
    }

    @FXML
    private void switchToMenu() throws IOException {
        App.setRoot("menu");
    }

    @FXML
    private void switchToTerminar() throws IOException {
        App.setRoot("menu");
        Alert alert = new Alert(Alert.AlertType.INFORMATION, " Saindo do sistema de forma segura");
        alert.showAndWait();
        System.exit(0);
    }

}
