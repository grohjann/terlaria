package akkgframework.control.fundamental;

import akkgframework.control.fundamental.UIController;
import control.Config;
import akkgframework.view.DrawFrame;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Diese Klasse enthält die main-Methode. Von ihr wird als erstes ein Objekt innerhalb der main-Methode erzeugt,
 * die zu Programmstart aufgerufen wird und kein Objekt benötigt, da sie statisch ist.
 * Die erste Methode, die also nach der main-Methode aufgerufen wird, ist der Konstruktor dieser Klasse. Aus ihm
 * wird alles weitere erzeugt.
 * Vorgegebene Klasse des Frameworks. Modifikation auf eigene Gefahr.
 */
public class MainController {

    /**
     * Der Konstruktor der Klasse-MainController ist die erste Methode, die nach der Main-Methode
     * aufgerufen wird. Hier wird der Programmfluss geregelt.
     */
    public MainController(){
        if ( Config.INFO_MESSAGES) System.out.println("  > MainController: Ich wurde erzeugt. Erstelle Fenster (Drawframe-Objekt)...");
        // Berechne Mitte des Bildschirms
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = Config.WINDOW_WIDTH;
        int height = Config.WINDOW_HEIGHT;
        // Berechne die beste obere linke Ecke für das Fenster so, dass es genau mittig erscheint
        // Erzeuge ein neues Fenster zum Zeichnen
        DrawFrame drawFrame = new DrawFrame(Config.WINDOW_TITLE,0,0, width, height);
        drawFrame.setResizable(false);
        try {
            drawFrame.setIconImage(ImageIO.read(new File("assets/images/interface/fav_icon.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Übergibt den weiteren Programmfluss an das neue Objekt der Klasse UIController
        if ( Config.INFO_MESSAGES) System.out.println("  > MainController: Erzeuge UIController und übergebe Drawframe-Objekt-Referenz.");
        new UIController(drawFrame);
    }

}
