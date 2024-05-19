package com.haverbr.controluser;

import com.haverbr.entity.CadastroEntity;
import com.haverbr.service.DBService;
import com.haverbr.util.UnidadeFederacao;
import static com.haverbr.util.MascarasFX.mascaraCEP;
import static com.haverbr.util.MascarasFX.mascaraData;
import static com.haverbr.util.MascarasFX.mascaraCPF;
import static com.haverbr.util.Constant.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class MenuController {

    CadastroEntity instanceCadastro;
    DBService instanceDBService;

    @FXML
    private TextField nome;
    @FXML
    private DatePicker dtpkDadaNascimento;
    @FXML
    private TextField cpf;
    @FXML
    private TextField cep;
    @FXML
    private ComboBox<String> cmbSigla;
    @FXML
    private TextField endereco;
    @FXML
    private TextField cidade;
    @FXML
    private TextField bairro;
    @FXML
    private TextField complemento;
    @FXML
    private TextField numero;
    @FXML
    private TextField textData;

    
    private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(DATE_PATTERN);

    @FXML
    private void switchToCadastro() throws IOException {
        String stringScene = "cadastro";
        App.setRoot(stringScene);
    }

    @FXML
    void dataPickerFlet(ActionEvent actionEvent) {
        String sData = dtpkDadaNascimento.getValue().format(dateFormatter);
        textData.setText(sData);
        ;
    }

    @FXML
    void fillTextDataPicker(ActionEvent actionEvent) {
        textData.setText(dtpkDadaNascimento.getValue().format(dateFormatter));
    }

    @FXML
    private void switchToInformarpaisBtnMenu() throws IOException {
        Alert alert = new Alert(Alert.AlertType.WARNING, MSG_DADOS_OBRIGATORIOS);
        alert.show();

    }

    @FXML
    private void switchToInformarpais() throws IOException {

        if (this.validarCadastro()) {
            this.salvarCadastro();
            App.setRoot("informarpais");
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING, MSG_DADOS_OBRIGATORIOS);
            alert.show();
        }
    }

    @FXML
    private void switchToVisualizarBtnMenu() throws IOException {

        if (this.validarCadastro()) {
            gotoVisualizar();
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING, MSG_DADOS_OBRIGATORIOS);
            alert.show();
        }

    }

    @FXML
    private void switchToVisualizar() throws IOException {
        if (this.validarCadastro()) {
            this.salvarCadastro();
            gotoVisualizar();
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
        Alert alert = new Alert(Alert.AlertType.INFORMATION, " Saindo do sistema de forma segura");
        alert.showAndWait();
        System.exit(0);
    }

    private void gotoVisualizar() throws IOException {
        App.setRoot("visualizar");
    }

    void fillScene(String fxml) {
        cmbSigla.getItems().addAll(UnidadeFederacao.getListSigla());

        mascaraCEP(cep);
        mascaraData(dtpkDadaNascimento);
        mascaraCPF(cpf);

    }

    void fillSceneFromInfPais() {
        instanceDBService = DBService.getInstance();
        fillScene("");
        // dataPickerConverter();
        // dtpkDadaNascimento.setConverter(sc);
        // dtpkDadaNascimento.setText(instanceDBService.procurarCadastroPorId("").getDataNascimento());
        cpf.setText(instanceDBService.procurarCadastroPorId("").getCpf());
        cmbSigla.getItems().addAll(UnidadeFederacao.getListSigla());
        cmbSigla.setValue(instanceDBService.procurarCadastroPorId("").getSigla());
        cep.setText(instanceDBService.procurarCadastroPorId("").getCep());
        nome.setText(instanceDBService.procurarCadastroPorId("").getNome());
        complemento.setText(instanceDBService.procurarCadastroPorId("").getComplemento());
        numero.setText(instanceDBService.procurarCadastroPorId("").getNumero());
        bairro.setText(instanceDBService.procurarCadastroPorId("").getBairro());
        cidade.setText(instanceDBService.procurarCadastroPorId("").getCidade());
        endereco.setText(instanceDBService.procurarCadastroPorId("").getEndereco());
    }

    public void limpar(ActionEvent actionEvent) throws IOException {
        nome.setText(null);
        cpf.setText(null);
        cep.setText(null);
        endereco.setText(null);
        cidade.setText(null);
        bairro.setText(null);
        complemento.setText(null);
        numero.setText(null);
        nome.setText(null);
        nome.setText(null);
        nome.setText(null);
        cmbSigla.setValue(null);
        dtpkDadaNascimento.setValue(null);
    }

    public boolean validarCadastro() {
        if (dtpkDadaNascimento == null) {
            return false;
        }
        LocalDate validarDadaNacimento = dtpkDadaNascimento.getValue();
        if (dtpkDadaNascimento == null || validarDadaNacimento == null) {
            return false;
        }
        if (cmbSigla == null || cmbSigla.getValue() == null) {
            return false;
        }

        if (nome == null || nome.getText().isBlank() || nome.getText().isEmpty()) {
            return false;
        }

        if (cpf == null || cpf.getText().isBlank() || cpf.getText().isEmpty()) {
            return false;
        }

        if (cep == null || cep.getText().isBlank() || cep.getText().isEmpty()) {
            return false;
        }

        if (endereco == null || endereco.getText().isBlank() || endereco.getText().isEmpty()) {
            return false;
        }

        if (cidade == null || cidade.getText().isBlank() || cidade.getText().isEmpty()) {
            return false;
        }

        if (bairro == null || bairro.getText().isBlank() || bairro.getText().isEmpty()) {
            return false;
        }

        if (numero == null || numero.getText().isBlank() || numero.getText().isEmpty()) {
            return false;
        }

        return true;
    }

    public void salvarCadastro() {
        instanceDBService = DBService.getInstance();
        instanceCadastro = CadastroEntity.getInstance();

        instanceCadastro.setNome(nome.getText());
        instanceCadastro.setDataNascimento(dtpkDadaNascimento.getValue().format(dateFormatter));
        instanceCadastro.setSigla(cmbSigla.getValue());
        instanceCadastro.setCpf(cpf.getText());
        instanceCadastro.setCep(cep.getText());
        instanceCadastro.setCidade(cidade.getText());
        instanceCadastro.setBairro(bairro.getText());
        instanceCadastro.setEndereco(endereco.getText());
        instanceCadastro.setComplemento(complemento.getText());
        instanceCadastro.setNumero(numero.getText());

        instanceDBService.salvarCadastro(instanceCadastro);

    }

    public void procurarCadastro(String id) {
        instanceCadastro = instanceDBService.procurarCadastroPorId(id);
    }

    public void dataPickerConverter(String dataString) {
        dtpkDadaNascimento.setConverter(new StringConverter<LocalDate>() {

            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(DATE_PATTERN);

            {
                dtpkDadaNascimento.setPromptText(DATE_PATTERN.toLowerCase());
            }

            @Override
            public String toString(LocalDate date) {
                if (date != null) {
                    return dateFormatter.format(date);
                } else {
                    return "";
                }
            }

            @Override
            public LocalDate fromString(String string) {
                if (string != null && !string.isEmpty()) {
                    return LocalDate.parse(string, dateFormatter);
                } else {
                    return null;
                }
            }
        });

        // dtpkDadaNascimento.setConverter();
    }

}
