/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8terem;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JList;
import java.awt.*;  
import java.io.IOException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import static pkg8terem.Main.*;
/**
 *
 * @author tobak
 */
public class MenuHozzaadasa extends javax.swing.JFrame {
    DefaultListModel mod=new DefaultListModel();
    /**
     * Creates new form MenuHozzaadasa
     */
    public MenuHozzaadasa() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EtteremLista = new javax.swing.JList<>();
        Hozzaad = new javax.swing.JButton();
        NevInput = new javax.swing.JTextField();
        ArInput = new javax.swing.JTextField();
        OsszetevokInput = new javax.swing.JTextField();
        AllergenekInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Vissza = new javax.swing.JButton();
        Főétel = new javax.swing.JRadioButton();
        Előétel = new javax.swing.JRadioButton();
        Desszert = new javax.swing.JRadioButton();
        Ital = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(3, 41, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Jelenlegi menü:");

        EtteremLista.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(EtteremLista);

        Hozzaad.setText("Hozáad");
        Hozzaad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HozzaadActionPerformed(evt);
            }
        });

        NevInput.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NevInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NevInputActionPerformed(evt);
            }
        });

        ArInput.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ArInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArInputActionPerformed(evt);
            }
        });

        OsszetevokInput.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        AllergenekInput.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Név");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Ár");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Összetevők");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Allergének");

        Vissza.setText("Vissza");
        Vissza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisszaActionPerformed(evt);
            }
        });

        buttonGroup1.add(Főétel);
        Főétel.setText("Főétel");
        Főétel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FőételActionPerformed(evt);
            }
        });

        buttonGroup1.add(Előétel);
        Előétel.setText("Előétel");
        Előétel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElőételActionPerformed(evt);
            }
        });

        buttonGroup1.add(Desszert);
        Desszert.setText("Desszert");
        Desszert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesszertActionPerformed(evt);
            }
        });

        buttonGroup1.add(Ital);
        Ital.setText("Ital");
        Ital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Főétel)
                                .addComponent(jLabel5)))))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OsszetevokInput, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArInput, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NevInput, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(AllergenekInput, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(Hozzaad))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(Előétel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Desszert)
                                .addGap(108, 108, 108)
                                .addComponent(Ital)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Vissza)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(NevInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ArInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OsszetevokInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllergenekInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hozzaad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Vissza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Főétel)
                    .addComponent(Előétel)
                    .addComponent(Desszert)
                    .addComponent(Ital))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        EtteremLista.setModel(mod);
    }//GEN-LAST:event_formWindowActivated
    
    private void NevInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NevInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NevInputActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

         this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void ArInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArInputActionPerformed

    private void VisszaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisszaActionPerformed
      this.setVisible(true);
    }//GEN-LAST:event_VisszaActionPerformed

    private void HozzaadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HozzaadActionPerformed
        int category=-1;
        String qwe="";
        for (Enumeration<AbstractButton> buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
               qwe= button.getText();
               if(qwe=="Főétel"){
                   category=1;
               }
               else if(qwe=="Előétel"){
                   category=0;
               }
               else if(qwe=="Desszert"){
                   category=2;
               }
               else if(qwe=="Ital"){
                   category=3;
                       }
            }
        }
        
        if(!NevInput.getText().isEmpty()&&!ArInput.getText().isEmpty()&&!OsszetevokInput.getText().isEmpty()&&!AllergenekInput.getText().isEmpty()){
        String mealName = NevInput.getText();
        int mealPrice = Integer.parseInt(ArInput.getText());
        String mealIngredients = OsszetevokInput.getText();
        String mealAllergens = AllergenekInput.getText();
        try {
            businessManager.addMealToMenu(mealName,mealPrice,mealIngredients,mealAllergens,category);
        } catch (IOException ex) {
            Logger.getLogger(MenuHozzaadasa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_HozzaadActionPerformed

    private void FőételActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FőételActionPerformed
       mod.clear();
       int foetel=1;
        for(int i=0;i<businessManager.getManagedRestaurant().getMenu().get(foetel).getMeals().size();i++)
     {
         mod.addElement(businessManager.getManagedRestaurant().getMenu().get(foetel).getMeals().get(i).getName()+" "+businessManager.getManagedRestaurant().getMenu().get(foetel).getMeals().get(i).getCost());
     }
    }//GEN-LAST:event_FőételActionPerformed

    private void DesszertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesszertActionPerformed
     mod.clear();
     int desszert = 2;
        for(int i=0;i<businessManager.getManagedRestaurant().getMenu().get(desszert).getMeals().size();i++)
     {
         mod.addElement(businessManager.getManagedRestaurant().getMenu().get(desszert).getMeals().get(i).getName()+" "+businessManager.getManagedRestaurant().getMenu().get(desszert).getMeals().get(i).getCost());
     }
    }//GEN-LAST:event_DesszertActionPerformed

    private void ItalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItalActionPerformed
     mod.clear();
     int ital=3;
        for(int i=0;i<businessManager.getManagedRestaurant().getMenu().get(ital).getMeals().size();i++)
     {
         mod.addElement(businessManager.getManagedRestaurant().getMenu().get(ital).getMeals().get(i).getName()+" "+businessManager.getManagedRestaurant().getMenu().get(ital).getMeals().get(i).getCost());
     }
    }//GEN-LAST:event_ItalActionPerformed

    private void ElőételActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElőételActionPerformed
      mod.clear();
      int eloetel=0;
        for(int i=0;i<businessManager.getManagedRestaurant().getMenu().get(eloetel).getMeals().size();i++)
     {
         mod.addElement(businessManager.getManagedRestaurant().getMenu().get(eloetel).getMeals().get(i).getName()+" "+businessManager.getManagedRestaurant().getMenu().get(eloetel).getMeals().get(i).getCost());
     }
    }//GEN-LAST:event_ElőételActionPerformed


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
            java.util.logging.Logger.getLogger(MenuHozzaadasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuHozzaadasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuHozzaadasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuHozzaadasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuHozzaadasa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AllergenekInput;
    private javax.swing.JTextField ArInput;
    private javax.swing.JRadioButton Desszert;
    private javax.swing.JRadioButton Előétel;
    private javax.swing.JList<String> EtteremLista;
    private javax.swing.JRadioButton Főétel;
    private javax.swing.JButton Hozzaad;
    private javax.swing.JRadioButton Ital;
    private javax.swing.JTextField NevInput;
    private javax.swing.JTextField OsszetevokInput;
    private javax.swing.JButton Vissza;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
