package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * 
 * Klasse zum Testen grundlegender JavaFX Funktionalität.
 *
 * @author Markus Suchalla, Cheng-Fu Ye, Dominik Schwabe
 */
public class HelloWorldFX extends Application
{
   
   /**
    * 
    * Startet die JavaFX-Runtime.
    *
    * @param args Keine Verwendung.
    */
   public static void main(String[] args)
   {
      launch(args);
   }
   
   /**
    * Wird durch JavaFX-Runtime nach dem Aufruf der init-Methode aufgerufen.
    * Dient der Initialisierung der primaryStage.
    */
   @Override
   public void start(Stage primaryStage) throws Exception
   {
      Label label = new Label("Hello World!");      
      Scene scene = new Scene(label);      
      primaryStage.setTitle("Hello World!");
      primaryStage.setScene(scene);
      //primaryStage.setFullScreen(true); //In Fullscreen-Modus starten
      primaryStage.setMaximized(true); //In maximierten Zustand starten
      label.setAlignment(Pos.CENTER); //Label zentrieren
      primaryStage.show();
   }
}