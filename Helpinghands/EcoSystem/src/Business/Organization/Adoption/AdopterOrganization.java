/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Adoption;

import Business.Organization.Organization;
import Business.Role.Adoption.AdopterRole;
import Business.Role.Adoption.AdoptionRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sanja
 * 
 */
public class AdopterOrganization extends Organization{
    public AdopterOrganization() {
         super(Organization.Type.Adopter.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdopterRole());
        return roles;
    }
}
