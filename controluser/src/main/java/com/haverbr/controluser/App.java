package com.haverbr.controluser;

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
     
    

    private static String separator() {
        return FileSystems.getDefault().getSeparator();
    }

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("menu"), 640, 480);
        stage.setScene(scene);
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
           MenuController controller = fxmlLoader.getController();
           controller.fillComboUF(fxml);
        }
        fxmlLoader1=fxmlLoader;
        return root;
    }

    public static void main(String[] args) {
        launch();
    }

}