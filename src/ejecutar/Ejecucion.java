/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutar;

import formularios.FrmProductos;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author Jhair
 */
public class Ejecucion {

    public static void main(String[] args) {
        try {

            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            FrmProductos frmP = new FrmProductos();
            frmP.setVisible(true);

        } catch (UnsupportedLookAndFeelException e) {

            System.err.println(e.getMessage());

        }
    }
}
