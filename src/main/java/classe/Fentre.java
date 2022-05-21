/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Fentre extends javax.swing.JFrame {
    ArrayList<vechicule> vechicule;
    DefaultListModel modeleliste;
    File fichier;
    FileWriter fw;
    PrintWriter pw;

    /**
     * Creates new form Fentre
     */
    public Fentre() {
        initComponents();
        vechicule = new ArrayList<>();
        modeleliste= new DefaultListModel();
        try {
            fichier = new File("fichier.veh");
            fw = new FileWriter(fichier);
            pw = new PrintWriter(fw);

        } catch (IOException ex) {
                  ex.printStackTrace();
        }
        
        
        
        
        
                
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
        listevechicule = new javax.swing.JList<>();
        btnAjouter = new javax.swing.JButton();
        btnASuprimer = new javax.swing.JButton();
        btnAFermer = new javax.swing.JButton();
        btnenregistrer = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listevechicule);

        btnAjouter.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnASuprimer.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnASuprimer.setText("Suprimer");
        btnASuprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnASuprimerActionPerformed(evt);
            }
        });

        btnAFermer.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAFermer.setText("Fermer");
        btnAFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAFermerActionPerformed(evt);
            }
        });

        btnenregistrer.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnenregistrer.setText("enregistrer");
        btnenregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenregistrerActionPerformed(evt);
            }
        });

        btnModifier.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnModifier.setText("Modifier");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAjouter)
                        .addGap(37, 37, 37)
                        .addComponent(btnASuprimer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(btnModifier)
                        .addGap(28, 28, 28)
                        .addComponent(btnenregistrer)
                        .addGap(28, 28, 28)
                        .addComponent(btnAFermer)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAFermer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnenregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnASuprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnASuprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnASuprimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnASuprimerActionPerformed

    private void btnenregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenregistrerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnenregistrerActionPerformed

    private void btnAFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAFermerActionPerformed
        // TODO add your handling code here:
        int chois=JOptionPane.showConfirmDialog(this, "tu est sur de sortir", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(chois==0){System.exit(0);}
    }//GEN-LAST:event_btnAFermerActionPerformed

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        // TODO add your handling code here:
        String marque,modele,imatriculation,type;
        int nombreduporte,vitesseMAX;
        boolean remorque;
        type = JOptionPane.showInputDialog(this, "ENTRER LA TYPE DE VECHICULE VOITURE/CAMION/MOTO",JOptionPane.PLAIN_MESSAGE);
        if(type.equalsIgnoreCase("Voiture")){
         marque = JOptionPane.showInputDialog(this, "ENTRER LA MARQUE DE VECHICULE",JOptionPane.PLAIN_MESSAGE);
        modele = JOptionPane.showInputDialog(this, "ENTRER LE MODELE DE VECHICULE",JOptionPane.PLAIN_MESSAGE);
        imatriculation = JOptionPane.showInputDialog(this, "ENTRER L' IMATRICULATION DE VECHICULE",JOptionPane.PLAIN_MESSAGE);
            nombreduporte =Integer.parseInt(JOptionPane.showInputDialog(this, "ENTRER LE NOMBRE DU PORTE DE VOITURE",JOptionPane.PLAIN_MESSAGE) );
        }
        else if(type.equalsIgnoreCase("MOTO")){
                    marque = JOptionPane.showInputDialog(this, "ENTRER LA MARQUE DE VECHICULE",JOptionPane.PLAIN_MESSAGE);
        modele = JOptionPane.showInputDialog(this, "ENTRER LE MODELE DE VECHICULE",JOptionPane.PLAIN_MESSAGE);
        imatriculation = JOptionPane.showInputDialog(this, "ENTRER L' IMATRICULATION DE VECHICULE",JOptionPane.PLAIN_MESSAGE);
        
            vitesseMAX =Integer.parseInt(JOptionPane.showInputDialog(this, "ENTRER LE VITESSE MAX",JOptionPane.PLAIN_MESSAGE) );
        }
        else if (type.equalsIgnoreCase("camion")){
            marque = JOptionPane.showInputDialog(this, "ENTRER LA MARQUE DE VECHICULE",JOptionPane.PLAIN_MESSAGE);
            modele = JOptionPane.showInputDialog(this, "ENTRER LE MODELE DE VECHICULE",JOptionPane.PLAIN_MESSAGE);
            imatriculation = JOptionPane.showInputDialog(this, "ENTRER L' IMATRICULATION DE VECHICULE",JOptionPane.PLAIN_MESSAGE);
            int choix = JOptionPane.showConfirmDialog(this, "le camione a un remorque","remorque", JOptionPane.YES_NO_OPTION);
            if(choix==0)remorque=true;
            else remorque=false;
        }
        else{
        JOptionPane.showMessageDialog(this, "votre chois est incorrecte", "choix incorrecte", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnAjouterActionPerformed

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
            java.util.logging.Logger.getLogger(Fentre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fentre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fentre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fentre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Fentre f = new Fentre() ;
                f.setVisible(true);
                f.setTitle("Gestion de parking");
                f.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAFermer;
    private javax.swing.JButton btnASuprimer;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnenregistrer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listevechicule;
    // End of variables declaration//GEN-END:variables
}
