package org.nativa.sistema;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Principal extends Application{
    private final String PAQUETE_VISTA = "/org/nativa/view/";
    private Stage escenarioPrincipal;
    private Scene escena;

    @Override
    public void start(Stage escenarioPrincipal){
        this.escenarioPrincipal = escenarioPrincipal;
        escenarioPrincipal.setTitle("Nativa Maneger");
        menuPrincipal();
    }
    
    public void menuPrincipal(){}
}
