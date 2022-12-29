/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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
public class RetiroCuentaRelacionadaAhorros extends javax.swing.JFrame {

    int c;
    int y, x;
    ConexionDB db = new ConexionDB();
    Rut rut = new Rut();
    Login log = new Login();
    double ValorARetirar;
    MetodosDeDB MetodosDB = new MetodosDeDB();

    /**
     * Creates new form RetiroCuentaRelacionadaAhorros
     */
    public RetiroCuentaRelacionadaAhorros() {
        initComponents();
        this.InitComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        RetirarPanel = new javax.swing.JPanel();
        DineroConsignar = new javax.swing.JLabel();
        txtRetirar = new javax.swing.JTextField();
        BtnSiguienteConsignar1 = new javax.swing.JButton();
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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/icono6.png"))); // NOI18N
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

        txtClave.setSelectedTextColor(new java.awt.Color(204, 255, 255));
        txtClave.setSelectionColor(new java.awt.Color(255, 255, 255));

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
        txtDinero.setSelectedTextColor(new java.awt.Color(204, 255, 255));
        txtDinero.setSelectionColor(new java.awt.Color(255, 255, 255));

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

        RetirarPanel.setBackground(new java.awt.Color(255, 255, 255));
        RetirarPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        RetirarPanel.setPreferredSize(new java.awt.Dimension(176, 100));

        DineroConsignar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        DineroConsignar.setText("Valor a retirar");

        BtnSiguienteConsignar1.setText("Siguiente");
        BtnSiguienteConsignar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteConsignar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RetirarPanelLayout = new javax.swing.GroupLayout(RetirarPanel);
        RetirarPanel.setLayout(RetirarPanelLayout);
        RetirarPanelLayout.setHorizontalGroup(
            RetirarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RetirarPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(RetirarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DineroConsignar)
                    .addComponent(txtRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RetirarPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(BtnSiguienteConsignar1)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        RetirarPanelLayout.setVerticalGroup(
            RetirarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RetirarPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(DineroConsignar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnSiguienteConsignar1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PanelPrincipal.add(RetirarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 170, 120));

        ClaveINCORRECTA.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        ClaveINCORRECTA.setText("La clave no es correcta");
        PanelPrincipal.add(ClaveINCORRECTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 140, -1));

        DineroInsuficiente.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        DineroInsuficiente.setText("Usted no cuenta con los recursos necesarios");
        PanelPrincipal.add(DineroInsuficiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 250, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("Retiro Cuenta Relacionada Ahorros");
        PanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 210, -1));

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

    private void BtnSiguienteClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteClaveActionPerformed
        this.MaximosIntentos();
        try {
            //consulta la clave y la compara a ver si es la misma

            String clave = this.MetodosDB.consultarpor(5, 2, this.log.Correo);
            double DineroConsignarValidar = Double.parseDouble(this.MetodosDB.consultarpor(6, 2, this.log.Correo));
            double Retirar = Double.parseDouble(this.txtRetirar.getText());

            if (clave.equals(this.txtClave.getText()) && DineroConsignarValidar >= Retirar) {
                try {

                    //Documento y correo de la persona que está haciendo el retiro
                    String DineroQuienRetira = (this.MetodosDB.ConsultarDineroPorDocumento(this.log.Doc));
                    String ConsultaCorreo = (this.MetodosDB.ConsultarCorreoPorDocumento(this.log.Doc));
                    Double DineroRetirado;

                    DineroRetirado = Double.parseDouble(DineroQuienRetira) - this.ValorARetirar;
                    System.out.println(DineroRetirado);

                    System.out.println(this.MetodosDB.EditarDineroPor(6, "" + DineroRetirado, 2, ConsultaCorreo));
                    ClaseFactura factura = new ClaseFactura(this.txtRetirar.getText(), "Retiro Relacionada Ahorros", "" + this.log.Doc);
                    Factura Factu = new Factura(factura);
                    Factu.setVisible(true);

                    this.ClavePanel.setVisible(false);
                    this.txtRetirar.setText("");

                    this.txtClave.setText("");
                    this.RetirarPanel.setVisible(true);
                    this.txtDinero.setText("" + DineroRetirado); //actualiza el dinero al realizar una accion

                } catch (Exception e) {
                    System.out.println("No se pudo hacer la trasnferencia: btnsigiente retiroahorros" + e);
                }
            } else {

                if (clave != this.txtClave.getText()) {
                    this.ClaveINCORRECTA.setVisible(true);
                }
                if (DineroConsignarValidar < Retirar) {
                    this.DineroInsuficiente.setVisible(true);
                }
                System.out.println("Incorrecta");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BtnSiguienteClaveActionPerformed

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/InterfazClave/Exit.png")));
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/InterfazClave/Exit2.png")));
    }//GEN-LAST:event_SalirMouseExited

    private void BtnSiguienteConsignar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteConsignar1ActionPerformed
        this.ValorARetirar = Double.parseDouble(this.txtRetirar.getText());
        this.RetirarPanel.setVisible(false);
        this.ClavePanel.setVisible(true);

    }//GEN-LAST:event_BtnSiguienteConsignar1ActionPerformed

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
            java.util.logging.Logger.getLogger(RetiroCuentaRelacionadaAhorros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RetiroCuentaRelacionadaAhorros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RetiroCuentaRelacionadaAhorros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RetiroCuentaRelacionadaAhorros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RetiroCuentaRelacionadaAhorros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atras4;
    private javax.swing.JButton BtnSiguienteClave;
    private javax.swing.JButton BtnSiguienteConsignar1;
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JLabel ClaveINCORRECTA;
    private javax.swing.JPanel ClavePanel;
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
    private javax.swing.JPanel RetirarPanel;
    private javax.swing.JLabel Salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDinero;
    private javax.swing.JTextField txtRetirar;
    // End of variables declaration//GEN-END:variables
}
