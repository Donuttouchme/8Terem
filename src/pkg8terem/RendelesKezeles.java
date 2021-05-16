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
import static javax.swing.JOptionPane.showMessageDialog;
import static pkg8terem.Main.*;

/**
 *
 * @author tobak
 */
public class RendelesKezeles extends javax.swing.JFrame {

    /**
     * Creates new form RendelesKezeles
     */
    public RendelesKezeles() {
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
        RendelesekMegjeleniteseLista = new javax.swing.JList<>();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RendelesReszletek = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        szallitasiIdo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(3, 41, 80));

        RendelesekMegjeleniteseLista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                RendelesekMegjeleniteseListaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(RendelesekMegjeleniteseLista);

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jToggleButton1.setText("Szállításra kész");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Beérkezett rendelések");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(RendelesReszletek);

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jToggleButton2.setText("Elfogadás");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("szállítási idő");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("perc");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton2)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(szallitasiIdo, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(szallitasiIdo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DefaultListModel rendeleslista= new DefaultListModel();
    DefaultListModel reszletekLista= new DefaultListModel();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       RendelesekMegjeleniteseLista.setModel(rendeleslista);
       RendelesReszletek.setModel(reszletekLista);
       String fizetesmod="", statusz="";
       int sumbatchid=Main.orders.get(0).getBatchID();
       int sum=0;
      if(orders!=null){
       for(int i=0;i<Main.orders.size();i++)
       {           
           if(sumbatchid==orders.get(i).getBatchID())
           {
               sum+=orders.get(i).getSubsum();
           }
           if((sumbatchid!=orders.get(i).getBatchID())||i==orders.size()-1){              
               rendeleslista.addElement("Rendelés azonosító: " + orders.get(i-1).getBatchID()+" Fizetendő összeg: "+ sum + " Rendelés státusza: " + statusCheck(orders.get(i-1)).getKey());
               sum=0;
               sum+=orders.get(i).getSubsum();
               sumbatchid++;
                           
           }
       }
      }
      else
      {
          
      }
    }//GEN-LAST:event_formWindowOpened

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
    if(szallitasiIdo.getText()!=null){
        try{
        int ido= Integer.parseInt(szallitasiIdo.getText());
        String selected = RendelesekMegjeleniteseLista.getSelectedValue();
        String [] strArray=selected.split(" ");
        int orderid=0;
        for(int i=0;i<orders.size();i++)
        {
            if(orders.get(i).getBatchID()==Integer.parseInt(strArray[3])+1)
            {
                orders.get(i).setOrderStatus(1);
                orderid=i;
                setDeliveryTimeBM(orders.get(i),ido);
            }
        }
        Main.datas= new Pair<>(orders.get(orderid),1);
        try {
            Main.objectOutputStream.writeObject(Main.datas);
            System.out.println("Kiírta az obj");
            Main.objectOutputStream.flush();
            Main.objectOutputStream.reset();
            Main.orders =(List<Order>) Main.objectInputStream.readObject();
            System.out.println("megkapta az obj");
            updateList(orders);
            System.out.println("updatelte a lsitát");
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(RendelesKezeles.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("baj van");
        }
        }catch(NumberFormatException e){
            showMessageDialog(null, "Számot adjon meg%");
        } catch (IOException ex) {
            Logger.getLogger(RendelesKezeles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else{
         showMessageDialog(null, "Adja meg a szállítási időt!");
    }
    }//GEN-LAST:event_jToggleButton2ActionPerformed
    
    private void RendelesekMegjeleniteseListaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_RendelesekMegjeleniteseListaValueChanged
        String selected = RendelesekMegjeleniteseLista.getSelectedValue();
        String []strArray = selected.split(" ");
        if(selected != null){
        reszletekLista.clear();
        for(int i=0;i<orders.size();i++)
        {
            if(orders.get(i).getBatchID()==Integer.parseInt(strArray[2]))
            {
             reszletekLista.addElement(" Étel: " + orders.get(i).getMealName()+
           " Darabszám: "+ orders.get(i).getQuantity()+
           " Összeg: " + orders.get(i).getSubsum()+
           " Fizetési mód: " + statusCheck(orders.get(i)).getValue());
            }
        }
        }
        
//        RendelesekMegjeleniteseLista.getSelectedValue()
    }//GEN-LAST:event_RendelesekMegjeleniteseListaValueChanged

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        int selected = RendelesekMegjeleniteseLista.getSelectedIndex();
        int orderid=0;
        for(int i=0;i<orders.size();i++)
        {
            if(orders.get(i).getBatchID()==selected+1)
            {
                orders.get(i).setOrderStatus(4);
                orderid=i;
            }
        }
        Main.datas= new Pair<>(orders.get(orderid),1);
        try {
            Main.objectOutputStream.writeObject(Main.datas);
            System.out.println("kiirta az obj");
            Main.objectOutputStream.flush();
            Main.objectOutputStream.reset();
            Main.orders =(List<Order>) Main.objectInputStream.readObject();
            System.out.println("megkapta az orderst");
            updateList(orders);
            System.out.println("updatelte a listát");
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(RendelesKezeles.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Hibába futott");
        }
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed
 private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   

         this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
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
            java.util.logging.Logger.getLogger(RendelesKezeles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RendelesKezeles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RendelesKezeles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RendelesKezeles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RendelesKezeles().setVisible(true);
            }
        });
    }
    
    public Pair statusCheck(Order order)
    {
        String statusz="",fizetesmod="";
        if(order.getOrderStatus()==0)
           {
               statusz ="Visszaigazolásra vár";
           }
           if(order.getOrderStatus()==1)
           {
               statusz ="Készítés alatt";
           }
           if(order.getOrderStatus()==2)
           {
               statusz ="Szállítás alatt";
           }
           if(order.getOrderStatus()==3)
           {
               statusz ="Kiszállítva";
           }
           if(order.getOrderStatus()==4)
           {
               statusz="Szállítható";
           }
           if(order.getPaymentMethod()==0)
           {
               fizetesmod="Készpénz";
           }
           else if(order.getPaymentMethod()==1)
           {
               fizetesmod="Bankkártya";
           }
           else
           {
               fizetesmod="SZÉP kártya";
           }  
           return new Pair<String,String>(statusz, fizetesmod);
    }
    
    public void updateList(List<Order> orders)
    {
        reszletekLista.clear();
        rendeleslista.clear();
       int sumbatchid=1;
       int sum=0;
      if(orders!=null){
       for(int i=0;i<Main.orders.size();i++)
       {           
           if(sumbatchid==orders.get(i).getBatchID())
           {
               sum+=orders.get(i).getSubsum();
           }
           if((sumbatchid!=orders.get(i).getBatchID())|i==orders.size()-1){
               rendeleslista.addElement("Rendelés azonosító: " + orders.get(i-1).getBatchID()+" Fizetendő összeg: "+ sum + " Rendelés státusza: " + statusCheck(orders.get(i-1)).getKey());
               sum=0;
               sum+=orders.get(i).getSubsum();
               sumbatchid++;
               
           }           

                   
       }
      }
      else
      {
          
      }
        
    }
    
    public void setDeliveryTimeBM(Order order, int timeDel) throws IOException
    {
        order.setEstimated_time(timeDel);
        Main.datas=new Pair<>(order,2);
        Main.objectOutputStream.writeObject(Main.datas);
        Main.objectOutputStream.flush();
        Main.objectOutputStream.reset();
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> RendelesReszletek;
    private javax.swing.JList<String> RendelesekMegjeleniteseLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField szallitasiIdo;
    // End of variables declaration//GEN-END:variables
}
