
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.parser.DTDConstants;
import java.sql.SQLException;
import java.util.Properties;


public class CarPlate extends javax.swing.JFrame {
    
   
    

   
    public CarPlate() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_carplate = new javax.swing.JTextField();
        jb_yil = new javax.swing.JComboBox();
        jb_driver = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartable = new javax.swing.JTable();
        add_btn = new javax.swing.JButton();
        jb_guncelle = new javax.swing.JButton();
        jb_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Car Plate ");

        jLabel3.setText("Model");

        jLabel4.setText("Driver of Car");

        jb_yil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", " " }));

        cartable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Plate", "Model", "Driver of Car"
            }
        ));
        cartable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cartable);

        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        jb_guncelle.setText("Update");
        jb_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guncelleActionPerformed(evt);
            }
        });

        jb_delete.setText("Delete");
        jb_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_yil, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_carplate, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_driver, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(jb_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_carplate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jb_yil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_guncelle))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jb_driver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_delete))
                .addGap(19, 19, 19)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
           mesaj_yazisi.setText("");
           DefaultTableModel model = (DefaultTableModel)cartable.getModel();
           
           if(tf_carplate.getText().trim().equals("")){
               mesaj_yazisi.setText("This place cannot be empty...");
               
           }
           else{
               Object[] eklenecek = {tf_carplate.getText(),jb_yil.getSelectedItem().toString(),jb_driver.getText()};
               
               
               model.addRow(eklenecek);
               
           }
           
    }//GEN-LAST:event_add_btnActionPerformed

    private void jb_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guncelleActionPerformed
       mesaj_yazisi.setText("");
       
       DefaultTableModel model = (DefaultTableModel) cartable.getModel();
       
       int secili_row = cartable.getSelectedRow();
       
       if(secili_row == -1){
           
           if(cartable.getRowCount() == 0){
               
               mesaj_yazisi.setText("Cars table is empty");
           }
           
           else{
               
               mesaj_yazisi.setText("You have to select car's plate");
           }
       }
       else{
          
           model.setValueAt(tf_carplate.getText(), secili_row, 0);
           model.setValueAt(jb_yil.getSelectedItem().toString(), secili_row, 1);
           model.setValueAt(jb_driver.getText(), secili_row, 2);
           
           mesaj_yazisi.setText("Update is Succesfully");
       }
    }//GEN-LAST:event_jb_guncelleActionPerformed

    private void cartableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartableMouseClicked
       
        DefaultTableModel model = (DefaultTableModel) cartable.getModel();
        
        int secili_row = cartable.getSelectedRow();
        
        tf_carplate.setText(model.getValueAt(secili_row, 0).toString());
        jb_yil.setSelectedItem(model.getValueAt(secili_row, 1).toString());
        jb_driver.setText(model.getValueAt(secili_row, 2).toString());
        
        
    }//GEN-LAST:event_cartableMouseClicked

    private void jb_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_deleteActionPerformed
        
        mesaj_yazisi.setText("");
        DefaultTableModel model = (DefaultTableModel) cartable.getModel();
       
        int secili_row = cartable.getSelectedRow();
        if(secili_row == -1 ){
         if(cartable.getRowCount() == 0){
            
            mesaj_yazisi.setText("Cars table is empty");
        }
        else {
            mesaj_yazisi.setText("You Have to Select Car");
        }
        
    }//GEN-LAST:event_jb_deleteActionPerformed
        else{
            
            model.removeRow(secili_row);
            
            mesaj_yazisi.setText("Car deleted");
        }
    }
   
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(CarPlate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarPlate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarPlate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarPlate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Connection dbConnection = null;
        try {
            
            Connection myConn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/carplate?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","1234");
            Statement myStat = (Statement) myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("select * from cars");
            while(myRs.next()){
                System.out.print(myRs.getString("car_plate")); 
            }
        }catch(Exception e){
            e.printStackTrace();
            
        }
    

    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarPlate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JTable cartable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_delete;
    private javax.swing.JTextField jb_driver;
    private javax.swing.JButton jb_guncelle;
    private javax.swing.JComboBox jb_yil;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JTextField tf_carplate;
    // End of variables declaration//GEN-END:variables
}
