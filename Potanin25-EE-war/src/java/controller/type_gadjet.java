/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.TypeGadjet;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.TypeGadjetFacadeLocal;

/**
 *
 * @author Student
 */
@Named(value = "gadjet")
@SessionScoped
public class type_gadjet implements Serializable {

    /**
     * Creates a new instance of type_gadjet
     */
    public type_gadjet() {
    }
    @EJB
    private TypeGadjetFacadeLocal TypeGadjets;
    private TypeGadjet type_gadjet = new TypeGadjet();
    private String type;
    private int id;


    public TypeGadjetFacadeLocal getTypeGadjetFacade() {
        return TypeGadjets;
    }

    public void setTypeGadjetsFacade(TypeGadjetFacadeLocal TypeGadjets) {
        this.TypeGadjets = TypeGadjets;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    private TypeGadjet selectedTypeGadjet;

    public TypeGadjet getSelectedTypeGadjet() {
        return selectedTypeGadjet;
    }

    public void setSelectedTypeGadjet(TypeGadjet selectedTypeGadjet) {
        this.selectedTypeGadjet = selectedTypeGadjet;
    }

    public void emptyVariables() {
        this.type = "";

    }

    public String createTypeGadjet() {
        this.type_gadjet.setType(this.type);
        this.TypeGadjets.create(this.type_gadjet);
        this.emptyVariables();
        return "TypeGadjet.xhtml?faces-redirect=true";
    }

    public List<TypeGadjet> getAllTypeGadjets() {
        return this.TypeGadjets.findAll();
    }

    public String updateTypeGadjet(TypeGadjet type_gadjet) {
        this.TypeGadjets.edit(type_gadjet);
        return "TypeGadjet.xhtml?faces-redirect=true";
    }

    public String deleteTypeGadjet(TypeGadjet type_gadjet) {
        this.TypeGadjets.remove(type_gadjet);
        return "TypeGadjet.xhtml?faces-redirect=true";
    }
    
}
