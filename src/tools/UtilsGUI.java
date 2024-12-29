/*
 * Clase: UtilsGUI.java
 * Fecha: 15/08/2013
 *
 * Desarrollador: Carlos Cortés Bazán
 * 
 * Descripción: Clase que contiene utilerías para intercaces graficas.
 *
 * Nota: debido a que ésta clase es estática, no es necesario crear un objeto
 *       de ella, solo se usa directamente.
 *
 */


package tools;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.BalloonTipStyle;
import net.java.balloontip.styles.RoundedBalloonStyle;

public class UtilsGUI {
     
    //Para el LookAndFeel
    public static String LOOK = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
    
    // EXCEPCIONES
    public static String UB_LOOK = "Error al cargar el LookAndFeel.";
    
    static BalloonTip myBalloonTipTxt;              // Para mostrar los globos de dialogo en cajas de texto
       
    // Aplica el LookAndFeel a un JFrame
    public static void setLookAndFeel (JFrame frame){
        try{
            UIManager.setLookAndFeel(LOOK);
            SwingUtilities.updateComponentTreeUI((Component)frame);
            frame.pack();
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            System.out.println("Error " + UB_LOOK + "\n\n" +
                    ex.getMessage()  + "\n\nUbicación: " + "setLookAndFeel");
        }
    }
    
    // Aplica el LookAndFeel a un JDialog
    public static void setLookAndFeel (JDialog frame){
        try{
            UIManager.setLookAndFeel(LOOK);
            SwingUtilities.updateComponentTreeUI((Component)frame);
            frame.pack();
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            System.out.println("Error " + UB_LOOK + "\n\n" +
                    ex.getMessage()  + "\n\nUbicación: " + "setLookAndFeel");
        }
    }
    
    public static void showBallonTxt(JTextField txtComponente){
        hideBallonTxt();
        if (txtComponente.getText().trim().length() > 0){
            if (txtComponente.getHorizontalVisibility().getMaximum() > txtComponente.getHorizontalVisibility().getExtent() + 1){
                BalloonTipStyle style = new RoundedBalloonStyle(5,5,Color.YELLOW, Color.BLACK);
                myBalloonTipTxt = new BalloonTip(txtComponente, txtComponente.getText(), style, false);
            }
        }
    }
    
    public static void showBallonAviso(JComponent componente, String texto, boolean isBeep){
        hideBallonTxt();
        BalloonTipStyle style = new RoundedBalloonStyle(5,5,Color.YELLOW, Color.BLACK);
        myBalloonTipTxt = new BalloonTip(componente, texto, style, false);

        if (isBeep)
            java.awt.Toolkit.getDefaultToolkit().beep();
    }
    
    public static void hideBallonTxt(){
        if (myBalloonTipTxt != null)
            if (myBalloonTipTxt.isVisible())
                myBalloonTipTxt.setVisible(false);
    }    
}