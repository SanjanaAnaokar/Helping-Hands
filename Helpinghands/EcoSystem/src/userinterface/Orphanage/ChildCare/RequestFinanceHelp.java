/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Orphanage.ChildCare;

import Business.Child.Child;
import Business.Child.ChildDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.Orphanage.ChildCareOrganization;
import Business.Organization.Orphanage.FinanceOrphanageOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FinanceCCWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rao.sid
 */
public class RequestFinanceHelp extends javax.swing.JPanel {

    /**
     * Creates new form RequestFinanceHelp
     */
  JPanel userProcessContainer;
  UserAccount account;
  ChildCareOrganization organization;
  Enterprise enterprise;
  EcoSystem business;
  ChildDirectory directory;
  Child child;
  String data;
    Network network;

   public RequestFinanceHelp(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory directory, Child child, String data) {
     initComponents();
     this.userProcessContainer=userProcessContainer;
     this.account=account;
     this.organization = (ChildCareOrganization) organization;
     this.enterprise=enterprise;
     this.business=business;
     this.directory=directory;
     this.child=child;
     
     	
	 for(Network net: business.getNetworkList()){
      for(Enterprise ent: net.getEnterpriseDirectory().getEnterpriseList()){
          if(ent.equals(enterprise)){
              network= net;
          }
      }
  }
  
     
     jTextArea1.removeAll();;
     jTextArea1.setText("Amentities requested: "+data);
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Requested Amenities: ");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Message: ");

        submitBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(500, 500, 500))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
       if(jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter the Message for finance team");
            return;
        }
        FinanceCCWorkRequest fccwr = new FinanceCCWorkRequest();
    fccwr.setStatus("Requesting funds");
        fccwr.setMessage(jTextField1.getText()+" "+jTextArea1.getText());
        fccwr.setSender(account);
        fccwr.setChildId(child.getChildId());
        fccwr.setRemarks("Request for Finance Team");
        
         /*
        The below set of code iterates through the network list and get the network
        Once the network is received then it iterates over all the enterprises present in the network
        It goes thought every organization in the enterprise.
        
        Once it has found the Doctor organization, it sets the organization as Doctor organization
        
        */
        Organization org = null;
        for (Network network : business.getNetworkList()){
           // getNetworkList().getOrganizationDirectory().getOrganizationList()
            System.out.println("network: "+network);
            for(Enterprise ent: network.getEnterpriseDirectory().getEnterpriseList()){
                
                for(Organization organization: ent.getOrganizationDirectory().getOrganizationList()){
                   
                
			// if(this.network.equals(network)){
if (organization instanceof FinanceOrphanageOrganization){
		org = organization;
		break;
		}
		//}
            
        }
            }
        }
/*The below if code checks if there is some value for org. If there is then add the work request 
        - At the organization level, where other organization in the same enterprise can access it
        -At the account level, so the child registration can also see the request created
        - At the business level, as the request has to be transferred to a different organization in a different enterprise.
        */
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(fccwr);
          
            account.getWorkQueue().getWorkRequestList().add(fccwr);
             business.getWorkQueue().getWorkRequestList().add(fccwr);
    
        }
        ViewCompleteChildDetails vccd = new ViewCompleteChildDetails(userProcessContainer, account, organization, enterprise, business, directory, child);
        this.userProcessContainer.add("ViewCompleteChildDetails", vccd);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_submitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
