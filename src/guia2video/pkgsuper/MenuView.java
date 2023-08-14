/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2video.pkgsuper;

import ventanasInternas.*;
import java.awt.Color;
import java.util.*;

/**
 *
 * @author Nicolas Kaminski
 */
public class MenuView extends javax.swing.JFrame {

    public static TreeSet<Producto> listaProductos = new TreeSet<>();

    /**
     * Creates new form MenuView
     */
    public MenuView() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAdmin = new javax.swing.JMenu();
        jmAdminProductos = new javax.swing.JMenuItem();
        jmConsultasRubro = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jmConsultasNombre = new javax.swing.JMenuItem();
        jmConsultasPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 600));

        javax.swing.GroupLayout jdEscritorioLayout = new javax.swing.GroupLayout(jdEscritorio);
        jdEscritorio.setLayout(jdEscritorioLayout);
        jdEscritorioLayout.setHorizontalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );
        jdEscritorioLayout.setVerticalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jmAdmin.setText("Administracion");

        jmAdminProductos.setText("Productos");
        jmAdmin.add(jmAdminProductos);

        jMenuBar1.add(jmAdmin);

        jmConsultasRubro.setText("Consultas");

        jMenuItem2.setText("Por Rubro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmConsultasRubro.add(jMenuItem2);

        jmConsultasNombre.setText("Por Nombre");
        jmConsultasNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultasNombreActionPerformed(evt);
            }
        });
        jmConsultasRubro.add(jmConsultasNombre);

        jmConsultasPrecio.setText("Por Precio");
        jmConsultasPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultasPrecioActionPerformed(evt);
            }
        });
        jmConsultasRubro.add(jmConsultasPrecio);

        jMenuBar1.add(jmConsultasRubro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio)
        );

        jdEscritorio.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmConsultasPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultasPrecioActionPerformed
        // TODO add your handling code here:
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        BusquedaXPrecioView bxp = new BusquedaXPrecioView();
        bxp.setVisible(true);
        jdEscritorio.add(bxp);
        jdEscritorio.moveToFront(bxp);
    }//GEN-LAST:event_jmConsultasPrecioActionPerformed

    private void jmConsultasNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultasNombreActionPerformed
        // TODO add your handling code here:
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        BusquedaXNombreView bxn = new BusquedaXNombreView();
        bxn.setVisible(true);
        jdEscritorio.add(bxn);
        jdEscritorio.moveToFront(bxn);
    }//GEN-LAST:event_jmConsultasNombreActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        BusquedaXRubroView bxr = new BusquedaXRubroView();
        bxr.setVisible(true);
        jdEscritorio.add(bxr);
        jdEscritorio.moveToFront(bxr);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JDesktopPane jdEscritorio;
    private javax.swing.JMenu jmAdmin;
    private javax.swing.JMenuItem jmAdminProductos;
    private javax.swing.JMenuItem jmConsultasNombre;
    private javax.swing.JMenuItem jmConsultasPrecio;
    private javax.swing.JMenu jmConsultasRubro;
    // End of variables declaration//GEN-END:variables

    private void cargarProductos() {

        // listaProductos.add(new Producto(10, 100, "Azucar", 23.6, Categoria.COMESTIBLE));
    }

   
    
}
