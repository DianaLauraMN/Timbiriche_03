
package gui;

import java.awt.Color;

public class DLGUnirsePartida extends javax.swing.JDialog {

    /**
     * Creates new form Registro
     */
    public DLGUnirsePartida(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.getRootPane().setOpaque(false);
        this.getContentPane().setBackground(new Color(0, 0, 0, 0));
        this.setBackground(new Color(0, 0, 0, 0));
        
        this.panel.getRootPane().setOpaque(false);
        this.panel.setBackground(new Color(0, 0, 0, 0));
        
        this.setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        imgUnirsePartidaCartaJugador = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        imgBtnUnirse = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        imgIconoPartida = new javax.swing.JLabel();
        imgFlecha1 = new javax.swing.JLabel();
        imgFlecha2 = new javax.swing.JLabel();
        imgFlecha3 = new javax.swing.JLabel();
        imgFlecha4 = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgUnirsePartidaCartaJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CartaJugador-aceptoBlanco.png"))); // NOI18N
        panel.add(imgUnirsePartidaCartaJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 190, 320));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnMinimizar.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, 30, 30));

        imgBtnUnirse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btbUnirse.png"))); // NOI18N
        imgBtnUnirse.setBorder(null);
        imgBtnUnirse.setBorderPainted(false);
        imgBtnUnirse.setContentAreaFilled(false);
        imgBtnUnirse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel.add(imgBtnUnirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 180, 60));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnCerrar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        panel.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 30, 30));

        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Titulo.png"))); // NOI18N
        panel.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 240, 70));

        imgIconoPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconoPartida.png"))); // NOI18N
        panel.add(imgIconoPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, -1));

        imgFlecha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha.png"))); // NOI18N
        panel.add(imgFlecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        imgFlecha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha.png"))); // NOI18N
        panel.add(imgFlecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, -1, -1));

        imgFlecha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha.png"))); // NOI18N
        panel.add(imgFlecha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, -1));

        imgFlecha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha.png"))); // NOI18N
        panel.add(imgFlecha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FondoDLG.png"))); // NOI18N
        panel.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1070, 690));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
      dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton imgBtnUnirse;
    private javax.swing.JLabel imgFlecha1;
    private javax.swing.JLabel imgFlecha2;
    private javax.swing.JLabel imgFlecha3;
    private javax.swing.JLabel imgFlecha4;
    private javax.swing.JLabel imgIconoPartida;
    private javax.swing.JLabel imgUnirsePartidaCartaJugador;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
