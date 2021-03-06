/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import clases.Producto;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import opciones.Opciones;

/**
 *
 * @author Jhair
 */
public class FrmProductos extends javax.swing.JFrame {

    /**
     * Creates new form FrmProductos
     */
    Producto pr = new Producto();
    DefaultTableModel modelo;
    ResultSet rsProducto;
    Opciones op = new Opciones();

    public FrmProductos() {
        initComponents();
        mostrarDatos();
        editarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtIdProducto = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtCategoria = new javax.swing.JTextField();
        jtxtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtStock = new javax.swing.JTextField();
        jbtnAgregar = new javax.swing.JButton();
        jbtnNuevo = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jtblProductos.setBackground(new java.awt.Color(51, 51, 51));
        jtblProductos.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jtblProductos.setForeground(new java.awt.Color(255, 255, 255));
        jtblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Producto", "Nombre", "Categor??a", "Precio", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblProductos.setGridColor(new java.awt.Color(204, 204, 204));
        jtblProductos.setRowHeight(30);
        jtblProductos.setRowMargin(3);
        jtblProductos.setShowGrid(true);
        jtblProductos.getTableHeader().setResizingAllowed(false);
        jtblProductos.getTableHeader().setReorderingAllowed(false);
        jtblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblProductosMouseClicked(evt);
            }
        });
        jtblProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtblProductosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtblProductos);
        if (jtblProductos.getColumnModel().getColumnCount() > 0) {
            jtblProductos.getColumnModel().getColumn(0).setResizable(false);
            jtblProductos.getColumnModel().getColumn(0).setPreferredWidth(20);
            jtblProductos.getColumnModel().getColumn(1).setResizable(false);
            jtblProductos.getColumnModel().getColumn(2).setResizable(false);
            jtblProductos.getColumnModel().getColumn(3).setResizable(false);
            jtblProductos.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE PRODUCTOS");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL PRODUCTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id Producto");

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Categor??a");

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio");

        jtxtIdProducto.setBackground(new java.awt.Color(204, 204, 255));
        jtxtIdProducto.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jtxtIdProducto.setForeground(new java.awt.Color(0, 0, 0));
        jtxtIdProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), null));
        jtxtIdProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtxtIdProducto.setFocusable(false);
        jtxtIdProducto.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jtxtNombre.setBackground(new java.awt.Color(204, 204, 255));
        jtxtNombre.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(0, 0, 0));
        jtxtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), null));
        jtxtNombre.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jtxtNombre.setMinimumSize(new java.awt.Dimension(64, 30));

        jtxtCategoria.setBackground(new java.awt.Color(204, 204, 255));
        jtxtCategoria.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jtxtCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jtxtCategoria.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), null));
        jtxtCategoria.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jtxtCategoria.setMinimumSize(new java.awt.Dimension(64, 30));

        jtxtPrecio.setBackground(new java.awt.Color(204, 204, 255));
        jtxtPrecio.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jtxtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), null));
        jtxtPrecio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jtxtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPrecioKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Stock");

        jtxtStock.setBackground(new java.awt.Color(204, 204, 255));
        jtxtStock.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jtxtStock.setForeground(new java.awt.Color(0, 0, 0));
        jtxtStock.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), null));
        jtxtStock.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jtxtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtStockKeyTyped(evt);
            }
        });

        jbtnAgregar.setBackground(new java.awt.Color(153, 255, 255));
        jbtnAgregar.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        jbtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgAgregar.png"))); // NOI18N
        jbtnAgregar.setText(" AGREGAR");
        jbtnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });

        jbtnNuevo.setBackground(new java.awt.Color(153, 255, 255));
        jbtnNuevo.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnNuevo.setForeground(new java.awt.Color(0, 0, 0));
        jbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgAgregar.png"))); // NOI18N
        jbtnNuevo.setText(" NUEVO");
        jbtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });

        jbtnModificar.setBackground(new java.awt.Color(153, 255, 255));
        jbtnModificar.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnModificar.setForeground(new java.awt.Color(0, 0, 0));
        jbtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgAgregar.png"))); // NOI18N
        jbtnModificar.setText(" MODIFICAR");
        jbtnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        jbtnEliminar.setBackground(new java.awt.Color(153, 255, 255));
        jbtnEliminar.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jbtnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgAgregar.png"))); // NOI18N
        jbtnEliminar.setText("ELIMINAR");
        jbtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtIdProducto)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtPrecio)
                    .addComponent(jtxtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(jbtnNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgMinimizar.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgCerrar.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(162, 162, 162)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void mostrarDatos() {
        try {

            rsProducto = pr.listarProductos();
            Object[] productos = new Object[5];
            modelo = (DefaultTableModel) jtblProductos.getModel();

            while (rsProducto.next()) {
                productos[0] = rsProducto.getInt("IdProducto");
                productos[1] = rsProducto.getString("Nombre");
                productos[2] = rsProducto.getString("Categoria");
                productos[3] = rsProducto.getDouble("Precio");
                productos[4] = rsProducto.getInt("Stock");
                modelo.addRow(productos);
            }
            jtblProductos.setModel(modelo);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private boolean verificarCampos() {
        if (jtxtNombre.getText().isEmpty()) {
            return false;
        } else if (jtxtCategoria.getText().isEmpty()) {
            return false;
        } else if (jtxtPrecio.getText().isEmpty()) {
            return false;
        } else if (jtxtStock.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
        FrmAgregarProducto frmAG = new FrmAgregarProducto();
        frmAG.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        jtxtCategoria.setText("");
        jtxtIdProducto.setText("");
        jtxtNombre.setText("");
        jtxtPrecio.setText("");
        jtxtStock.setText("");
        jtxtNombre.requestFocus();
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed

        try {
            pr.setIdProducto(Integer.parseInt(jtxtIdProducto.getText()));
            if (pr.getIdProducto() < 0) {
                
            } else {
                if (JOptionPane.showConfirmDialog(null, "??Seguro que desea eliminar?", "Comprobaci??n", 0) == 0) {
                    pr.eliminar(pr.getIdProducto());
                    LimpiarTabla();
                    mostrarDatos();
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No seleccion?? ninguna fila", "Error", 0);
        }

    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void LimpiarTabla() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) jtblProductos.getModel();
            int filas = jtblProductos.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }

    }

    private void jtblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblProductosMouseClicked
        mostrarProducto();
    }//GEN-LAST:event_jtblProductosMouseClicked

    private void jtblProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtblProductosKeyReleased
        mostrarProducto();
    }//GEN-LAST:event_jtblProductosKeyReleased

    private void jtxtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPrecioKeyTyped
        pr.admitirSoloDigitos(evt);
    }//GEN-LAST:event_jtxtPrecioKeyTyped

    private void jtxtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtStockKeyTyped
        pr.admitirSoloDigitos(evt);
    }//GEN-LAST:event_jtxtStockKeyTyped

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        op.minimizarPrograma(this);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        op.cerrarPrograma();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void editarTabla() {
        jtblProductos.getTableHeader().setFont(new Font("Montserrat Medium", 1, 16));
        jtblProductos.getTableHeader().setForeground(Color.BLACK);
    }

    private void mostrarProducto() {
        int nfila = jtblProductos.getSelectedRow();
        if (nfila == -1) {
            JOptionPane.showMessageDialog(rootPane, "No seleccion?? ninguna fila", "Error", 2);
        } else {
            jtxtIdProducto.setText(jtblProductos.getValueAt(nfila, 0).toString());
            jtxtNombre.setText(jtblProductos.getValueAt(nfila, 1).toString());
            jtxtCategoria.setText(jtblProductos.getValueAt(nfila, 2).toString());
            jtxtPrecio.setText(jtblProductos.getValueAt(nfila, 3).toString());
            jtxtStock.setText(jtblProductos.getValueAt(nfila, 4).toString());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JTable jtblProductos;
    private javax.swing.JTextField jtxtCategoria;
    private javax.swing.JTextField jtxtIdProducto;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtPrecio;
    private javax.swing.JTextField jtxtStock;
    // End of variables declaration//GEN-END:variables
}
