/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WarehouseEmployeeRole;

import Business.Organization.Organization;
import Business.WorkQueue.PlasticCollectorWorkRequest;
import Business.WorkQueue.BorrowPlasticWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.Organization.Warehouse;
/**
 *
 * @author raunak
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    PlasticCollectorWorkRequest request;
    Warehouse warehouse;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, PlasticCollectorWorkRequest request, Warehouse warehouse) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.warehouse = warehouse;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rateTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        gradeOfPlastic = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        commentField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        submitJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        submitJButton.setText("Purchase Plastic");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Rate Today");

        rateTextField.setEditable(false);
        rateTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rateTextField.setEnabled(false);

        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        gradeOfPlastic.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        gradeOfPlastic.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--", "Grade A", "Grade B", "Grade C" }));
        gradeOfPlastic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeOfPlasticActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Grade of Plastic");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Quality Analysis");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Comment:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(backJButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gradeOfPlastic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(commentField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rateTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                        .addGap(243, 243, 243))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(submitJButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gradeOfPlastic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(commentField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(submitJButton))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        WarehouseEmployeeWorkArea dwjp = (WarehouseEmployeeWorkArea) component;
        dwjp.populateTable1();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if(gradeOfPlastic.getSelectedIndex()==0)
        {
         JOptionPane.showMessageDialog(null, "Please select a value");
         return;
        }
        int rateToday = Integer.parseInt(rateTextField.getText());
        request.setMoneyGiven(rateToday*request.getQuant());
        request.setMessage(commentField.getText());
        request.setRewards(request.getQuant());
        System.out.println("###"+rateToday*request.getQuant());
        request.setStatus("Completed");
        request.setRewards(request.getMoneyGiven()/100);
        
        request.setTotalMoney(request.getTotalMoney()+request.getMoneyGiven());
        
        request.setGrade(gradeOfPlastic.getSelectedItem().toString());
        JOptionPane.showMessageDialog(null, "Checked and bought!!");
        
        int plastic = request.getQuant();
        warehouse.addPlastic(plastic);
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void gradeOfPlasticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeOfPlasticActionPerformed
        // TODO add your handling code here:
        if(gradeOfPlastic.getSelectedIndex()==1)
        {
        rateTextField.setText(String.valueOf(20));
        }
        
        if(gradeOfPlastic.getSelectedIndex()==2)
        {
        rateTextField.setText(String.valueOf(10));
        }
        
        if(gradeOfPlastic.getSelectedIndex()==3)
        {
        rateTextField.setText(String.valueOf(5));
        }
        
    }//GEN-LAST:event_gradeOfPlasticActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField commentField;
    private javax.swing.JComboBox gradeOfPlastic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField rateTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
