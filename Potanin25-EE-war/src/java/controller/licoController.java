/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Lico;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.LicoFacadeLocal;

/**
 *
 * @author Student
 */
@Named(value = "licoController")
@SessionScoped
public class licoController implements Serializable {

    /**
     * Creates a new instance of lico
     */
    public licoController() {
    }

    @EJB
    private LicoFacadeLocal licosFacade;
    private Lico lico = new Lico();
    private String F, I, O;


    public LicoFacadeLocal getLicoFacade() {
        return licosFacade;
    }

    public void setLicosFacade(LicoFacadeLocal licosFacade) {
        this.licosFacade = licosFacade;
    }

    public Lico getLico() {
        return lico;
    }

    public void setLico(Lico lico) {
        this.lico = lico;
    }

    public String getF() {
        return F;
    }

    public void setF(String F) {
        this.F = F;
    }

    public String getI() {
        return I;
    }

    public void setI(String I) {
        this.I = I;
    }

    public String getO() {
        return O;
    }

    public void setO(String O) {
        this.O = O;
    }

    private Lico selectedLico;

    public Lico getSelectedLico() {
        return selectedLico;
    }

    public void setSelectedLico(Lico selectedLico) {
        this.selectedLico = selectedLico;
    }

    public void emptyVariables() {
        this.F = "";
        this.I = "";
        this.O = "";
    }

    public String createLico() {
        this.lico.setF(this.F);
        this.lico.setI(this.I);
        this.lico.setO(this.O);
        this.licosFacade.create(this.lico);
        this.emptyVariables();
        return "Lico.xhtml?faces-redirect=true";
    }

    public List<Lico> getAllLicos() {
        return this.licosFacade.findAll();
    }

    public String updateLico(Lico lico) {
        this.licosFacade.edit(lico);
        return "Lico.xhtml?faces-redirect=true";
    }

    public String deleteLico(Lico lico) {
        this.licosFacade.remove(lico);
        return "Lico.xhtml?faces-redirect=true";
    }
}
