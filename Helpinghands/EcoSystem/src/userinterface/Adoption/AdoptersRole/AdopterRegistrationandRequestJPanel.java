/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Adoption.AdoptersRole;

import Business.Adopter.Adopter;
import Business.Adopter.AdopterDirectory;
import Business.Child.ChildDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Adoption.AdopterOrganization;
import Business.Organization.Adoption.AdoptionOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdoptionWorkRequest;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.Adoption.AdoptionCheckRole.AdoptionCheckWorkAreaJPanel;

/**
 *
 * @author sanja
 */


 
public class AdopterRegistrationandRequestJPanel extends javax.swing.JPanel {

JPanel userProcessContainer;
UserAccount account;
Enterprise enterprise;
EcoSystem business;
AdopterDirectory udirectory;
AdopterOrganization adopterorganization;
int uid;
Adopter adopter;
ChildDirectory directory;
    public AdopterRegistrationandRequestJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business, Organization organization,AdopterDirectory udirectory,ChildDirectory directory) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.udirectory=udirectory;
        this.account=account;
        this.enterprise=enterprise;
        this.business = business;
        this.directory = directory;
        this.adopterorganization =(AdopterOrganization) organization;
        
        for(Adopter adop: udirectory.getAdoptersList()){
            if(adop.getUsername().equals(account.getUsername())){
                btnRegister.setEnabled(false);
                if(!adop.isFlag()){
                    BtnAdopt.setEnabled(true);
                }
                //BtnAdopt.setEnabled(true);
                btnCheckStatus.setEnabled(true);
                txtAge.setText(String.valueOf(adop.getAge()));
                txtName.setText(adop.getName());
                txtAnnualIncome.setText(String.valueOf(adop.getAnnualIncome()));
                txtEmailId.setText(adop.getEmailId());
                txtSsnNumber.setText(adop.getSsn());
                String g = adop.getGender();
                if(g.equals("Male")){
                   rdbMale.setSelected(true);
                }
                else{
                    rdbFemale.setSelected(true);
                }
                txtAge.setEnabled(false);
                txtAnnualIncome.setEnabled(false);
                txtEmailId.setEnabled(false);
                txtName.setEnabled(false);
                txtSsnNumber.setEnabled(false);
                rdbMale.setEnabled(false);
                rdbFemale.setEnabled(false);
            }       
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtSsnNumber = new javax.swing.JTextField();
        txtAnnualIncome = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        btnRegister = new javax.swing.JButton();
        BtnAdopt = new javax.swing.JButton();
        btnCheckStatus = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Adopter Registration and Adoption Request Page");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Age:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Gender:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("SSN Number:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Annual Income:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Email Id:");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtSsnNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSsnNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSsnNumberActionPerformed(evt);
            }
        });

        txtAnnualIncome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEmailId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIdActionPerformed(evt);
            }
        });

        gender.add(rdbMale);
        rdbMale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbMale.setText("Male");
        rdbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMaleActionPerformed(evt);
            }
        });

        gender.add(rdbFemale);
        rdbFemale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbFemale.setText("Female");

        btnRegister.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        BtnAdopt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnAdopt.setText("Adopt");
        BtnAdopt.setEnabled(false);
        BtnAdopt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdoptActionPerformed(evt);
            }
        });

        btnCheckStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCheckStatus.setText("Check Status");
        btnCheckStatus.setEnabled(false);
        btnCheckStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegister)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnAdopt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCheckStatus))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtSsnNumber)
                                        .addComponent(txtAnnualIncome)
                                        .addComponent(txtAge)
                                        .addComponent(txtEmailId)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdbMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdbFemale)))))
                        .addGap(99, 99, 99)))
                .addGap(0, 81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdbMale)
                    .addComponent(rdbFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSsnNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAnnualIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(BtnAdopt)
                    .addComponent(btnCheckStatus))
                .addContainerGap(144, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIdActionPerformed

    private void txtSsnNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSsnNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSsnNumberActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void rdbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbMaleActionPerformed

    private void btnCheckStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckStatusActionPerformed
        CheckStatusJPanel csjp = new CheckStatusJPanel(userProcessContainer, account, adopterorganization, enterprise, business, udirectory, uid, directory);
        this.userProcessContainer.add("CheckStatusJPanel", csjp);
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnCheckStatusActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        //Take input from Application.        
          if(!validator()){
        int age = Integer.parseInt(txtAge.getText());
        float annualIncome = Float.parseFloat(txtAnnualIncome.getText());
        String name = txtName.getText();
        String gender = "";
        if(rdbMale.isSelected()){
            gender = "Male";
        }
        else if(rdbFemale.isSelected()){
            gender = "Female";
        }
        String ssnNumber = txtSsnNumber.getText() ;
        String emailId = txtEmailId.getText();
        
        
        Adopter adopter = new Adopter();//create instance of Adopter
        uid = udirectory.getAdoptersList().size()+1;// user id
        
            adopter = udirectory.addAdopter();
        //feed this input to the directory
        adopter.setAge(age);
        adopter.setAnnualIncome(annualIncome);
        adopter.setEmailId(emailId);
        adopter.setGender(gender);
        adopter.setName(name);
        adopter.setSsn(ssnNumber);
        adopter.setUserId(uid);
        adopter.setUsername(account.getUsername());
        
        JOptionPane.showMessageDialog(null, "Registration successful!");
        btnRegister.setEnabled(false);
        txtAge.setEnabled(false);
        txtAnnualIncome.setEnabled(false);
        txtEmailId.setEnabled(false);
        txtName.setEnabled(false);
        txtSsnNumber.setEnabled(false);
        rdbMale.setEnabled(false);
        rdbFemale.setEnabled(false);
        BtnAdopt.setEnabled(true);
        
        //remove below code it is just for testing
        for(Adopter a: udirectory.getAdoptersList()){
            System.out.println("list size as per adopterUI"+ udirectory.getAdoptersList().size());
            System.out.println("adopter name"+a.getName()+"adopter ssn"+a.getSsn()+"userId "+a.getUserId());
        }
         //till here   
          }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void BtnAdoptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdoptActionPerformed
        //Creating a work request for the adopter object created
        for(Adopter a: udirectory.getAdoptersList()){
            if(a.getUsername().equals(account.getUsername())){
                System.out.println("mera account name hai: adopterregistration adopt button"+a.getUsername());
                adopter=a;
            }
        }    
        
        AdoptionWorkRequest awr = new AdoptionWorkRequest();
           // awr.setStatus("");
            awr.setMessage("I want to adopt");
            awr.setSender(account);
            awr.setUserId(adopter.getUserId());
        /*
        The below set of code iterates through the network list and get the network
        Once the network is received then it iterates over all the enterprises present in the network
        It goes thought every organization in the enterprise.
        
        Once it has found the Doctor organization, it sets the organization as Doctor organization
        
        */
        Organization org = null;
        for (Network network : business.getNetworkList()){
           // getNetworkList().getOrganizationDirectory().getOrganizationList()
            System.out.println("ye hai network: "+network);
            for(Enterprise ent: network.getEnterpriseDirectory().getEnterpriseList()){
                System.out.println("ye hai enterprise: "+ent);
                for(Organization organization: ent.getOrganizationDirectory().getOrganizationList()){
                    System.out.println("ye hai org: "+organization);
                       
                    if (organization instanceof AdoptionOrganization){

                        org = organization;
                        System.out.println("ye hai org: "+org);
                        break;
                    } 
                }
            }
        }
        
        /*The below if code checks if there is some value for org. If there is then add the work request 
        - At the organization level, where other organization in the same enterprise can access it
        -At the account level, so the adopter can also see see the request created
        - At the business level, as the request has to be transferred to a different organization in a different enterprise.
        */
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(awr);
            account.getWorkQueue().getWorkRequestList().add(awr);
            business.getWorkQueue().getWorkRequestList().add(awr);
        }
        
        JOptionPane.showMessageDialog(null,"Adoption request raised successfully!");
        BtnAdopt.setEnabled(false);
        adopter.setFlag(true);
        btnCheckStatus.setEnabled(true);
    }//GEN-LAST:event_BtnAdoptActionPerformed
