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
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhair
 */
public class Producto {

    private int idProducto;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    Conexion cn;
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;

    public Producto() {
        cn = new Conexion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.idProducto = IdProducto;
    }

    public ResultSet listarProductos() throws SQLException {
        String consulta = "SELECT * FROM productos";

        con = cn.getConnection();
        st = (Statement) con.createStatement();
        rs = st.executeQuery(consulta);

        return rs;
    }

    public boolean agregarProducto(String nombre, String categoria, double precio, int stock) {

        String SQL = "INSERT INTO productos (Nombre, Categoria, Precio, Stock) values(?,?,?,?)";
        try {
            con = cn.getConnection();
            st = (Statement) con.createStatement();
            ps = (PreparedStatement) con.prepareStatement(SQL);

            ps.setString(1, nombre);
            ps.setString(2, categoria);
            ps.setDouble(3, precio);
            ps.setInt(4, stock);
            ps.executeUpdate();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de registro: " + e.getMessage(), "Error", 0);
            System.out.println(e);
        }
        return false;
    }

    public void eliminar(int eliminar) {
        String SQL = "DELETE FROM productos WHERE IdProducto =" + idProducto;

        try {

            con = cn.getConnection();
            st = (Statement) con.createStatement();
            st.executeUpdate(SQL);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar el elemento: " + e.getMessage(), "Error", 0);

        }
    }

    public void admitirSoloDigitos(KeyEvent evt) {
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < ',' || car > '.')) {
            evt.consume();
        }
    }
}
