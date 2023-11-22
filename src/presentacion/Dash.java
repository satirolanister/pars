/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import presentacion.views.Eventos;
import presentacion.views.ServiciosP;

/**
 *
 * @author Dev
 */
public class Dash extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Dash() {
        initComponents();
        initComponet();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackgrond = new javax.swing.JPanel();
        jPanelvertical = new javax.swing.JPanel();
        jButtonPrincipal = new javax.swing.JButton();
        jButtonEventos = new javax.swing.JButton();
        jButtonServicios = new javax.swing.JButton();
        jPanelhorizontal = new javax.swing.JPanel();
        jpanelContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1060, 570));

        panelBackgrond.setBackground(new java.awt.Color(255, 255, 255));

        jPanelvertical.setBackground(java.awt.Color.blue);

        jButtonPrincipal.setText("PRINCIPAL");
        jButtonPrincipal.setBorder(null);
        jButtonPrincipal.setBorderPainted(false);
        jButtonPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrincipalActionPerformed(evt);
            }
        });

        jButtonEventos.setText("EVENTOS");
        jButtonEventos.setBorder(null);
        jButtonEventos.setBorderPainted(false);
        jButtonEventos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEventosActionPerformed(evt);
            }
        });

        jButtonServicios.setText("SERVICIOS");
        jButtonServicios.setBorder(null);
        jButtonServicios.setBorderPainted(false);
        jButtonServicios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonServiciosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelverticalLayout = new javax.swing.GroupLayout(jPanelvertical);
        jPanelvertical.setLayout(jPanelverticalLayout);
        jPanelverticalLayout.setHorizontalGroup(
            jPanelverticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonEventos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonServicios, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        jPanelverticalLayout.setVerticalGroup(
            jPanelverticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelverticalLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jButtonPrincipal)
                .addGap(11, 11, 11)
                .addComponent(jButtonServicios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEventos)
                .addContainerGap(348, Short.MAX_VALUE))
        );

        jPanelhorizontal.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout jPanelhorizontalLayout = new javax.swing.GroupLayout(jPanelhorizontal);
        jPanelhorizontal.setLayout(jPanelhorizontalLayout);
        jPanelhorizontalLayout.setHorizontalGroup(
            jPanelhorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        jPanelhorizontalLayout.setVerticalGroup(
            jPanelhorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );

        jpanelContenido.setBackground(new java.awt.Color(255, 255, 255));
        jpanelContenido.setMinimumSize(new java.awt.Dimension(910, 0));
        jpanelContenido.setPreferredSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout jpanelContenidoLayout = new javax.swing.GroupLayout(jpanelContenido);
        jpanelContenido.setLayout(jpanelContenidoLayout);
        jpanelContenidoLayout.setHorizontalGroup(
            jpanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpanelContenidoLayout.setVerticalGroup(
            jpanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBackgrondLayout = new javax.swing.GroupLayout(panelBackgrond);
        panelBackgrond.setLayout(panelBackgrondLayout);
        panelBackgrondLayout.setHorizontalGroup(
            panelBackgrondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgrondLayout.createSequentialGroup()
                .addComponent(jPanelvertical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBackgrondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelhorizontal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBackgrondLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jpanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE))))
        );
        panelBackgrondLayout.setVerticalGroup(
            panelBackgrondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelvertical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBackgrondLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanelhorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackgrond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackgrond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrincipalActionPerformed
        showJpanel(new Principal());
    }//GEN-LAST:event_jButtonPrincipalActionPerformed

    private void jButtonEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEventosActionPerformed
        showJpanel(new Eventos());
    }//GEN-LAST:event_jButtonEventosActionPerformed

    private void jButtonServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonServiciosActionPerformed
         showJpanel(new ServiciosP());
    }//GEN-LAST:event_jButtonServiciosActionPerformed

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
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dash().setVisible(true);
            }
        });
    }
    
    private void initComponet()
    {
       showJpanel(new Principal());
    }
    
    private void showJpanel(JPanel p)
    {
        p.setSize(910,430);
        p.setLocation(0, 0);
        jpanelContenido.removeAll();
        jpanelContenido.add(p,BorderLayout.CENTER);
        jpanelContenido.revalidate();
        jpanelContenido.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEventos;
    private javax.swing.JButton jButtonPrincipal;
    private javax.swing.JButton jButtonServicios;
    private javax.swing.JPanel jPanelhorizontal;
    private javax.swing.JPanel jPanelvertical;
    private javax.swing.JPanel jpanelContenido;
    private javax.swing.JPanel panelBackgrond;
    // End of variables declaration//GEN-END:variables
}
