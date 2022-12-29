/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import java.awt.Toolkit;
import java.net.URISyntaxException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jhoan
 */
public class Menuopciones1 extends javax.swing.JFrame {

    /**
     * Creates new form Menuopciones1
     */
    public Menuopciones1() {
        initComponents();
        this.setTitle("ATM JhoanV");
        this.setLocationRelativeTo(null);
        this.MenuExpansivo.setVisible(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Recursos/IconoBarraTareas.png")));
        
           }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menus = new javax.swing.JPanel();
        RetiroCuentaRelacionadaAhorros = new javax.swing.JLabel();
        RetiroCuentaAhorros = new javax.swing.JLabel();
        Activaciones = new javax.swing.JLabel();
        RetiroCedulaCafetera = new javax.swing.JLabel();
        RetiroRelacionadaCorriente = new javax.swing.JLabel();
        RetiroCuentaCorriente = new javax.swing.JLabel();
        SelTrans = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Mover = new javax.swing.JLabel();
        MenuExpansivo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Transacciones1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 500, 0, 0));
        setLocation(new java.awt.Point(300, 0));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setName("Menuopciones1"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menus.setBackground(new java.awt.Color(255, 255, 255));
        Menus.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), null));
        Menus.setPreferredSize(new java.awt.Dimension(1024, 768));
        Menus.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MenusMouseDragged(evt);
            }
        });
        Menus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenusMousePressed(evt);
            }
        });
        Menus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RetiroCuentaRelacionadaAhorros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Transacciones/RetiroRelacionadaAhorros.png"))); // NOI18N
        RetiroCuentaRelacionadaAhorros.setText("jLabel1");
        RetiroCuentaRelacionadaAhorros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RetiroCuentaRelacionadaAhorros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetiroCuentaRelacionadaAhorrosMouseClicked(evt);
            }
        });
        Menus.add(RetiroCuentaRelacionadaAhorros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 505, 99));

        RetiroCuentaAhorros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Transacciones/RetiroAhorros.png"))); // NOI18N
        RetiroCuentaAhorros.setText("jLabel1");
        RetiroCuentaAhorros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RetiroCuentaAhorros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetiroCuentaAhorrosMouseClicked(evt);
            }
        });
        Menus.add(RetiroCuentaAhorros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 505, 99));

        Activaciones.setBackground(new java.awt.Color(153, 255, 255));
        Activaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Transacciones/Activaciones.png"))); // NOI18N
        Activaciones.setText("jLabel1");
        Activaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Activaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActivacionesMouseClicked(evt);
            }
        });
        Menus.add(Activaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 505, 99));

        RetiroCedulaCafetera.setBackground(new java.awt.Color(153, 255, 255));
        RetiroCedulaCafetera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Transacciones/RetiroCedulaCafetera.png"))); // NOI18N
        RetiroCedulaCafetera.setText("jLabel1");
        RetiroCedulaCafetera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RetiroCedulaCafetera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetiroCedulaCafeteraMouseClicked(evt);
            }
        });
        Menus.add(RetiroCedulaCafetera, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 505, 99));

        RetiroRelacionadaCorriente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Transacciones/RetiroRelacionadaCorrient.png"))); // NOI18N
        RetiroRelacionadaCorriente.setText("jLabel1");
        RetiroRelacionadaCorriente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RetiroRelacionadaCorriente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetiroRelacionadaCorrienteMouseClicked(evt);
            }
        });
        Menus.add(RetiroRelacionadaCorriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 500, 99));

        RetiroCuentaCorriente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Transacciones/RetiroCorriente.png"))); // NOI18N
        RetiroCuentaCorriente.setText("jLabel1");
        RetiroCuentaCorriente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RetiroCuentaCorriente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetiroCuentaCorrienteMouseClicked(evt);
            }
        });
        Menus.add(RetiroCuentaCorriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 500, 99));

        SelTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Transacciones/Header.png"))); // NOI18N
        SelTrans.setText("jLabel8");
        SelTrans.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Menus.add(SelTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 710, 200));

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Minimize.png"))); // NOI18N
        Minimizar.setText("jLabel2");
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        Menus.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 20, 20));

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
        Menus.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 20, 20));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Logo.png"))); // NOI18N
        Logo.setText("jLabel9");
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoMouseClicked(evt);
            }
        });
        Menus.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 40));

        Mover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Mover.png"))); // NOI18N
        Mover.setText("jLabel10");
        Mover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoverMouseDragged(evt);
            }
        });
        Mover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MoverMousePressed(evt);
            }
        });
        Menus.add(Mover, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 20, 20));

        MenuExpansivo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Perfil");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Salir");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout MenuExpansivoLayout = new javax.swing.GroupLayout(MenuExpansivo);
        MenuExpansivo.setLayout(MenuExpansivoLayout);
        MenuExpansivoLayout.setHorizontalGroup(
            MenuExpansivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuExpansivoLayout.setVerticalGroup(
            MenuExpansivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuExpansivoLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Menus.add(MenuExpansivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 110, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Abajo.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        Menus.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, -1, -1));

        Transacciones1.setBackground(new java.awt.Color(153, 255, 255));
        Transacciones1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Transacciones/Otras.png"))); // NOI18N
        Transacciones1.setText("jLabel1");
        Transacciones1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Transacciones1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Transacciones1MouseClicked(evt);
            }
        });
        Menus.add(Transacciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 500, 99));

        getContentPane().add(Menus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 int x;
 int y;
    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
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

    private void LogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMouseClicked
        this.Navegarpagna("https://github.com/JhoanVanDam");
    }//GEN-LAST:event_LogoMouseClicked

    private void MoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoverMousePressed
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_MoverMousePressed

    private void MoverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoverMouseDragged
        
        this.setLocation(this.getLocation().x + evt.getX()- x ,this.getLocation().y + evt.getY() - y);
        
    }//GEN-LAST:event_MoverMouseDragged

    private void MenusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenusMousePressed
            x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_MenusMousePressed

    private void MenusMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenusMouseDragged
       this.setLocation(this.getLocation().x + evt.getX()- x ,this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_MenusMouseDragged

    private void RetiroCuentaAhorrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetiroCuentaAhorrosMouseClicked
        RetiroCuentaAhorros RetiroAhorros = new RetiroCuentaAhorros();
        this.dispose();
        RetiroAhorros.show(true);
    }//GEN-LAST:event_RetiroCuentaAhorrosMouseClicked

    private void RetiroCuentaCorrienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetiroCuentaCorrienteMouseClicked
        RetiroCuentaCorriente RetiroCorriente = new RetiroCuentaCorriente();
        this.dispose();
        RetiroCorriente.show(true);
    }//GEN-LAST:event_RetiroCuentaCorrienteMouseClicked

    private void RetiroCuentaRelacionadaAhorrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetiroCuentaRelacionadaAhorrosMouseClicked
        RetiroCuentaRelacionadaAhorros RetiroRelacionadaAhorros = new RetiroCuentaRelacionadaAhorros();
        this.dispose();
        RetiroRelacionadaAhorros.show(true);
    }//GEN-LAST:event_RetiroCuentaRelacionadaAhorrosMouseClicked

    private void RetiroRelacionadaCorrienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetiroRelacionadaCorrienteMouseClicked
           RetiroRelacionadaCorriente RetiroRelacionadaCorriente1 = new RetiroRelacionadaCorriente();
           this.dispose();
           RetiroRelacionadaCorriente1.show(true);
    }//GEN-LAST:event_RetiroRelacionadaCorrienteMouseClicked

    private void RetiroCedulaCafeteraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetiroCedulaCafeteraMouseClicked
        RetiroCedulaCafetera RetiroCedulaCafetera1 = new RetiroCedulaCafetera();
        this.dispose();
        RetiroCedulaCafetera1.show(true);
    }//GEN-LAST:event_RetiroCedulaCafeteraMouseClicked

    private void ActivacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActivacionesMouseClicked
              this.Navegarpagna("https://web.facebook.com/JhoanVanDam");
    }//GEN-LAST:event_ActivacionesMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if(this.MenuExpansivo.isVisible()==true){
            this.MenuExpansivo.setVisible(false);
        }else{
            this.MenuExpansivo.setVisible(true);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void Transacciones1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Transacciones1MouseClicked
       Consignar Consig = new Consignar();
       Consig.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_Transacciones1MouseClicked
    
    public void Navegarpagna(String url ){
         if(java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop() ;    
        
        
        try {
            java.net.URI uri = new java.net.URI(url);
            desktop.browse(uri);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Menuopciones1.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (IOException ex) {
                Logger.getLogger(Menuopciones1.class.getName()).log(Level.SEVERE, null, ex);
            }
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
            java.util.logging.Logger.getLogger(Menuopciones1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menuopciones1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menuopciones1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menuopciones1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menuopciones1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Activaciones;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel MenuExpansivo;
    private javax.swing.JPanel Menus;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Mover;
    private javax.swing.JLabel RetiroCedulaCafetera;
    private javax.swing.JLabel RetiroCuentaAhorros;
    private javax.swing.JLabel RetiroCuentaCorriente;
    private javax.swing.JLabel RetiroCuentaRelacionadaAhorros;
    private javax.swing.JLabel RetiroRelacionadaCorriente;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel SelTrans;
    private javax.swing.JLabel Transacciones1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}