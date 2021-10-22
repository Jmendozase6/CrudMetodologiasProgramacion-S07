/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Jhair
 */
public class Conexion {

    Connection connect = null;

    public Connection getConnection() {

        try {

            Class.forName("org.gjt.mm.mysql.Driver");
            connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "02658817");

        } catch (Exception e) {

            System.err.println(e.getMessage());

        }
        return connect;
    }

}
