/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clase.Hora;

import javax.swing.JOptionPane;

/**
 *
 * @author Payares
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    Hora H;
    public Principal() {
        initComponents();
           cmdCrear.setEnabled(true);
        cmdIgual.setEnabled(false);
        cmdMayorQue.setEnabled(false);
        cmdMenorQue.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdValidar1.setEnabled(false);
        cmdValidar2.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtHoras1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMinutos1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSegundos1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtSegundos2 = new javax.swing.JTextField();
        txtHoras2 = new javax.swing.JTextField();
        txtMinutos2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cmdMostrar = new javax.swing.JButton();
        cmdValidar1 = new javax.swing.JButton();
        cmdCrear = new javax.swing.JButton();
        cmdValidar2 = new javax.swing.JButton();
        cmdIgual = new javax.swing.JButton();
        cmdMayorQue = new javax.swing.JButton();
        cmdMenorQue = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Verificacion de Horas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("N° 1"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHoras1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoras1KeyTyped(evt);
            }
        });
        jPanel2.add(txtHoras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 40, -1));

        jLabel5.setText("Horas");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txtMinutos1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMinutos1KeyTyped(evt);
            }
        });
        jPanel2.add(txtMinutos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 40, -1));

        jLabel6.setText("Minutos");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        txtSegundos1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegundos1KeyTyped(evt);
            }
        });
        jPanel2.add(txtSegundos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 40, -1));

        jLabel7.setText("Segundos");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 240, 80));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("N° 2"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSegundos2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegundos2KeyTyped(evt);
            }
        });
        jPanel3.add(txtSegundos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 40, -1));

        txtHoras2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoras2KeyTyped(evt);
            }
        });
        jPanel3.add(txtHoras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 40, -1));

        txtMinutos2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMinutos2KeyTyped(evt);
            }
        });
        jPanel3.add(txtMinutos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 40, -1));

        jLabel2.setText("Segundos");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel3.setText("Horas");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel4.setText("Minutos");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 240, 90));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Ejecucion"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 120, -1));

        cmdValidar1.setText("Validar Hora 1");
        cmdValidar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdValidar1ActionPerformed(evt);
            }
        });
        jPanel4.add(cmdValidar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, -1));

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, -1));

        cmdValidar2.setText("Validar Hora 2");
        cmdValidar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdValidar2ActionPerformed(evt);
            }
        });
        jPanel4.add(cmdValidar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 120, -1));

        cmdIgual.setText("Igual");
        cmdIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIgualActionPerformed(evt);
            }
        });
        jPanel4.add(cmdIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, -1));

        cmdMayorQue.setText("Mayor que");
        cmdMayorQue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMayorQueActionPerformed(evt);
            }
        });
        jPanel4.add(cmdMayorQue, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 120, -1));

        cmdMenorQue.setText("Menor que");
        cmdMenorQue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenorQueActionPerformed(evt);
            }
        });
        jPanel4.add(cmdMenorQue, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 120, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 260, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHoras1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoras1KeyTyped
        char c=evt.getKeyChar();

        if(!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtHoras1KeyTyped

    private void txtMinutos1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinutos1KeyTyped
        char c=evt.getKeyChar();

        if(!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtMinutos1KeyTyped

    private void txtSegundos1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundos1KeyTyped
        char c=evt.getKeyChar();

        if(!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtSegundos1KeyTyped

    private void txtSegundos2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundos2KeyTyped
        char c=evt.getKeyChar();

        if(!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtSegundos2KeyTyped

    private void txtHoras2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoras2KeyTyped
        char c=evt.getKeyChar();

        if(!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtHoras2KeyTyped

    private void txtMinutos2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinutos2KeyTyped
        char c=evt.getKeyChar();

        if(!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtMinutos2KeyTyped

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        String aux;
        int h, m ,s;

        h =Integer.parseInt(txtHoras2.getText());
        m =Integer.parseInt(txtMinutos2.getText());
        s =Integer.parseInt(txtSegundos2.getText());

        aux =H .mostar( h, m , s);
        JOptionPane.showMessageDialog(this, aux);

        cmdCrear.setEnabled(false);
        cmdIgual.setEnabled(true);
        cmdMayorQue.setEnabled(true);
        cmdMenorQue.setEnabled(true);
        cmdMostrar.setEnabled(true);
        cmdValidar1.setEnabled(true);
        cmdValidar2.setEnabled(true);
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdValidar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdValidar1ActionPerformed
        String aux;
        int h1 , m1 ,s1 ;

        h1 = Integer.parseInt (txtHoras1.getText());
        m1 = Integer.parseInt (txtMinutos1.getText());
        s1 = Integer.parseInt (txtSegundos1.getText());

        aux =H.valida();
        JOptionPane.showMessageDialog(this, aux);

        cmdCrear.setEnabled(false);
        cmdIgual.setEnabled(true);
        cmdMayorQue.setEnabled(true);
        cmdMenorQue.setEnabled(true);
        cmdMostrar.setEnabled(true);
        cmdValidar1.setEnabled(false);
        cmdValidar2.setEnabled(true);
    }//GEN-LAST:event_cmdValidar1ActionPerformed

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int h ,h2 , m , m2 , s , s2;

        if(txtHoras1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite la hora de" + " La Hora #1");
            txtHoras1.requestFocusInWindow();
        }else if(txtMinutos1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite los minutos de" + " La Hora #1");
            txtMinutos1.requestFocusInWindow();
        }else if(txtSegundos1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite los segundos de" + " La Hora #1");
            txtSegundos1.requestFocusInWindow();
        }else if(txtHoras2.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite las Horas de" + " La Hora #2");
            txtHoras2.requestFocusInWindow();
        }else if(txtMinutos2.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite los minutos de" + " La Hora #2");
            txtMinutos2.requestFocusInWindow();
        }else if(txtSegundos2.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite los segundos de" + " La Hora #2");
            txtSegundos2.requestFocusInWindow();
        }

        h= Integer.parseInt(txtHoras1.getText());
        //h2 =Integer.parseInt(txtHoras2.getText());
        m = Integer.parseInt(txtMinutos1.getText());
        //m2 = Integer.parseInt(txtMinutos2.getText());
        s = Integer.parseInt(txtSegundos1.getText());
        //s2 = Integer.parseInt(txtSegundos2.getText());

        H = new Hora (h, m, s);

        JOptionPane.showMessageDialog(this, "Creado");

        cmdCrear.setEnabled(false);
        cmdIgual.setEnabled(true);
        cmdMayorQue.setEnabled(true);
        cmdMenorQue.setEnabled(true);
        cmdMostrar.setEnabled(true);
        cmdValidar1.setEnabled(true);
        cmdValidar2.setEnabled(true);

    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdValidar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdValidar2ActionPerformed
        String aux;
        int h2 , m2 ,s2 ;

        h2 = Integer.parseInt (txtHoras2.getText());
        m2 = Integer.parseInt (txtMinutos2.getText());
        s2 = Integer.parseInt (txtSegundos2.getText());

        aux =H.valida2(h2 , m2 , s2);
        JOptionPane.showMessageDialog(this, aux);

        cmdCrear.setEnabled(false);
        cmdIgual.setEnabled(true);
        cmdMayorQue.setEnabled(true);
        cmdMenorQue.setEnabled(true);
        cmdMostrar.setEnabled(true);
        cmdValidar1.setEnabled(false);
        cmdValidar2.setEnabled(false);
    }//GEN-LAST:event_cmdValidar2ActionPerformed

    private void cmdIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIgualActionPerformed
        String aux;
        int h , h2 , m , m2 ,s , s2;
        h= Integer.parseInt(txtHoras1.getText());
        h2 =Integer.parseInt(txtHoras2.getText());
        m = Integer.parseInt(txtMinutos1.getText());
        m2 = Integer.parseInt(txtMinutos2.getText());
        s = Integer.parseInt(txtSegundos1.getText());
        s2 = Integer.parseInt(txtSegundos2.getText());

        aux = H.Igual(h2, m2, s2);
        JOptionPane.showMessageDialog(this, aux);
        cmdCrear.setEnabled(false);
        cmdIgual.setEnabled(false);
        cmdMayorQue.setEnabled(true);
        cmdMenorQue.setEnabled(true);
        cmdMostrar.setEnabled(true);
        cmdValidar1.setEnabled(false);
        cmdValidar2.setEnabled(false);

    }//GEN-LAST:event_cmdIgualActionPerformed

    private void cmdMayorQueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMayorQueActionPerformed
        String aux;
        int h , h2 , m , m2 ,s , s2;
        h= Integer.parseInt(txtHoras1.getText());
        h2 =Integer.parseInt(txtHoras2.getText());
        m = Integer.parseInt(txtMinutos1.getText());
        m2 = Integer.parseInt(txtMinutos2.getText());
        s = Integer.parseInt(txtSegundos1.getText());
        s2 = Integer.parseInt(txtSegundos2.getText());

        aux = H.Mayorque(h2, m2, s2);
        JOptionPane.showMessageDialog(this, aux);
        cmdCrear.setEnabled(false);
        cmdIgual.setEnabled(false);
        cmdMayorQue.setEnabled(false);
        cmdMenorQue.setEnabled(false);
        cmdMostrar.setEnabled(true);
        cmdValidar1.setEnabled(false);
        cmdValidar2.setEnabled(false);
    }//GEN-LAST:event_cmdMayorQueActionPerformed

    private void cmdMenorQueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenorQueActionPerformed
        String aux;
        int h , h2 , m , m2 ,s , s2;
        h= Integer.parseInt(txtHoras1.getText());
        h2 =Integer.parseInt(txtHoras2.getText());
        m = Integer.parseInt(txtMinutos1.getText());
        m2 = Integer.parseInt(txtMinutos2.getText());
        s = Integer.parseInt(txtSegundos1.getText());
        s2 = Integer.parseInt(txtSegundos2.getText());

        aux = H.Menorque(h2, m2, s2);
        JOptionPane.showMessageDialog(this, aux);
        cmdCrear.setEnabled(false);
        cmdIgual.setEnabled(false);
        cmdMayorQue.setEnabled(false);
        cmdMenorQue.setEnabled(false);
        cmdMostrar.setEnabled(true);
        cmdValidar1.setEnabled(false);
        cmdValidar2.setEnabled(false);

    }//GEN-LAST:event_cmdMenorQueActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtHoras1.setText("");
        txtHoras2.setText("");
        txtMinutos1.setText("");
        txtMinutos2.setText("");
        txtSegundos1.setText("");
        txtSegundos2.setText("");

        txtHoras1.requestFocusInWindow();

        cmdCrear.setEnabled(true);
        cmdIgual.setEnabled(false);
        cmdMayorQue.setEnabled(false);
        cmdMenorQue.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdValidar1.setEnabled(false);
        cmdValidar2.setEnabled(false);
    }//GEN-LAST:event_cmdBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdIgual;
    private javax.swing.JButton cmdMayorQue;
    private javax.swing.JButton cmdMenorQue;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdValidar1;
    private javax.swing.JButton cmdValidar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtHoras1;
    private javax.swing.JTextField txtHoras2;
    private javax.swing.JTextField txtMinutos1;
    private javax.swing.JTextField txtMinutos2;
    private javax.swing.JTextField txtSegundos1;
    private javax.swing.JTextField txtSegundos2;
    // End of variables declaration//GEN-END:variables
}
