package View;

import java.awt.BorderLayout;

public class FramePaginaAdmin extends javax.swing.JFrame {

    public FramePaginaAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        PanelPaginaPrincipal p1 = new PanelPaginaPrincipal ();
        p1.setSize(350, 328);
        p1.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p1, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelPagina = new javax.swing.JPanel();
        Titulo = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        PaginaPrincipal = new javax.swing.JButton();
        Cuentas = new javax.swing.JButton();
        AvisosGeneral = new javax.swing.JButton();
        AvisoPersonal = new javax.swing.JButton();
        Quejas = new javax.swing.JButton();
        Visitas = new javax.swing.JButton();
        Reservaciones = new javax.swing.JButton();
        Domicilios = new javax.swing.JButton();
        Configuración = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        PanelPagina.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelPaginaLayout = new javax.swing.GroupLayout(PanelPagina);
        PanelPagina.setLayout(PanelPaginaLayout);
        PanelPaginaLayout.setHorizontalGroup(
            PanelPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );
        PanelPaginaLayout.setVerticalGroup(
            PanelPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Titulo.setBackground(new java.awt.Color(141, 153, 174));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(21, 147, 244));
        jLabel2.setText("ConjuntApp");

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(403, 403, 403))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(251, 133, 0));

        PaginaPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PaginaPrincipal.setForeground(new java.awt.Color(251, 133, 0));
        PaginaPrincipal.setText("Pagina principal");
        PaginaPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PaginaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaginaPrincipalActionPerformed(evt);
            }
        });

        Cuentas.setBackground(new java.awt.Color(255, 255, 255));
        Cuentas.setForeground(new java.awt.Color(251, 133, 0));
        Cuentas.setText("Cuentas");
        Cuentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Cuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuentasActionPerformed(evt);
            }
        });

        AvisosGeneral.setBackground(new java.awt.Color(255, 255, 255));
        AvisosGeneral.setForeground(new java.awt.Color(251, 133, 0));
        AvisosGeneral.setText("AvisosGenerales");
        AvisosGeneral.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        AvisoPersonal.setForeground(new java.awt.Color(251, 133, 0));
        AvisoPersonal.setText("Aviso personal");
        AvisoPersonal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AvisoPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvisoPersonalActionPerformed(evt);
            }
        });

        Quejas.setBackground(new java.awt.Color(255, 255, 255));
        Quejas.setForeground(new java.awt.Color(251, 133, 0));
        Quejas.setText("Quejas y reclamos");
        Quejas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Quejas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuejasActionPerformed(evt);
            }
        });

        Visitas.setBackground(new java.awt.Color(255, 255, 255));
        Visitas.setForeground(new java.awt.Color(251, 133, 0));
        Visitas.setText("Visitas");
        Visitas.setHideActionText(true);
        Visitas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Visitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisitasActionPerformed(evt);
            }
        });

        Reservaciones.setBackground(new java.awt.Color(255, 255, 255));
        Reservaciones.setForeground(new java.awt.Color(251, 133, 0));
        Reservaciones.setText("Reservaciones");
        Reservaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Reservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservacionesActionPerformed(evt);
            }
        });

        Domicilios.setBackground(new java.awt.Color(255, 255, 255));
        Domicilios.setForeground(new java.awt.Color(251, 133, 0));
        Domicilios.setText("Domicilios");
        Domicilios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Domicilios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DomiciliosActionPerformed(evt);
            }
        });

        Configuración.setBackground(new java.awt.Color(255, 255, 255));
        Configuración.setForeground(new java.awt.Color(251, 133, 0));
        Configuración.setText("Configuración");
        Configuración.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Configuración.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguraciónActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Configuración, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Domicilios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Reservaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Visitas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Quejas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AvisoPersonal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AvisosGeneral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cuentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaginaPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(PaginaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cuentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AvisosGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AvisoPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Quejas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Visitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Reservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Domicilios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Configuración, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(PanelPagina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addComponent(PanelPagina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PaginaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaginaPrincipalActionPerformed
        PanelPaginaPrincipal p1 = new PanelPaginaPrincipal ();
        p1.setSize(350, 328);
        p1.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p1, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_PaginaPrincipalActionPerformed

    private void CuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuentasActionPerformed
        /*
        PanelCuentasAdmin p2 = new PanelCuentasAdmin ();
        p2.setSize(350, 328);
        p2.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p2, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
        */
    }//GEN-LAST:event_CuentasActionPerformed

    private void AvisoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvisoPersonalActionPerformed
        PanelNotificacionesAdmin p3 = new PanelNotificacionesAdmin ();
        p3.setSize(350, 328);
        p3.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p3, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_AvisoPersonalActionPerformed

    private void ReservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservacionesActionPerformed
        PanelReservacionesEmpleado p4 = new PanelReservacionesEmpleado ();
        p4.setSize(350, 328);
        p4.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p4, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_ReservacionesActionPerformed

    private void VisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisitasActionPerformed
        PanelVisitasAdmin p5 = new PanelVisitasAdmin ();
        p5.setSize(350, 328);
        p5.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p5, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_VisitasActionPerformed

    private void DomiciliosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DomiciliosActionPerformed
        PanelDomiciliosAdmin p6 = new PanelDomiciliosAdmin ();
        p6.setSize(350, 328);
        p6.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p6, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_DomiciliosActionPerformed

    private void ConfiguraciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguraciónActionPerformed
        PanelConfiguracionAdmin p8 = new PanelConfiguracionAdmin ();
        p8.setSize(350, 328);
        p8.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p8, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_ConfiguraciónActionPerformed

    private void QuejasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuejasActionPerformed
        PanelQuejasAdmin p9 = new PanelQuejasAdmin ();
        p9.setSize(350, 328);
        p9.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p9, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_QuejasActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AvisoPersonal;
    private javax.swing.JButton AvisosGeneral;
    private javax.swing.JButton Configuración;
    private javax.swing.JButton Cuentas;
    private javax.swing.JButton Domicilios;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton PaginaPrincipal;
    private javax.swing.JPanel PanelPagina;
    private javax.swing.JButton Quejas;
    private javax.swing.JButton Reservaciones;
    private javax.swing.JPanel Titulo;
    private javax.swing.JButton Visitas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
