package org.iesalandalus.programacion.reservashotel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage escenarioPrincipal)  {

        try {
        FXMLLoader fxmlLoader = new FXMLLoader(LocalizadorRecursos.class.getResource("ListadoView.fxml");
        Parent raiz = fxmlLoader.load();
        Scene scene = new Scene(raiz);
        escenarioPrincipal.setTitle("Reservas de Hotel");
        escenarioPrincipal.setScene(scene);
        escenarioPrincipal.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}