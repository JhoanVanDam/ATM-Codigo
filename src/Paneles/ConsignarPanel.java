/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;

/**
 *
 * @author Jhoan
 */
public class ConsignarPanel extends javax.swing.JPanel {

    /**
     * Creates new form ConsignarPanel
     */
    public ConsignarPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtConsignar1 = new javax.swing.JTextField();
        BtnSiguienteConsignar1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtConsignar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 120, -1));

        BtnSiguienteConsignar1.setText("Siguiente");
        add(BtnSiguienteConsignar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("Valor a consignar");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSiguienteConsignar1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtConsignar1;
    // End of variables declaration//GEN-END:variables
}
