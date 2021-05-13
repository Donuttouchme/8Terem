/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8terem;

import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JList;
import java.awt.*;  
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.Pair;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import static pkg8terem.Main.*;
import static pkg8terem.Foablak.*;
/**
 *
 * @author tobak
 */
public class EtelekListazasa extends javax.swing.JFrame {

    /**
     * Creates new form frame2
     */
    public EtelekListazasa() {
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
        Rendelés = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RendelesLista = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        Eltavolitas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        EtlapLista = new javax.swing.JList<>();
        AllergenekListazas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        OsszetevokLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        EtteremNeveLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Hozzaadas = new javax.swing.JButton();
        RendelesDarabszama = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Rendelés.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Rendelés.setText("Rendelés");
        Rendelés.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RendelésActionPerformed(evt);
            }
        });

        RendelesLista.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(RendelesLista);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Ön rendelése");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setText("Készpénz");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setText("Szépkártya");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton3.setText("Bankkártya");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Fizetés módja: ");

        Eltavolitas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Eltavolitas.setText("Eltávolítás");
        Eltavolitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EltavolitasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(Rendelés)
                        .addGap(18, 18, 18)
                        .addComponent(Eltavolitas, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rendelés, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eltavolitas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel2.setBackground(new java.awt.Color(3, 41, 80));

        EtlapLista.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane2.setViewportView(EtlapLista);

        AllergenekListazas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AllergenekListazas.setText("Étel összetevői");
        AllergenekListazas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllergenekListazasActionPerformed(evt);
            }
        });

        OsszetevokLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OsszetevokLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(OsszetevokLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        EtteremNeveLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        EtteremNeveLabel.setText("Étlap");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(EtteremNeveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EtteremNeveLabel)
                .addContainerGap())
        );

        Hozzaadas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Hozzaadas.setText("Hozzáadás");
        Hozzaadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HozzaadasActionPerformed(evt);
            }
        });

        RendelesDarabszama.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RendelesDarabszama.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("db");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RendelesDarabszama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hozzaadas)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hozzaadas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RendelesDarabszama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(AllergenekListazas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(AllergenekListazas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing
DefaultListModel rendelesmod=new DefaultListModel();
DefaultListModel etlapmod=new DefaultListModel();
    private void HozzaadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HozzaadasActionPerformed
         int db=(int) RendelesDarabszama.getValue();
        String selected = EtlapLista.getSelectedValue().toString();
        if(!(selected=="Előételek: "||selected=="Főételek: "||selected=="Desszertek: "||selected=="Italok: "))
        rendelesmod.addElement(selected+" - "+db+" db");            
    }//GEN-LAST:event_HozzaadasActionPerformed

    private void EltavolitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EltavolitasActionPerformed
        int size=RendelesLista.getModel().getSize();
        int selected = RendelesLista.getSelectedIndex();
        if(size>0 && selected!=-1){
        System.out.println(selected);
        ((DefaultListModel) RendelesLista.getModel()).remove(selected);
        }
        
    }//GEN-LAST:event_EltavolitasActionPerformed

    private void RendelésActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RendelésActionPerformed
              int response = -1;
        String qwe="";
        for (Enumeration<AbstractButton> buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
               qwe= button.getText();
               if(null==qwe){
                   response=2;
               }
               else switch (qwe) {
                    case "Bankkártya":
                        response=1;
                        break;
                    case "Készpénz":
                        response=0;
                        break;
                    default:
                        response=2;
                        break;
                }
            }
        }
        
        
        Map<Meal,Integer> orderMap;      
        orderMap = new HashMap<>();
        List<String> orderedMealsList = new ArrayList();
        for(int i=0;i<RendelesLista.getModel().getSize();i++)
        {
            String [] arrofStr =RendelesLista.getModel().getElementAt(i).split(" - ");
            String mealName=arrofStr[0]+" "+arrofStr[1];
            orderedMealsList.add(mealName);
        }
        for(int i=0;i<4;i++)
            {
                for(int j=0;j<restaurant.getMenu().get(i).getMeals().size();j++)
                {
                    for(int k=0;k<Main.discounts.size();k++)
                    {
                        if(restaurant.getMenu().get(i).getMeals().get(j).getId()==Main.discounts.get(k).getFoodID())
                        {
                            restaurant.getMenu().get(i).getMeals().get(j).setDiscounted(true);
                            restaurant.getMenu().get(i).getMeals().get(j).setDiscountAmount(Main.discounts.get(k).getDiscountPercentage());
                        }           
                    }
                }
            }
        
        
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<restaurant.getMenu().get(i).getMeals().size();j++)
            {
                for(int k=0;k<orderedMealsList.size();k++)
                {
                    String [] iforderedMealslist=orderedMealsList.get(k).split(" ");
                    if(iforderedMealslist[0].equals(restaurant.getMenu().get(i).getMeals().get(j).getName()))
                    {
                        if(restaurant.getMenu().get(i).getMeals().get(j).isDiscounted())
                    {
                        float d1 = (float) ((float)restaurant.getMenu().get(i).getMeals().get(j).getDiscountAmount()/100);
                        float d2 = (float) 1-d1;  
                        float discountedPrice=(float) ((float)restaurant.getMenu().get(i).getMeals().get(j).getCost()*d2);                        
                        restaurant.getMenu().get(i).getMeals().get(j).setCost((int)discountedPrice);
                        float parseFloat = Float.parseFloat(iforderedMealslist[2]);
                        orderMap.put(restaurant.getMenu().get(i).getMeals().get(j),(int)parseFloat);
                    }
                    else
                    {
                        float parseFloat = Float.parseFloat(iforderedMealslist[2]);
                        orderMap.put(restaurant.getMenu().get(i).getMeals().get(j),(int)parseFloat);
                    }
//                        for(int l=0;l<Main.discounts.size();l++){
//                            if(Main.discounts.get(l).getFoodID()==restaurant.getMenu().get(i).getMeals().get(j).getId()){
//                                int original=restaurant.getMenu().get(i).getMeals().get(j).getCost();
//                                restaurant.getMenu().get(i).getMeals().get(j).setCost(restaurant.getMenu().get(i).getMeals().get(j).getCost()*(1-(Main.discounts.get(l).getDiscountPercentage()/100)));
//                        orderMap.put(restaurant.getMenu().get(i).getMeals().get(j), Collections.frequency(orderedMealsList, restaurant.getMenu().get(i).getMeals().get(j).getName()));   
//                                restaurant.getMenu().get(i).getMeals().get(j).setCost(original);
//                            }
//                        }
                    }
                }
            }
        }
       
        Object[] options = {"Rendelés véglegesítése","Vissza a rendelésemhez",};
        int n = JOptionPane.showOptionDialog(null,
            "Ide kell beírni hogy mit szeretnél kiírni\n asd",
            "Rendelés véglegesítése",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[1]);
        if(n==YES_OPTION){
        try {   
            objectOutputStream.writeObject(new Order(restaurant.getRestaurantID(),guest.getGuestID(),orderMap,response));
            objectOutputStream.flush();
            objectOutputStream.reset();
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<restaurant.getMenu().get(i).getMeals().size();j++)
                {
                    for(int k=0;k<Main.discounts.size();k++)
                    {
                        if(restaurant.getMenu().get(i).getMeals().get(j).isDiscounted())
                        {
                            datas=new Pair<>(restaurant,3);
                            objectOutputStream.writeObject(datas);
                            objectOutputStream.flush();
                            objectOutputStream.reset();
                            restaurant.setMenu((List<Menu>)objectInputStream.readObject());
                        }           
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(EtelekListazasa.class.getName()).log(Level.SEVERE, null, ex);
        }         catch (ClassNotFoundException ex) {
                      Logger.getLogger(EtelekListazasa.class.getName()).log(Level.SEVERE, null, ex);
                  }
        this.setVisible(false);
        }
        else if(n==NO_OPTION){
            
        }
    }//GEN-LAST:event_RendelésActionPerformed

    private void AllergenekListazasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllergenekListazasActionPerformed
        String selected = EtlapLista.getSelectedValue().toString(); //valami lista vagy adattag i edik osszetevoit ebből lekérni
        String osszefuzott="";
        String masikosszefuzott="";
       for(int i=0;i<4;i++)
        {
            for(int j=0;j<restaurant.getMenu().get(i).getMeals().size();j++)
            {
                masikosszefuzott=restaurant.getMenu().get(i).getMeals().get(j).getName()+" "+restaurant.getMenu().get(i).getMeals().get(j).getCost();
                if(masikosszefuzott.equals(selected))
                {
                    osszefuzott="Allergének: "+restaurant.getMenu().get(i).getMeals().get(j).getAllergens()+"\n Összetevők:"+restaurant.getMenu().get(i).getMeals().get(j).getIngredients();
                    OsszetevokLabel.setText(osszefuzott);
                }
            }
        }
    }//GEN-LAST:event_AllergenekListazasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            RendelesLista.setModel(rendelesmod);
            EtlapLista.setModel(etlapmod);
            Main.datas= new Pair<>(restaurant,2);
            Main.objectOutputStream.writeObject(Main.datas);
            Main.objectOutputStream.flush();
            Main.objectOutputStream.reset();
            Main.discounts=(List<Discount>)Main.objectInputStream.readObject();
            String valami;
            List<Integer> dontShow= new ArrayList<>();
            
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<restaurant.getMenu().get(i).getMeals().size();j++)
                {
                    for(int k=0;k<Main.discounts.size();k++)
                    {
                        if(restaurant.getMenu().get(i).getMeals().get(j).getId()==Main.discounts.get(k).getFoodID())
                        {
                            restaurant.getMenu().get(i).getMeals().get(j).setDiscounted(true);
                            restaurant.getMenu().get(i).getMeals().get(j).setDiscountAmount(Main.discounts.get(k).getDiscountPercentage());
                        }           
                    }
                }
            }
            
            
            for(int i=0;i<4;i++)
            {
                switch (i) {
                    case 0:
                        etlapmod.addElement("Előételek: ");
                        break;
                    case 1:
                        etlapmod.addElement("Főételek: ");
                        break;
                    case 2:
                        etlapmod.addElement("Desszertek: ");
                        break;
                    default:
                        etlapmod.addElement("Italok: ");
                        break;
                }
                
                for(int j=0;j<restaurant.getMenu().get(i).getMeals().size();j++)
                {                   
   
                    if(restaurant.getMenu().get(i).getMeals().get(j).isDiscounted())
                    {
                        float d1 = (float) ((float)restaurant.getMenu().get(i).getMeals().get(j).getDiscountAmount()/100);
                        float d2 = (float) 1-d1;  
                        float dcam=(float) ((float)restaurant.getMenu().get(i).getMeals().get(j).getCost()*d2);
                        System.out.println("d1: "+d1+" d2: "+d2+" dcam: " +dcam);
                        valami = (restaurant.getMenu().get(i).getMeals().get(j).getName()+" "+ dcam);
                        etlapmod.addElement(valami);
                    }
                    else
                    {
                        valami = (restaurant.getMenu().get(i).getMeals().get(j).getName()+" "+ restaurant.getMenu().get(i).getMeals().get(j).getCost());
                        etlapmod.addElement(valami);
                    }
                }
                
            }
        } catch (IOException ex) {
            Logger.getLogger(EtelekListazasa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EtelekListazasa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EtelekListazasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EtelekListazasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EtelekListazasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EtelekListazasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EtelekListazasa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllergenekListazas;
    private javax.swing.JButton Eltavolitas;
    private javax.swing.JList<String> EtlapLista;
    private javax.swing.JLabel EtteremNeveLabel;
    private javax.swing.JButton Hozzaadas;
    private javax.swing.JLabel OsszetevokLabel;
    private javax.swing.JSpinner RendelesDarabszama;
    private javax.swing.JList<String> RendelesLista;
    private javax.swing.JButton Rendelés;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
