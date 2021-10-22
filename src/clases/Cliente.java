/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhair
 */
public class Cliente {

    private int idCliente;
    private String nombre;
    private int contacto;
    private String direccion;
    private int telefono;

    private Conexion cn;
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;

    public Cliente() {
        cn = new Conexion();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ResultSet listarClientes() throws SQLException {

        String consulta = "SELECT * FROM clientes";

        con = cn.getConnection();
        st = (Statement) con.createStatement();
        rs = st.executeQuery(consulta);
        return rs;
    }

}
