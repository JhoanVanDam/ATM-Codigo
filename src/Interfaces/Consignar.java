    
package Interfaces;

import Clases.ClaseFactura;
import Clases.ConexionDB;
import Clases.MetodosDeDB;

import Clases.Rut;
import java.awt.Color;
import java.awt.Toolkit;

/**
 *
 * @author Jhoan
 */
public class Consignar extends javax.swing.JFrame {

    int c;
    int y, x;
    ConexionDB db = new ConexionDB();
    Rut rut = new Rut();
    Login log = new Login();
    double ValorAConsignar;
    MetodosDeDB MetodosDB = new MetodosDeDB();

    public Consignar() {
        initComponents();
        this.InitComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        MenuUSER = new javax.swing.JPanel();
        MenuUsuario = new javax.swing.JLabel();
        Atras4 = new javax.swing.JLabel();
        Menuborde = new javax.swing.JPanel();
        CerrarSesion = new javax.swing.JLabel();
        Perfil = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        MoverBtn = new javax.swing.JLabel();
        ClavePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        BtnSiguienteClave = new javax.swing.JButton();
        Salir = new javax.swing.JLabel();
        DineroPanel = new javax.swing.JPanel();
        txtDinero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ConsignarPanel = new javax.swing.JPanel();
        DineroConsignar = new javax.swing.JLabel();
        txtConsignar = new javax.swing.JTextField();
        BtnSiguienteConsignar1 = new javax.swing.JButton();
        ConsignarCuenta = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCuentaConsignar = new javax.swing.JTextField();
        BtnSiguienteCuentaConsignar = new javax.swing.JButton();
        ClaveINCORRECTA = new javax.swing.JLabel();
        DineroInsuficiente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelPrincipal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelPrincipalMouseDragged(evt);
            }
        });
        PanelPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelPrincipalMousePressed(evt);
            }
        });
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuUSER.setBackground(new java.awt.Color(255, 255, 255));
        MenuUSER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/usuario (1).png"))); // NOI18N
        MenuUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuUsuarioMouseClicked(evt);
            }
        });
        MenuUSER.add(MenuUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 0, -1, -1));

        Atras4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/atrasnegro.png"))); // NOI18N
        Atras4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Atras4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Atras4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Atras4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Atras4MouseExited(evt);
            }
        });
        MenuUSER.add(Atras4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        PanelPrincipal.add(MenuUSER, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 20));

        Menuborde.setBackground(new java.awt.Color(255, 255, 255));
        Menuborde.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Menuborde.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CerrarSesion.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        CerrarSesion.setText("Cerrar Sesión");
        CerrarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseExited(evt);
            }
        });
        Menuborde.add(CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, 20));

        Perfil.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Perfil.setText("Perfil");
        Perfil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Perfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PerfilMouseEntered(evt);
            }
        });
        Menuborde.add(Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 20));

        PanelPrincipal.add(Menuborde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 180, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/icono9.png"))); // NOI18N
        PanelPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 180, 190));

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Minimize.png"))); // NOI18N
        Minimizar.setText("jLabel2");
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        PanelPrincipal.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 20, 20));

        MoverBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Mover.png"))); // NOI18N
        MoverBtn.setText("jLabel3");
        MoverBtn.setPreferredSize(new java.awt.Dimension(20, 20));
        MoverBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoverBtnMouseDragged(evt);
            }
        });
        MoverBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MoverBtnMousePressed(evt);
            }
        });
        PanelPrincipal.add(MoverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, -1));

        ClavePanel.setBackground(new java.awt.Color(255, 255, 255));
        ClavePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Por favor introduzca su clave");

        BtnSiguienteClave.setText("Enviar");
        BtnSiguienteClave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSiguienteClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteClaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClavePanelLayout = new javax.swing.GroupLayout(ClavePanel);
        ClavePanel.setLayout(ClavePanelLayout);
        ClavePanelLayout.setHorizontalGroup(
            ClavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClavePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClavePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClavePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSiguienteClave)
                .addGap(55, 55, 55))
        );
        ClavePanelLayout.setVerticalGroup(
            ClavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClavePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(BtnSiguienteClave)
                .addContainerGap())
        );

        PanelPrincipal.add(ClavePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 180, 120));

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
        PanelPrincipal.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 20, 20));

        DineroPanel.setBackground(new java.awt.Color(255, 255, 255));
        DineroPanel.setPreferredSize(new java.awt.Dimension(176, 100));

        txtDinero.setEditable(false);
        txtDinero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Usted tiene en su cuenta");

        javax.swing.GroupLayout DineroPanelLayout = new javax.swing.GroupLayout(DineroPanel);
        DineroPanel.setLayout(DineroPanelLayout);
        DineroPanelLayout.setHorizontalGroup(
            DineroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DineroPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(DineroPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DineroPanelLayout.setVerticalGroup(
            DineroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DineroPanelLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        PanelPrincipal.add(DineroPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, -1));

        ConsignarPanel.setBackground(new java.awt.Color(255, 255, 255));
        ConsignarPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ConsignarPanel.setPreferredSize(new java.awt.Dimension(176, 100));

        DineroConsignar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        DineroConsignar.setText("Valor a consignar");

        BtnSiguienteConsignar1.setText("Siguiente");
        BtnSiguienteConsignar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteConsignar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConsignarPanelLayout = new javax.swing.GroupLayout(ConsignarPanel);
        ConsignarPanel.setLayout(ConsignarPanelLayout);
        ConsignarPanelLayout.setHorizontalGroup(
            ConsignarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsignarPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(ConsignarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DineroConsignar)
                    .addComponent(txtConsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ConsignarPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(BtnSiguienteConsignar1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        ConsignarPanelLayout.setVerticalGroup(
            ConsignarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsignarPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(DineroConsignar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtConsignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnSiguienteConsignar1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PanelPrincipal.add(ConsignarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 170, 120));

        ConsignarCuenta.setBackground(new java.awt.Color(255, 255, 255));
        ConsignarCuenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ConsignarCuenta.setPreferredSize(new java.awt.Dimension(176, 100));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("Cuenta a consignar");

        BtnSiguienteCuentaConsignar.setText("Siguiente");
        BtnSiguienteCuentaConsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteCuentaConsignarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConsignarCuentaLayout = new javax.swing.GroupLayout(ConsignarCuenta);
        ConsignarCuenta.setLayout(ConsignarCuentaLayout);
        ConsignarCuentaLayout.setHorizontalGroup(
            ConsignarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsignarCuentaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(ConsignarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtCuentaConsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ConsignarCuentaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(BtnSiguienteCuentaConsignar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        ConsignarCuentaLayout.setVerticalGroup(
            ConsignarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsignarCuentaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCuentaConsignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnSiguienteCuentaConsignar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PanelPrincipal.add(ConsignarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 170, 120));

        ClaveINCORRECTA.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        ClaveINCORRECTA.setText("La clave no es correcta");
        PanelPrincipal.add(ClaveINCORRECTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 140, -1));

        DineroInsuficiente.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        DineroInsuficiente.setText("Usted no cuenta con los recursos necesarios");
        PanelPrincipal.add(DineroInsuficiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 250, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("Consignaciones");
        PanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuUsuarioMouseClicked
        if (this.Menuborde.isVisible() == true) {
            this.Menuborde.setVisible(false);
        } else {
            this.Menuborde.setVisible(true);
        }
    }//GEN-LAST:event_MenuUsuarioMouseClicked

    private void Atras4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Atras4MouseClicked
        Menuopciones1 Menu1 = new Menuopciones1();
        Menu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Atras4MouseClicked

    private void Atras4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Atras4MouseEntered
        Atras4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/atras azul.png")));
    }//GEN-LAST:event_Atras4MouseEntered

    private void Atras4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Atras4MouseExited
        Atras4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/atrasnegro.png")));
    }//GEN-LAST:event_Atras4MouseExited

    private void CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseClicked
        Login Login1 = new Login();
        Login1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CerrarSesionMouseClicked

    private void CerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseExited
        this.CerrarSesion.setBackground(Color.WHITE);
    }//GEN-LAST:event_CerrarSesionMouseExited

    private void PerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilMouseEntered
        this.CerrarSesion.setBackground(Color.getHSBColor(72, 28, 100));
    }//GEN-LAST:event_PerfilMouseEntered

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void MoverBtnMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoverBtnMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_MoverBtnMouseDragged

    private void MoverBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoverBtnMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_MoverBtnMousePressed

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/InterfazClave/Exit.png")));
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/InterfazClave/Exit2.png")));
    }//GEN-LAST:event_SalirMouseExited

    private void BtnSiguienteClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteClaveActionPerformed
        this.MaximosIntentos();
        try {
            //consulta la clave y la compara a ver si es la misma

            String clave = this.MetodosDB.consultarpor(5, 2, this.log.Correo);
            double DineroConsignarValidar = Double.parseDouble(this.MetodosDB.consultarpor(6, 2, this.log.Correo));
            double DineroAconsignar = Double.parseDouble(this.txtConsignar.getText());

            if (clave.equals(this.txtClave.getText()) && DineroConsignarValidar >= DineroAconsignar) {
                try {

                    //Documento y correo de la persona a la que le van a consignar
                    String DocumentoConsignado = this.txtCuentaConsignar.getText();
                    String ConsultaDineroConsignado = (this.MetodosDB.ConsultarDineroPorDocumento(Integer.parseInt(this.txtCuentaConsignar.getText())));

                    //Documento y correo de la persona que está haciendo la consignacion
                    String DineroQuienConsigna = (this.MetodosDB.ConsultarDineroPorDocumento(this.log.Doc));
                    String ConsultaCorreo = (this.MetodosDB.ConsultarCorreoPorDocumento(this.log.Doc));
                    Double DineroConsignado, DineroDescontadoConsigna;

                    System.out.println(this.txtCuentaConsignar.getText());

                    DineroConsignado = Double.parseDouble(ConsultaDineroConsignado) + this.ValorAConsignar;
                    System.out.println(DineroConsignado);

                    System.out.println(this.MetodosDB.EditarDineroPorDocumento(DineroConsignado, DocumentoConsignado));

                    DineroDescontadoConsigna = (Double.parseDouble(DineroQuienConsigna) - this.ValorAConsignar);
                    System.out.println("Se desctonto:" + DineroDescontadoConsigna);
                    this.txtDinero.setText("" + DineroDescontadoConsigna); //actualiza el dinero al realizar una accion

                    System.out.println(this.MetodosDB.EditarDineroPorDocumento(DineroDescontadoConsigna, ConsultaCorreo));
                    

                    ClaseFactura factura = new ClaseFactura(this.txtConsignar.getText(),"Consignación",this.txtCuentaConsignar.getText());
                    Factura Factu = new Factura(factura);
                    Factu.setVisible(true);
                    
                    this.ClavePanel.setVisible(false);
                    this.txtConsignar.setText("");
                    this.txtCuentaConsignar.setText("");
                    this.txtClave.setText("");
                    this.ConsignarPanel.setVisible(true);
                    
                } catch (Exception e) {
                    System.out.println("No se pudo hacer la trasnferencia: btnsigiente retiroahorros" + e);
                }
            } else {

                if (clave != this.txtClave.getText()) {
                    this.ClaveINCORRECTA.setVisible(true);
                }
                if (DineroConsignarValidar < DineroAconsignar) {
                    this.DineroInsuficiente.setVisible(true);
                }
                System.out.println("Incorrecta");
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_BtnSiguienteClaveActionPerformed

    private void BtnSiguienteConsignar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteConsignar1ActionPerformed
        this.ValorAConsignar = Double.parseDouble(this.txtConsignar.getText());
        this.ConsignarPanel.setVisible(false);
        this.ConsignarCuenta.setVisible(true);
        this.ConsignarPanel.setVisible(false);
        this.ConsignarCuenta.setLocation(180, 270);
    }//GEN-LAST:event_BtnSiguienteConsignar1ActionPerformed

    private void BtnSiguienteCuentaConsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteCuentaConsignarActionPerformed
        this.ClavePanel.setVisible(true);
        this.ConsignarCuenta.setVisible(false);
        this.ClavePanel.setVisible(true);
        this.ClavePanel.setLocation(180, 270);

    }//GEN-LAST:event_BtnSiguienteCuentaConsignarActionPerformed

    private void PanelPrincipalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelPrincipalMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_PanelPrincipalMouseDragged

    private void PanelPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelPrincipalMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_PanelPrincipalMousePressed
    public void InitComponents() {
        
        db.conexion();
        this.setTitle("ATM JhoanV");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Recursos/IconoBarraTareas.png")));
        this.setLocationRelativeTo(null);
        this.Menuborde.setVisible(false);
        this.txtDinero.setText(this.MetodosDB.ConsultarDineroPorDocumento(this.log.Doc));
        this.ClaveINCORRECTA.setVisible(false);
        this.ClavePanel.setVisible(false);
        this.ConsignarCuenta.setVisible(false);
        this.DineroInsuficiente.setVisible(false);
        this.c = 0;
    }

    public void MaximosIntentos() {
        this.c = this.c + 1;
        if (this.c >= 3) {
            Menuopciones1 Menu = new Menuopciones1();
            Menu.setVisible(true);
            this.dispose();
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consignar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atras4;
    private javax.swing.JButton BtnSiguienteClave;
    private javax.swing.JButton BtnSiguienteConsignar1;
    private javax.swing.JButton BtnSiguienteCuentaConsignar;
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JLabel ClaveINCORRECTA;
    private javax.swing.JPanel ClavePanel;
    private javax.swing.JPanel ConsignarCuenta;
    private javax.swing.JPanel ConsignarPanel;
    private javax.swing.JLabel DineroConsignar;
    private javax.swing.JLabel DineroInsuficiente;
    private javax.swing.JPanel DineroPanel;
    private javax.swing.JPanel MenuUSER;
    private javax.swing.JLabel MenuUsuario;
    private javax.swing.JPanel Menuborde;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel MoverBtn;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel Perfil;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtConsignar;
    private javax.swing.JTextField txtCuentaConsignar;
    private javax.swing.JTextField txtDinero;
    // End of variables declaration//GEN-END:variables
}
