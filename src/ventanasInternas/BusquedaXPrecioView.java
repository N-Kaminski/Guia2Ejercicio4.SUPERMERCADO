/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasInternas;

import guia2video.pkgsuper.MenuView;
import guia2video.pkgsuper.Producto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alesio
 */
public class BusquedaXPrecioView extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    /**
     * Creates new form BusquedaXPrecioView
     */
    public BusquedaXPrecioView() {
        initComponents();
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtPrecioEInicial = new javax.swing.JTextField();
        jtPrecioEFinal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtListaXPrecio = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista por Precio");

        jLabel2.setText("Entre $:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("y");

        jtPrecioEInicial.setText("0");
        jtPrecioEInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPrecioEInicialKeyReleased(evt);
            }
        });

        jtPrecioEFinal.setText("0");
        jtPrecioEFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPrecioEFinalKeyReleased(evt);
            }
        });

        jtListaXPrecio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtListaXPrecio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jtPrecioEInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPrecioEFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPrecioEInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jtPrecioEFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jtPrecioEInicialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioEInicialKeyReleased
        // TODO add your handling code here:
        if (jtPrecioEInicial.getText().equals("") || jtPrecioEFinal.getText().equals("")) {
        } else {
            borrarFilas();
            try {
                double pi = Double.parseDouble(jtPrecioEInicial.getText());
                double pf = Double.parseDouble(jtPrecioEFinal.getText());

                for (Producto prod : MenuView.listaProductos) {

                    if (prod.getPrecio() >= pi && prod.getPrecio() <= pf) {
                        modelo.addRow(new Object[]{prod.getCodigo(), prod.getDescripcion(), prod.getPrecio(), prod.getStock()});
                    }
                }
            } catch (NumberFormatException er) {
                JOptionPane.showMessageDialog(this, "Ingrese numeros");
            }
        }
    }//GEN-LAST:event_jtPrecioEInicialKeyReleased

    private void jtPrecioEFinalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioEFinalKeyReleased
        // TODO add your handling code here:
        if (jtPrecioEInicial.getText().equals("") || jtPrecioEFinal.getText().equals("")) {
        } else {
            borrarFilas();
            try {
                double pi = Double.parseDouble(jtPrecioEInicial.getText());
                double pf = Double.parseDouble(jtPrecioEFinal.getText());

                for (Producto prod : MenuView.listaProductos) {

                    if (prod.getPrecio() >= pi && prod.getPrecio() <= pf) {
                        modelo.addRow(new Object[]{prod.getCodigo(), prod.getDescripcion(), prod.getPrecio(), prod.getStock()});
                    }
                }
            } catch (NumberFormatException err) {
                JOptionPane.showMessageDialog(this, "Ingrese numeros");
            }
        }
    }//GEN-LAST:event_jtPrecioEFinalKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jtListaXPrecio;
    private javax.swing.JTextField jtPrecioEFinal;
    private javax.swing.JTextField jtPrecioEInicial;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        jtListaXPrecio.setModel(modelo);
    }

    private void borrarFilas() {
        int fila = jtListaXPrecio.getRowCount() - 1;
        for (int f = fila; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

}
