package application;

import java.io.File;
import java.io.PrintStream;

import exception.InvalidSourceException;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
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
      try
      {
         if(primaryStage == null) 
         {
            throw new InvalidSourceException("HelloWorldFX.start: Ungültige Null-Referenz übergeben!");
         }
         Label label = new Label("Hello World!");      
         Scene scene = new Scene(label);      
         primaryStage.setTitle("Hello World!");
         primaryStage.setScene(scene);
         //primaryStage.setFullScreen(true); //In Fullscreen-Modus starten
         primaryStage.setMaximized(true); //In maximierten Zustand starten
         label.setAlignment(Pos.CENTER); //Label zentrieren
         primaryStage.show();
      }
      catch (InvalidSourceException e)
      {
         Alert alert = new Alert(AlertType.ERROR, e.getMessage(), ButtonType.OK);
         alert.setResizable(true);
         alert.showAndWait();
      }
      catch (Exception e)
      {
         Alert alert =
               new Alert(AlertType.ERROR, "Unbekannter Fehler!", ButtonType.OK);
         alert.setResizable(true);
         alert.showAndWait();
         try 
         {
            String logFile = System.getProperty("user.home") +
                  File.separatorChar + getClass().getSimpleName() + ".log";
            e.printStackTrace(new PrintStream(logFile));
            alert.setAlertType(AlertType.INFORMATION);
            alert.setContentText("Log-Datei unter " + logFile + " erstellt!");
            alert.showAndWait();
         }
         catch(Exception e1)
         {
            alert.setContentText("Fehler beim Erstellen der Log-Datei!");
            alert.showAndWait();
         }
      }
   }
}