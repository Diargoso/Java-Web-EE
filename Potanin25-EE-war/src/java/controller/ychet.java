/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Ychet;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.YchetFacadeLocal;

/**
 *
 * @author Student
 */
@Named(value = "Ychet")
@SessionScoped
public class ychet implements Serializable {

    /**
     * Creates a new instance of ychet
     */
    public ychet() {
    }
    @EJB
    private YchetFacadeLocal YchetsFacade;
    private Ychet ychet = new Ychet();
    private String Nomber_Techniki, CabNum, depreciation;
    private int id;

    public YchetFacadeLocal getYchetFacade() {
        return YchetsFacade;
    }

    public void setYchetsFacade(YchetFacadeLocal YchetsFacade) {
        this.YchetsFacade = YchetsFacade;
    }

    public String getNomber_Techniki() {
        return Nomber_Techniki;
    }

    public void setNomber_Techniki(String Nomber_Techniki) {
        this.Nomber_Techniki = Nomber_Techniki;
    }

    public String getCabNum() {
        return CabNum;
    }

    public void setCabNum(String CabNum) {
        this.CabNum = CabNum;
    }

    public String getDepreciation() {
        return depreciation;
    }

    public void setDepreciation(String depreciation) {
        this.depreciation = depreciation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Ychet selectedYchet;

    public Ychet getSelectedYchet() {
        return selectedYchet;
    }

    public void setSelectedYchet(Ychet selectedYchet) {
        this.selectedYchet = selectedYchet;
    }

    public void emptyVariables() {
        this.CabNum = "";
        this.Nomber_Techniki = "";
        this.depreciation = "";
    }

    public String createYchet() {
        this.ychet.setCabNum(this.CabNum);
        this.ychet.setDepreciation(this.depreciation);
        this.ychet.setNomberTechniki(this.Nomber_Techniki);
        this.YchetsFacade.create(this.ychet);
        this.emptyVariables();
        return "Ychet.xhtml?faces-redirect=true";
    }

    public List<Ychet> getAllYchets() {
        return this.YchetsFacade.findAll();
    }

    public String updateYchet(Ychet ychet) {
        this.YchetsFacade.edit(ychet);
        return "Ychet.xhtml?faces-redirect=true";
    }

    public String deleteYchet(Ychet ychet) {
        this.YchetsFacade.remove(ychet);
        return "Ychet.xhtml?faces-redirect=true";
    }

}
