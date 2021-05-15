/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8terem;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.Pair;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tobak
 */
public class FutarLoggedIn extends javax.swing.JFrame {

    /**
     * Creates new form FutarLoggedIn
     */
    public FutarLoggedIn() {
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
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        teljesítőLista = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        felvevőLista = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        ElerhetosegSzerk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Kiszállítva");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        teljesítőLista.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane2.setViewportView(teljesítőLista);

        felvevőLista.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(felvevőLista);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Kiszállítás vállalása");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ElerhetosegSzerk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ElerhetosegSzerk.setText("Elérhetőség szerkesztése");
        ElerhetosegSzerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElerhetosegSzerkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(286, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ElerhetosegSzerk)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(ElerhetosegSzerk, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    FutarElerhetosegSzerkesztes futarSzerk =null;
    private void ElerhetosegSzerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElerhetosegSzerkActionPerformed
     if(futarSzerk==null){
        futarSzerk = new FutarElerhetosegSzerkesztes();
        futarSzerk.setVisible(rootPaneCheckingEnabled);
        }
     else
         futarSzerk.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_ElerhetosegSzerkActionPerformed
DefaultListModel felvetelLista=new DefaultListModel();
DefaultListModel teljesitesLista=new DefaultListModel();
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String selected = felvevőLista.getSelectedValue();
         if(selected!=null){       
            try {
                teljesitesLista.addElement(selected);
                String []strArray = selected.split(" ");
                
                Main.datas=new Pair<>(new Pair<>(Main.courier.getCourierID(),Integer.parseInt(strArray[0])),5);
                Main.objectOutputStream.writeObject(Main.datas);
                Main.objectOutputStream.flush();
                Main.objectOutputStream.reset();
                Main.orders = (List<Order>) Main.objectInputStream.readObject();
                updateLists();
                JOptionPane.showMessageDialog(null, "A rendelés kiszállítása önhöz lett rendelve");
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(FutarLoggedIn.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String selected = teljesítőLista.getSelectedValue();
         if(selected!=null){
            try {
                String[] strArray=selected.split(" ");
                Order sendOrder = new Order();
                for(int i=0;i<Main.orders.size();i++)
                {
                    if(Main.orders.get(i).getBatchID()==Integer.parseInt(strArray[0]))
                    {
                        sendOrder=Main.orders.get(i);
                    }
                }
                Main.datas=new Pair<>(sendOrder,1);
                Main.objectOutputStream.writeObject(Main.datas);
                Main.objectOutputStream.flush();
                Main.objectOutputStream.reset();
                Main.orders = (List<Order>) Main.objectInputStream.readObject();
                updateLists();
                
                
                JOptionPane.showMessageDialog(null, "A kiválasztott rendelés állapota teljesítetté változott,\nés a listából törlésre került");
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(FutarLoggedIn.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        teljesítőLista.setModel(teljesitesLista);
        felvevőLista.setModel(felvetelLista);
        
        String fizetesmodja="";
        for(int i=0;i<Main.orders.size();i++)
        {
            if(Main.orders.get(i).getOrderStatus()==2){
            if(Main.orders.get(i).getCourierID()==Main.courier.getCourierID())
            {
                switch(Main.orders.get(i).getPaymentMethod()){
                case 0:
                fizetesmodja="Készpénz";
                break;
            case 1:
                fizetesmodja="Bankkártya";
                break;
            default:
                fizetesmodja="SZÉP kártya";
                break;
                }
                        
                    
                String kiiratni=Main.orders.get(i).getBatchID()+" "+Main.orders.get(i).getRestaurantName()+" "+Main.orders.get(i).getGuestAddress()+" "+Main.orders.get(i).getGuestName()+" "+Main.orders.get(i).getGuestPNumber()+" "+Main.orders.get(i).getSum();
                teljesitesLista.addElement(kiiratni);
            }
            }            
        }
         for(int i=0;i<Main.orders.size();i++)
        {
            if(Main.orders.get(i).getOrderStatus()==2){
            if(Main.orders.get(i).getCourierID()==0)
            {
                switch(Main.orders.get(i).getPaymentMethod()){
                case 0:
                fizetesmodja="Készpénz";
                break;
            case 1:
                fizetesmodja="Bankkártya";
                break;
            default:
                fizetesmodja="SZÉP kártya";
                break;
                }
                String kiiratni=Main.orders.get(i).getBatchID()+" "+Main.orders.get(i).getRestaurantName()+" "+Main.orders.get(i).getGuestAddress()+" "+Main.orders.get(i).getGuestName()+" "+Main.orders.get(i).getGuestPNumber()+" "+Main.orders.get(i).getSum()+" "+fizetesmodja;
                felvetelLista.addElement(kiiratni);
            }
        }
            }       
        
    }//GEN-LAST:event_formWindowOpened
    /**
     * @param args the command line arguments
     */
    
    public void updateLists()
    {
        felvetelLista.clear();
        teljesitesLista.clear();
       
                String fizetesmodja="";
        for(int i=0;i<Main.orders.size();i++)
        {
            if(Main.orders.get(i).getOrderStatus()==2){
            if(Main.orders.get(i).getCourierID()==Main.courier.getCourierID())
            {
                switch(Main.orders.get(i).getPaymentMethod()){
                case 0:
                fizetesmodja="Készpénz";
                break;
            case 1:
                fizetesmodja="Bankkártya";
                break;
            default:
                fizetesmodja="SZÉP kártya";
                break;
                }
                        
                    
                String kiiratni=Main.orders.get(i).getBatchID()+" "+Main.orders.get(i).getRestaurantName()+" "+Main.orders.get(i).getGuestAddress()+" "+Main.orders.get(i).getGuestName()+" "+Main.orders.get(i).getGuestPNumber()+" "+Main.orders.get(i).getSum();
                teljesitesLista.addElement(kiiratni);
            }
            }            
        }
         for(int i=0;i<Main.orders.size();i++)
        {
            if(Main.orders.get(i).getOrderStatus()==2){
            if(Main.orders.get(i).getCourierID()==0)
            {
                switch(Main.orders.get(i).getPaymentMethod()){
                case 0:
                fizetesmodja="Készpénz";
                break;
            case 1:
                fizetesmodja="Bankkártya";
                break;
            default:
                fizetesmodja="SZÉP kártya";
                break;
                }
                String kiiratni=Main.orders.get(i).getBatchID()+" "+Main.orders.get(i).getRestaurantName()+" "+Main.orders.get(i).getGuestAddress()+" "+Main.orders.get(i).getGuestName()+" "+Main.orders.get(i).getGuestPNumber()+" "+Main.orders.get(i).getSum()+" "+fizetesmodja;
                felvetelLista.addElement(kiiratni);
            }
        }
            } 
    }
    
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
            java.util.logging.Logger.getLogger(FutarLoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FutarLoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FutarLoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FutarLoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FutarLoggedIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ElerhetosegSzerk;
    private javax.swing.JList<String> felvevőLista;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> teljesítőLista;
    // End of variables declaration//GEN-END:variables
}
