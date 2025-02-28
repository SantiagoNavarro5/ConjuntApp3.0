
package View;

import java.awt.BorderLayout;

public class FramePaginaClientes extends javax.swing.JFrame {

    public FramePaginaClientes() {
        initComponents();
        
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
        jPanel2 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        PanelPagina = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        PaginaPrincipal = new javax.swing.JButton();
        Cuenta = new javax.swing.JButton();
        Notificaciones = new javax.swing.JButton();
        Reservaciones = new javax.swing.JButton();
        Visitas = new javax.swing.JButton();
        Quejas = new javax.swing.JButton();
        Configuracion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(141, 153, 174));
        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 50));
        jPanel2.setMinimumSize(new java.awt.Dimension(100, 50));

        Titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(21, 147, 244));
        Titulo.setText("ConjuntApp");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(404, 404, 404))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        PanelPagina.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelPaginaLayout = new javax.swing.GroupLayout(PanelPagina);
        PanelPagina.setLayout(PanelPaginaLayout);
        PanelPaginaLayout.setHorizontalGroup(
            PanelPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );
        PanelPaginaLayout.setVerticalGroup(
            PanelPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        PaginaPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PaginaPrincipal.setForeground(new java.awt.Color(251, 133, 0));
        PaginaPrincipal.setText("PaginaPrincipal");
        PaginaPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PaginaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaginaPrincipalActionPerformed(evt);
            }
        });

        Cuenta.setBackground(new java.awt.Color(255, 255, 255));
        Cuenta.setForeground(new java.awt.Color(251, 133, 0));
        Cuenta.setText("Cuenta");
        Cuenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuentaActionPerformed(evt);
            }
        });

        Notificaciones.setBackground(new java.awt.Color(255, 255, 255));
        Notificaciones.setForeground(new java.awt.Color(251, 133, 0));
        Notificaciones.setText("Notificaciones");
        Notificaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Notificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotificacionesActionPerformed(evt);
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

        Visitas.setBackground(new java.awt.Color(255, 255, 255));
        Visitas.setForeground(new java.awt.Color(251, 133, 0));
        Visitas.setText("Visitas");
        Visitas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Visitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisitasActionPerformed(evt);
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

        Configuracion.setBackground(new java.awt.Color(255, 255, 255));
        Configuracion.setForeground(new java.awt.Color(251, 133, 0));
        Configuracion.setText("Configuracion");
        Configuracion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Quejas, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(Visitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Configuracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Reservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Notificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaginaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(PaginaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Notificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Reservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Visitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Quejas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Configuracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PanelPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelPagina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void CuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuentaActionPerformed
        PanelCuentaCliente p2 = new PanelCuentaCliente ();
        p2.setSize(350, 328);
        p2.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p2, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_CuentaActionPerformed

    private void NotificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotificacionesActionPerformed
        PanelNotificacionesCliente p3 = new PanelNotificacionesCliente ();
        p3.setSize(350, 328);
        p3.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p3, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_NotificacionesActionPerformed

    private void ReservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservacionesActionPerformed
        PanelReservacionesCliente p4 = new PanelReservacionesCliente ();
        p4.setSize(350, 328);
        p4.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p4, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_ReservacionesActionPerformed

    private void VisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisitasActionPerformed
        PanelVisitasCliente p5 = new PanelVisitasCliente ();
        p5.setSize(350, 328);
        p5.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p5, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_VisitasActionPerformed

    private void QuejasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuejasActionPerformed
        PanelQuejasClientes p9 = new PanelQuejasClientes ();
        p9.setSize(350, 328);
        p9.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p9, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_QuejasActionPerformed

    private void ConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguracionActionPerformed
        PanelConfiguracionComun p8 = new PanelConfiguracionComun ();
        p8.setSize(350, 328);
        p8.setLocation(0, 0);
        
        PanelPagina.removeAll();
        PanelPagina.add(p8, BorderLayout.CENTER);
        PanelPagina.revalidate();
        PanelPagina.repaint();
    }//GEN-LAST:event_ConfiguracionActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Configuracion;
    private javax.swing.JButton Cuenta;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton Notificaciones;
    private javax.swing.JButton PaginaPrincipal;
    private javax.swing.JPanel PanelPagina;
    private javax.swing.JButton Quejas;
    private javax.swing.JButton Reservaciones;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton Visitas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
