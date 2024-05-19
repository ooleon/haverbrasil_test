package com.haverbr.controluser;

import com.haverbr.entity.CadastroEntity;
import com.haverbr.service.DBService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.*;

/**
 * JavaFX App
 */
public class App extends Application {


    private static Stage stage;
    private static Scene scene;
    private static Parent root;
    private static FXMLLoader fxmlLoader1;
    static CadastroEntity cadastroEntity;
    static DBService dBService;
    public static MenuController menuController;
    public static VisualizarController visualizarController;
    public static InformarPaisController informarPaisController;

    private static String separator() {
        return FileSystems.getDefault().getSeparator();
    }

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("menu"), 640, 480);
        stage.setScene(scene);
        stage.setTitle("Cadastro de pessoas e páis");
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        
        scene.setRoot(loadFXML(fxml));
    }
    
    
    static Parent getRoot() throws IOException {
        
        return root;
    }


    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("scenebuilder"+ separator() + fxml + ".fxml"));
//        fxmlLoader = new FXMLLoader(App.class.getResource("scenebuilder"+ separator() + fxml + ".fxml"));
        root=fxmlLoader.load();
        
        if(fxml.equals("cadastro")){
           menuController = fxmlLoader.getController();
           menuController.fillScene(fxml);
        }
        if(fxml.equals("visualizar")){
           visualizarController = fxmlLoader.getController();
           visualizarController.fillComboUF(fxml);
           visualizarController.fillScene(fxml);
        }
        if(fxml.equals("informarpais")){
           informarPaisController = fxmlLoader.getController();
           informarPaisController.fillScene(fxml);
        }
        fxmlLoader1=fxmlLoader;
        return root;
    }

    public static void main(String[] args) {
        dBService = DBService.getInstance();
        launch();
    }

}