
import java.io.File;
import java.time.LocalDateTime;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph
 */
public class Wetter_GUI extends javax.swing.JFrame {
    Wetter_BL bl = new Wetter_BL();
    /**
     * Creates new form Wetter_GUI
     */
    public Wetter_GUI() {
        initComponents();
        this.liAusgabe.setModel(bl);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mMenü = new javax.swing.JPopupMenu();
        miLaden = new javax.swing.JMenuItem();
        miExit = new javax.swing.JMenuItem();
        miSpeichern = new javax.swing.JMenuItem();
        slTemperatur = new javax.swing.JSlider();
        lbTemp = new javax.swing.JLabel();
        slLuftfeuchtigkeit = new javax.swing.JSlider();
        lbLuftfeuchtigkeit = new javax.swing.JLabel();
        btEingügen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        liAusgabe = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        miLaden.setText("Datei Laden");
        miLaden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLadenActionPerformed(evt);
            }
        });
        mMenü.add(miLaden);

        miExit.setText("Fenster schließen");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        mMenü.add(miExit);

        miSpeichern.setText("Datei speichern");
        miSpeichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSpeichernActionPerformed(evt);
            }
        });
        mMenü.add(miSpeichern);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        slTemperatur.setMaximum(40);
        slTemperatur.setMinimum(-20);
        slTemperatur.setValue(30);
        slTemperatur.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slTemperaturStateChanged(evt);
            }
        });

        lbTemp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        slLuftfeuchtigkeit.setValue(20);
        slLuftfeuchtigkeit.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slLuftfeuchtigkeitStateChanged(evt);
            }
        });

        lbLuftfeuchtigkeit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btEingügen.setText("Einfügen");
        btEingügen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEingügenActionPerformed(evt);
            }
        });

        liAusgabe.setComponentPopupMenu(mMenü);
        jScrollPane1.setViewportView(liAusgabe);

        jLabel3.setText("Datei");

        jLabel4.setText("Eingabe");

        jLabel5.setText("Anzeige");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(slTemperatur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(slLuftfeuchtigkeit, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                .addComponent(lbLuftfeuchtigkeit, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btEingügen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addComponent(jLabel8))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lbTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(slTemperatur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(lbLuftfeuchtigkeit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slLuftfeuchtigkeit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(btEingügen, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void slTemperaturStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slTemperaturStateChanged
        int temp = this.slTemperatur.getValue();
        String string = "Temperatur: "+temp+"°";
        this.lbTemp.setText(string);
    }//GEN-LAST:event_slTemperaturStateChanged

    private void slLuftfeuchtigkeitStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slLuftfeuchtigkeitStateChanged
        int lf = this.slLuftfeuchtigkeit.getValue();
        String string = "Luftfeuchtigkeit: "+lf+"%";
        this.lbLuftfeuchtigkeit.setText(string);
    }//GEN-LAST:event_slLuftfeuchtigkeitStateChanged

    private void btEingügenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEingügenActionPerformed
        int temp = this.slTemperatur.getValue();
        int lf = this.slLuftfeuchtigkeit.getValue();
        LocalDateTime date = LocalDateTime.now();
        
        WetterAufnahme aufnahme = new WetterAufnahme(temp,lf,date);
        bl.add(aufnahme);
    }//GEN-LAST:event_btEingügenActionPerformed

    private void miSpeichernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSpeichernActionPerformed
       bl.saveFile();
    }//GEN-LAST:event_miSpeichernActionPerformed

    private void miLadenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLadenActionPerformed
       JFileChooser chooser = new JFileChooser();
            int res = chooser.showOpenDialog(null);
            if(res == JFileChooser.APPROVE_OPTION){
                File f = chooser.getSelectedFile();
                try{
                    bl.loadFile(f);
                }
                catch(Exception e){
                  
                }
                
            }
    }//GEN-LAST:event_miLadenActionPerformed

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
      System.exit(0);
    }//GEN-LAST:event_miExitActionPerformed

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
            java.util.logging.Logger.getLogger(Wetter_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wetter_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wetter_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wetter_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wetter_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEingügen;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLuftfeuchtigkeit;
    private javax.swing.JLabel lbTemp;
    private javax.swing.JList<String> liAusgabe;
    private javax.swing.JPopupMenu mMenü;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miLaden;
    private javax.swing.JMenuItem miSpeichern;
    private javax.swing.JSlider slLuftfeuchtigkeit;
    private javax.swing.JSlider slTemperatur;
    // End of variables declaration//GEN-END:variables
}
