package com.haverbr.controluser;

import com.haverbr.entity.CadastroEntity;
import com.haverbr.service.DBService;
import com.haverbr.util.UnidadeFederacao;
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

public class VisualizarController {

    private static Stage stage;
    private static Scene scene;
    private static Parent root;

    CadastroEntity instanceCadastro;
    DBService instanceDBService;

    @FXML
    private Label nome;
    @FXML
    private Label datanacimento;
    @FXML
    private Label nomepai;
    @FXML
    private Label nomemae;
    @FXML
    private Label sigla;
    @FXML
    private Label endereco;
    @FXML
    private Label numero;
    @FXML
    private Label complemento;
    @FXML
    private Label bairro;
    @FXML
    private Label cidade;
    @FXML
    private Label cep;
    @FXML
    private Label cpf;

    @FXML
    VBox vboxCadastro;

    @FXML
    private void switchToCadastro() throws IOException {
        String stringScene = "cadastro";
        App.setRoot(stringScene);
    }

    void fillComboUF(String sScena) {
    }

    void fillScene(String fxml) {
        instanceDBService = DBService.getInstance();
        cpf.setText(instanceDBService.procurarCadastroPorId("").getCpf());
        datanacimento.setText(instanceDBService.procurarCadastroPorId("").getDataNascimento());
        sigla.setText(instanceDBService.procurarCadastroPorId("").getSigla());
        cep.setText(instanceDBService.procurarCadastroPorId("").getCep());
        nome.setText(instanceDBService.procurarCadastroPorId("").getNome());
        complemento.setText(instanceDBService.procurarCadastroPorId("").getComplemento());
        numero.setText(instanceDBService.procurarCadastroPorId("").getNumero());
        nomepai.setText(instanceDBService.procurarCadastroPorId("").getNomePai());
        nomemae.setText(instanceDBService.procurarCadastroPorId("").getNomeMae());
        bairro.setText(instanceDBService.procurarCadastroPorId("").getBairro());
        cidade.setText(instanceDBService.procurarCadastroPorId("").getCidade());
        endereco.setText(instanceDBService.procurarCadastroPorId("").getEndereco());
    }

    public void procurarCadastro(String id) {
        instanceCadastro = instanceDBService.procurarCadastroPorId(id);
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
