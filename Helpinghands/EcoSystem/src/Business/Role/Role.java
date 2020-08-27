/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Adopter.AdopterDirectory;
import Business.Child.ChildDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        ChildCare("Child Care"),
        OrphanageAdmin("Orphanage Admin Organization"),
        ChildRegistration("Child Registeration Organization"), 
        FinanceOrphanage ("Finance Organization"),
        AdoptionAdmin("Adoption Admin Organization"), 
        Adoption("Adoption Organization"), 
        Adopter("Adopter Organization"),
        CriminalCheck("Criminal Check Organization"),
        FinanceCheck("Finance Check Organization"),
        Pharmacist("Pharmacy Organization");
        
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business, ChildDirectory directory, AdopterDirectory udirectory);
    
//    public abstract JPanel createWorkArea(
//            JPanel userProcessContainer, 
//            UserAccount userAccount, 
//            Organization organization,
//            Enterprise enterprise, 
//            EcoSystem business, 
//            ChildDirectory directory,
//            AdopterDirectory udirectory);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}