/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8terem;

/**
 *
 * @author tobak
 */


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.Pair;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class DiscountGui extends javax.swing.JFrame {

    /**
     * Creates new form DiscountGui
     */
    public DiscountGui() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(3, 41, 80));

        jList1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Kedvezmény ");

        jSpinner1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("%");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Kedvezmény alkalmazása");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Kedvezmény törlése");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int kedvezmeny = (int) jSpinner1.getValue();
        String selected = jList1.getSelectedValue();
        System.out.println("Gomb megnyomva");
        try {
            selected = selected.substring(0,selected.indexOf(","));
            System.out.println("Nem ugrik fel semmi");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nem választott ki semmit, sikertelen a kedvezmény alkalmazása!");
        }
        
        for(int i=0;i<Main.businessManager.getManagedRestaurant().getMenu().size();i++)
       {
           for(int j=0;j<Main.businessManager.getManagedRestaurant().getMenu().get(i).getMeals().size();j++){
           if(Main.businessManager.getManagedRestaurant().getMenu().get(i).getMeals().get(j).getName().equals(selected))
           {
               try {
                   int sizeofDsc;
                   Discount newDiscount = new Discount();
                   if(Main.discounts.size()==0)
                   {
                       sizeofDsc = 0;
                       newDiscount = new Discount(1,kedvezmeny,Main.businessManager.getManagedRestaurant().getMenu().get(i).getMeals().get(j).getId(),Main.businessManager.getManagedRestaurant().getRestaurantID());
                       
                   }
                   else
                   {
                   sizeofDsc=Main.discounts.size()-1;
                   newDiscount= new Discount(Main.discounts.get(sizeofDsc).getDiscountID()+1,kedvezmeny,Main.businessManager.getManagedRestaurant().getMenu().get(i).getMeals().get(j).getId(),Main.businessManager.getManagedRestaurant().getRestaurantID());
                   }                  
                   Main.datas=new Pair<>(newDiscount,1);
                   System.out.println("Discount küldés előtt");
                   Main.objectOutputStream.writeObject(Main.datas);
                   System.out.println("Discount küldés után");
                   Main.objectOutputStream.flush();
                   Main.objectOutputStream.reset();
                   Main.discounts=(List<Discount>) Main.objectInputStream.readObject();
                   System.out.println("Megkapta a frissített discount listát");
               } catch (IOException | ClassNotFoundException ex) {
                   Logger.getLogger(DiscountGui.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           else
               System.out.println("Nem futott az if-be");
       }
    }     
    }//GEN-LAST:event_jButton1ActionPerformed
    DefaultListModel lista= new DefaultListModel();
    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
       
    }//GEN-LAST:event_jList1ValueChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {                                  
            jList1.setModel(lista);
            String valami = "";
            Main.datas=new Pair<>(Main.businessManager.getManagedRestaurant(),2);
            Main.objectOutputStream.writeObject(Main.datas);
            Main.objectOutputStream.flush();
            Main.objectOutputStream.reset();
            Main.discounts=(List<Discount>) Main.objectInputStream.readObject();
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<Main.businessManager.getManagedRestaurant().getMenu().get(i).getMeals().size();j++)
                {
                    for(int k=0;k<Main.discounts.size();k++)
                    {
                        if(Main.businessManager.getManagedRestaurant().getMenu().get(i).getMeals().get(j).getId()==Main.discounts.get(k).getFoodID())
                        {
                            Main.businessManager.getManagedRestaurant().getMenu().get(i).getMeals().get(j).setDiscounted(true);
                            Main.businessManager.getManagedRestaurant().getMenu().get(i).getMeals().get(j).setDiscountAmount(Main.discounts.get(k).getDiscountPercentage());
                        }           
                    }
                }
            }
            
            
            for(int i=0;i<4;i++)
            {
                switch (i) {
                    case 0:
                        lista.addElement("Előételek: ");
                        break;
                    case 1:
                        lista.addElement("Főételek: ");
                        break;
                    case 2:
                        lista.addElement("Desszertek: ");
                        break;
                    default:
                        lista.addElement("Italok: ");
                        break;
                }
                
                for(int j=0;j<Main.businessManager.getManagedRestaurant().getMenu().get(i).getMeals().size();j++)
                {                   
   
                    if(Main.businessManager.getManagedRestaurant().getMenu().get(i).getMeals().get(j).isDiscounted())
                    {
                        float d1 = (float) ((float)Main.businessManager.getManagedRestaurant().getMenu().get(i).getMeals().get(j).getDiscountAmount()/100);
                        float d2 = (float) 1-d1;  
                        float dcam=(float) ((float)Main.businessManager.getManagedRestaurant().getMenu().get(i).getMeals().get(j).getCost()*d2);
                        valami = (Main.businessManager.getManagedRestaurant().getMenu().get(i).getMeals().get(j).getName()+" "+ dcam);
                        lista.addElement(valami);
                    }
                    else
                    {
                        valami = (Main.businessManager.getManagedRestaurant().getMenu().get(i).getMeals().get(j).getName()+" "+ Main.businessManager.getManagedRestaurant().getMenu().get(i).getMeals().get(j).getCost());
                        lista.addElement(valami);
                    }
                }
                
            }
        } catch (IOException ex) {
            Logger.getLogger(DiscountGui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DiscountGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DiscountGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiscountGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiscountGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiscountGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiscountGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