public boolean validateName(){
    boolean b=false;
    Pattern p = Pattern.compile("^[a-zA-Z. ]*$");
    String name = txtName.getText();
    Matcher m = p.matcher(name);
    b = m.matches();
    return b;
}  

public boolean validateSSN(){
    boolean b=false;
    Pattern p = Pattern.compile("^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$");
    String name = txtSsnNumber.getText();
    Matcher m = p.matcher(name);
    b = m.matches();
    return b;
} 
public boolean validateEmail(){
    boolean b=false;
    Pattern p = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
    String name = txtEmailId.getText();
    Matcher m = p.matcher(name);
    b = m.matches();
    return b;
} 

public boolean validator() {
try{
     int age  =  Integer.parseInt(txtAge.getText());
   
    
     if(age<18){
       JOptionPane.showMessageDialog(null, "Age need to be more than 18years for adoption");
        return true;    
     }
     else if(age<0){
         JOptionPane.showMessageDialog(null, "Age cannot be negative");
        return true; 
     }
   
}
  catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(null, "Please enter number in age");
        return true; 
          }
    try{
        float salary = Float.parseFloat(txtAnnualIncome.getText());
          if(salary<0){
        JOptionPane.showMessageDialog(null, "Salary cannot be negative");
        return true;  
     }
    }
     catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(null, "Please enter number in salary");
        return true; 
          }
     if(!validateName()){
        JOptionPane.showMessageDialog(null, "Please enter name in correct format(No special characters)");
        return true;
    }
    else if(txtName.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please enter name in the name text field");
        return true;
    }
    else if(txtAge.getText().isEmpty()){
   JOptionPane.showMessageDialog(null, "Please enter age");
        return true;
}
    else if(!rdbFemale.isSelected()&&!rdbMale.isSelected()){
          JOptionPane.showMessageDialog(null, "Please select gender");
        return true;
    }
    else if(!validateSSN()){
        JOptionPane.showMessageDialog(null, "Please enter the SSN in correct format ###-##-####");
        return true;
    }
    else if(!validateEmail()){
          JOptionPane.showMessageDialog(null, "Please enter the email in correct format aaa.aaa@aaa.aaa");
        return true;
    }
    else if(txtAnnualIncome.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please enter annual income");
        return true;
    }
    else if(txtSsnNumber.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please enter SSN number");
        return true;
    }
    else if(txtEmailId.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please enter email id");
        return true;
    }
    
    else
    return false;
} 



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdopt;
    private javax.swing.JButton btnCheckStatus;
    private javax.swing.JButton btnRegister;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAnnualIncome;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSsnNumber;
    // End of variables declaration//GEN-END:variables
}
