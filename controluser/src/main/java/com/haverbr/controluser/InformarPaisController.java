package com.haverbr.controluser;

import com.haverbr.entity.CadastroEntity;
import com.haverbr.service.DBService;
import static com.haverbr.util.Constant.*;
import com.haverbr.util.UnidadeFederacao;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InformarPaisController {

    private static Stage stage;
    private static Scene scene;
    private static Parent root;

    CadastroEntity instanceCadastro;
    DBService instanceDBService;

    @FXML
    private TextField pai;
    @FXML
    private TextField mae;

    @FXML
    VBox vboxCadastro;

    @FXML
    private void switchToCadastro() throws IOException {
        String stringScene = "cadastro";
        App.setRoot(stringScene);
        App.menuController.fillSceneFromInfPais();
        }

    void fillScene(String fxml) {
        instanceDBService = DBService.getInstance();
        System.out.println("UF selecionada em " + fxml + " ? -> " + instanceDBService.procurarCadastroPorId("").getSigla());
    }

    public boolean validarCadastro() {

        if (pai == null || pai.getText().isBlank() || pai.getText().isEmpty()) {
            return false;
        }

        if (mae == null || mae.getText().isBlank() || mae.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    @FXML
    public void limpar(ActionEvent actionEvent) throws IOException {
        pai.setText(null);
        mae.setText(null);
    }

    public void salvarCadastro() {
        instanceDBService = DBService.getInstance();
        instanceCadastro = CadastroEntity.getInstance();

        instanceCadastro.setNomePai(pai.getText());
        instanceCadastro.setNomeMae(mae.getText());

        instanceDBService.salvarCadastro(instanceCadastro);
    }

    public void procurarCadastro(String id) {
        instanceCadastro = instanceDBService.procurarCadastroPorId(id);
    }

    @FXML
    private void switchToVisualizar() throws IOException {
        if (this.validarCadastro()) {
            this.salvarCadastro();
            App.setRoot("visualizar");
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING, MSG_DADOS_OBRIGATORIOS);
            alert.show();
        }
    }

    @FXML
    private void switchToMenu() throws IOException {
        App.setRoot("menu");
    }

    @FXML
    private void switchToTerminar() throws IOException {
        App.setRoot("menu");
        Alert alert = new Alert(Alert.AlertType.INFORMATION, MSG_SAIR);
        alert.showAndWait();
        System.exit(0);
    }

}
