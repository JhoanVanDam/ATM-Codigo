/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;

/**
 *
 * @author Jhoan
 */
public class Background extends javax.swing.JPanel {

    /**
     * Creates new form Background
     */
    public Background() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        Menuborde = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Mover.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Mover.png"))); // NOI18N
        jLabel4.setText("jLabel3");
        jLabel4.setPreferredSize(new java.awt.Dimension(20, 20));
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel4MouseDragged(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, -1));

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Minimize.png"))); // NOI18N
        Minimizar.setText("jLabel2");
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        jPanel2.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 20, 20));

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/InterfazClave/Exit2.png"))); // NOI18N
        Salir.setText("jLabel2");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });
        jPanel2.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 20, 20));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 20));

        Menuborde.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setText("Pepito ");

        jLabel3.setText("Perez");

        javax.swing.GroupLayout MenubordeLayout = new javax.swing.GroupLayout(Menuborde);
        Menuborde.setLayout(MenubordeLayout);
        MenubordeLayout.setHorizontalGroup(
            MenubordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenubordeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenubordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        MenubordeLayout.setVerticalGroup(
            MenubordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenubordeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(408, Short.MAX_VALUE))
        );

        add(Menuborde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 120, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if(this.Menuborde.isVisible()==true){
            this.Menuborde.setVisible(false);
        }else{
            this.Menuborde.setVisible(true);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseDragged
        this.setLocation(this.getLocation().x + evt.getX()- x ,this.getLocation().y + evt.getY() - y);

    }//GEN-LAST:event_jLabel4MouseDragged
int y,x;
    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_jLabel4MousePressed

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
//        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/InterfazClave/Exit.png")));
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/InterfazClave/Exit2.png")));
    }//GEN-LAST:event_SalirMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menuborde;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}