/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Orphanage.Finance;

import Business.Child.ChildDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Orphanage.FinanceOrphanageOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FinanceCCWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author rao.sid
 */
public class FinanceWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FinanceWorkAreaJPanel
     */
   JPanel userProcessContainer;
   UserAccount account;
   FinanceOrphanageOrganization financeOrphanageOrganization;
   Enterprise enterprise;
EcoSystem business;
ChildDirectory directory;
  int countApprove=0, countDeny=0, countPending=0; 
   //FinanceOrphProcessRequest orph;
public FinanceWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory directory) {
      initComponents();
      this.userProcessContainer=userProcessContainer;
      this.account=account;
      this.financeOrphanageOrganization=(FinanceOrphanageOrganization) organization;
      this.enterprise=enterprise;
      this.directory=directory;
      this.business=business;
            valueLabel.setText(financeOrphanageOrganization.getName());
            processBt.setEnabled(false);
            populateRequesttable();
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        assignBtn = new javax.swing.JButton();
        processBt = new javax.swing.JButton();
        freechartpanel = new javax.swing.JPanel();

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Child ID", "Remarks", "Results"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        assignBtn.setText("Assign to me");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        processBt.setText("Process");
        processBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBtActionPerformed(evt);
            }
        });

        freechartpanel.setBackground(new java.awt.Color(102, 102, 102));
        freechartpanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(freechartpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1148, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(processBt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processBt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(freechartpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBtActionPerformed
int selectedRow = jTable1.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }
        FinanceCCWorkRequest req = (FinanceCCWorkRequest) jTable1.getValueAt(selectedRow, 0);
        
               
        FinanceOrphProcessRequest fopr = new FinanceOrphProcessRequest( userProcessContainer,  account,  financeOrphanageOrganization,  enterprise,  business,  directory, req);
           userProcessContainer.add("FinanceOrphProcessRequest", fopr);
           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
      
//        
        
        
        
        
        
    }//GEN-LAST:event_processBtActionPerformed

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }
        FinanceCCWorkRequest req = (FinanceCCWorkRequest) jTable1.getValueAt(selectedRow, 0);
        req.setReceiver(account);
        req.setTestResult("Pending with Orphanage Finance Team");
        populateRequesttable();
          processBt.setEnabled(true);
    }//GEN-LAST:event_assignBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JPanel freechartpanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton processBt;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

    public void populateRequesttable() {
        DefaultTableModel dtms =(DefaultTableModel) jTable1.getModel();
        dtms.setRowCount(0);
        
        for(WorkRequest req: financeOrphanageOrganization.getWorkQueue().getWorkRequestList()){
            if(req instanceof FinanceCCWorkRequest){
                Object[] row = new Object[dtms.getColumnCount()];
                row[0]=req;
                row[1]=req.getSender();
                row[2]=req.getReceiver();
                row[3]=req.getChildId();
                String remarks = ((FinanceCCWorkRequest)req).getRemarks();
                row[4]=remarks;
                String result = ((FinanceCCWorkRequest)req).getTestResult();
                row[5]= result == null ? "Waiting" : result;
                
                if(result=="Approved"){
                    countApprove++;  
                  }
                 else if(result=="Denied"){
                      countDeny++;
                  }
                 else {
                     countPending++;
                 }
             dtms.addRow(row);
//                
                  
                 
            }
          
        }
        populateFreeChart();
            }

    public void populateFreeChart() {
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(countApprove, "Workqueue", "Approved");
        dataset.setValue(countDeny, "Workqueue", "Denied");
        dataset.setValue(countPending, "Workqueue", "Pending");
        
        JFreeChart free = ChartFactory.createBarChart("Finance Organization contribution", "Workqueue", "Count", dataset, PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot plot = free.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLUE);
        BarRenderer br = (BarRenderer) plot.getRenderer();
        br.setMaximumBarWidth(.05);
        ChartPanel chartPanel = new ChartPanel(free);
       
        freechartpanel.removeAll();
        freechartpanel.add(chartPanel, BorderLayout.CENTER);
       
        freechartpanel.validate();
                
    }
}
