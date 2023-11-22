/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presentacion.views;

import ControlErrores.ControlErrores;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Servicios;
import presentacion.logica.ServiciosVista;

/**
 *
 * @author Dev
 */
public class ServiciosP extends javax.swing.JPanel {

    private int idServicio;
    private ServiciosVista vista;
    private ControlErrores e;

    /**
     * Creates new form Principal
     */
    public ServiciosP() {
        initComponents();
        llenarTablaServicios();
    }

    public ServiciosVista getVista() {

        vista = new ServiciosVista();

        return vista;
    }

    public ControlErrores getE() {
        e = new ControlErrores();
        return e;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelbackprincipal = new javax.swing.JPanel();
        jlabelHead = new javax.swing.JLabel();
        jPaneltabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaServicios = new javax.swing.JTable();
        jPanelform = new javax.swing.JPanel();
        jLabelnombre = new javax.swing.JLabel();
        jTextFieldnombre = new javax.swing.JTextField();
        jLabelvalor = new javax.swing.JLabel();
        jTextFieldvalor = new javax.swing.JTextField();
        jLabeldescripcion = new javax.swing.JLabel();
        jScrollPanedescripcion = new javax.swing.JScrollPane();
        jTextAreadescripcion = new javax.swing.JTextArea();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(910, 430));
        setPreferredSize(new java.awt.Dimension(910, 430));

        jPanelbackprincipal.setBackground(new java.awt.Color(51, 51, 255));

        jlabelHead.setBackground(new java.awt.Color(255, 255, 255));
        jlabelHead.setForeground(new java.awt.Color(255, 255, 255));
        jlabelHead.setText("ESTE ES UN TITULO CUARQUIERA");

        jPaneltabla.setBackground(new java.awt.Color(255, 255, 255));

        tablaServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaServiciosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaServicios);

        javax.swing.GroupLayout jPaneltablaLayout = new javax.swing.GroupLayout(jPaneltabla);
        jPaneltabla.setLayout(jPaneltablaLayout);
        jPaneltablaLayout.setHorizontalGroup(
            jPaneltablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneltablaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPaneltablaLayout.setVerticalGroup(
            jPaneltablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneltablaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelnombre.setText("Nombre servicio");

        jLabelvalor.setText("Valor servicio");

        jTextFieldvalor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldvalorKeyTyped(evt);
            }
        });

        jLabeldescripcion.setText("Descripción servicio");

        jTextAreadescripcion.setColumns(20);
        jTextAreadescripcion.setRows(5);
        jScrollPanedescripcion.setViewportView(jTextAreadescripcion);

        jButtonInsert.setText("Insertar");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Actualizar");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Eliminar");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelformLayout = new javax.swing.GroupLayout(jPanelform);
        jPanelform.setLayout(jPanelformLayout);
        jPanelformLayout.setHorizontalGroup(
            jPanelformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelformLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelformLayout.createSequentialGroup()
                        .addComponent(jLabelnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addComponent(jTextFieldnombre)
                    .addGroup(jPanelformLayout.createSequentialGroup()
                        .addComponent(jLabelvalor, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                        .addGap(53, 53, 53))
                    .addComponent(jTextFieldvalor))
                .addGap(18, 18, 18)
                .addGroup(jPanelformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPanedescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addComponent(jLabeldescripcion))
                .addGap(18, 18, 18)
                .addGroup(jPanelformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonInsert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelformLayout.setVerticalGroup(
            jPanelformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelformLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelformLayout.createSequentialGroup()
                        .addGroup(jPanelformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelnombre)
                            .addComponent(jLabeldescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPanedescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelformLayout.createSequentialGroup()
                                .addComponent(jTextFieldnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelvalor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelformLayout.createSequentialGroup()
                        .addComponent(jButtonInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonUpdate)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelbackprincipalLayout = new javax.swing.GroupLayout(jPanelbackprincipal);
        jPanelbackprincipal.setLayout(jPanelbackprincipalLayout);
        jPanelbackprincipalLayout.setHorizontalGroup(
            jPanelbackprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelbackprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPaneltabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelbackprincipalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlabelHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(466, 466, 466))
            .addGroup(jPanelbackprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelbackprincipalLayout.setVerticalGroup(
            jPanelbackprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbackprincipalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jlabelHead, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPaneltabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelbackprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelbackprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        Servicios servicio;

        servicio = new Servicios();

        if (getE().isValidString(jTextFieldvalor.getText()) && getE().isValidString(jTextFieldnombre.getText()) && getE().isValidString(jTextAreadescripcion.getText())) {
            double valor;

            valor = Double.parseDouble(jTextFieldvalor.getText());

            servicio.setDescripcion(jTextAreadescripcion.getText());
            servicio.setNombre_servicio(jTextFieldnombre.getText());
            servicio.setValor(valor);

            getVista().insertarServicio(servicio);

            limpiarCampos();
            llenarTablaServicios();

        } else {
            String mensajeError;

            mensajeError = "";

            if (!getE().isValidString(jTextFieldnombre.getText())) {
                mensajeError = "El nombre del servicio esta vacio";
            }
            if (!getE().isValidString(jTextFieldvalor.getText())) {
                mensajeError = "El valor esta vacio";
            }
            if (!getE().isValidString(jTextAreadescripcion.getText())) {
                mensajeError = "La descripcion esta vacia";
            }

            JOptionPane.showMessageDialog(null, mensajeError);
        }
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jTextFieldvalorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldvalorKeyTyped
        char c;
        c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_jTextFieldvalorKeyTyped

    private void tablaServiciosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaServiciosMousePressed

        if (evt.getClickCount() == 1) {
            if (tablaServicios.getSelectedRowCount() > 0) {

                int in;
                int op;

                String[] opc = {"Actualizar", "Eliminar"};
                in = 0;

                op = JOptionPane.showOptionDialog(
                        null,
                        "Que desea realizar",
                        "Operaciones",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        opc,
                        null
                );

                if (opc[op].equalsIgnoreCase("Actualizar")) {
                    idServicio = Integer.parseInt(tablaServicios.getValueAt(tablaServicios.getSelectedRow(), in++).toString());
                    jTextFieldnombre.setText(tablaServicios.getValueAt(tablaServicios.getSelectedRow(), in++).toString());
                    jTextAreadescripcion.setText(tablaServicios.getValueAt(tablaServicios.getSelectedRow(), in++).toString());
                    jTextFieldvalor.setText(tablaServicios.getValueAt(tablaServicios.getSelectedRow(), in++).toString());
                    jButtonInsert.setEnabled(false);
                    jButtonDelete.setEnabled(false);
                }
                if (opc[op].equalsIgnoreCase("Eliminar")) {
                    idServicio = Integer.parseInt(tablaServicios.getValueAt(tablaServicios.getSelectedRow(), in++).toString());
                    jTextFieldnombre.setText(tablaServicios.getValueAt(tablaServicios.getSelectedRow(), in++).toString());
                    jTextAreadescripcion.setText(tablaServicios.getValueAt(tablaServicios.getSelectedRow(), in++).toString());
                    jTextFieldvalor.setText(tablaServicios.getValueAt(tablaServicios.getSelectedRow(), in++).toString());
                    jButtonInsert.setEnabled(false);
                    jButtonUpdate.setEnabled(false);
                }

            }
        }
    }//GEN-LAST:event_tablaServiciosMousePressed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        Servicios servicio;
        String mensajeError;

        servicio = new Servicios();
        mensajeError = "";

        if (idServicio == 0) {
            mensajeError = "Debe seleccionar un servicio para actualizar";
            JOptionPane.showMessageDialog(null, mensajeError);
        } else {

            double valor;

            valor = Double.parseDouble(jTextFieldvalor.getText());

            servicio.setDescripcion(jTextAreadescripcion.getText());
            servicio.setNombre_servicio(jTextFieldnombre.getText());
            servicio.setValor(valor);
            servicio.setId_servcio(idServicio);

            getVista().actulizarServicio(servicio);

            limpiarCampos();
            llenarTablaServicios();
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        limpiarCampos();
        jButtonInsert.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jButtonUpdate.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed

        String mensajeError;

        mensajeError = "";

        if (idServicio == 0) {
            mensajeError = "Debe seleccionar un servicio para eliminar";
            JOptionPane.showMessageDialog(null, mensajeError);
        } else {
            JOptionPane.showMessageDialog(null, "esta deshabilidata por el momento");
        }

    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void llenarTablaServicios() {

        DefaultTableModel modelo;
        modelo = (DefaultTableModel) tablaServicios.getModel();
        modelo = getVista().Listaservicios();
        tablaServicios.setModel(modelo);
    }

    private void limpiarCampos() {
        jTextFieldnombre.setText("");
        jTextFieldvalor.setText("");
        jTextAreadescripcion.setText("");
        idServicio = 0;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabeldescripcion;
    private javax.swing.JLabel jLabelnombre;
    private javax.swing.JLabel jLabelvalor;
    private javax.swing.JPanel jPanelbackprincipal;
    private javax.swing.JPanel jPanelform;
    private javax.swing.JPanel jPaneltabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPanedescripcion;
    private javax.swing.JTextArea jTextAreadescripcion;
    private javax.swing.JTextField jTextFieldnombre;
    private javax.swing.JTextField jTextFieldvalor;
    private javax.swing.JLabel jlabelHead;
    private javax.swing.JTable tablaServicios;
    // End of variables declaration//GEN-END:variables
}