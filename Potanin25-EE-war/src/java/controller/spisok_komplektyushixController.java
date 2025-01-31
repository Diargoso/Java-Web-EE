/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.SpisokKomplektyushix;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.SpisokKomplektyushixFacadeLocal;

/**
 *
 * @author Student
 */
@Named(value = "spisok_komplektyushix")
@SessionScoped
public class spisok_komplektyushixController implements Serializable {

    /**
     * Creates a new instance of spisok_komplektyushix
     */
    public spisok_komplektyushixController() {
    }
    @EJB
    private SpisokKomplektyushixFacadeLocal spisokKomplektyushixFacade;
    private SpisokKomplektyushix spisok_komplektyushix = new SpisokKomplektyushix();
    private String komplektyushix;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SpisokKomplektyushixFacadeLocal getSpisokKomplektyushixFacade() {
        return spisokKomplektyushixFacade;
    }

    public void setspisokKomplektyushixFacadeFacade(SpisokKomplektyushixFacadeLocal spisokKomplektyushixFacade) {
        this.spisokKomplektyushixFacade = spisokKomplektyushixFacade;
    }

    public String getKomplektyushix() {
        return komplektyushix;
    }

    public void setKomplektyushix(String komplektyushix) {
        this.komplektyushix = komplektyushix;
    }

    private SpisokKomplektyushix selectedSpisokKomplektyushix;

    public SpisokKomplektyushix getSelectedSpisokKomplektyushix() {
        return selectedSpisokKomplektyushix;
    }

    public void setSelectedSpisokKomplektyushix(SpisokKomplektyushix selectedSpisokKomplektyushix) {
        this.selectedSpisokKomplektyushix = selectedSpisokKomplektyushix;
    }

    public void emptyVariables() {
        this.komplektyushix = "";
    }

    public String createSpisokKomplektyushix() {
        this.spisok_komplektyushix.setKomplektuyshie(this.komplektyushix);
        this.spisokKomplektyushixFacade.create(this.spisok_komplektyushix);
        this.emptyVariables();
        return "spisok_komplektyushix.xhtml?faces-redirect=true";
    }

    public List<SpisokKomplektyushix> getAllspisok_komplektyushixKomplektyushixFacade() {
        return this.spisokKomplektyushixFacade.findAll();
    }

    public String updateSpisokKomplektyushix(SpisokKomplektyushix spisok_komplektyushix) {
        this.spisokKomplektyushixFacade.edit(spisok_komplektyushix);
        return "spisok_komplektyushix.xhtml?faces-redirect=true";
    }

    public String deleteSpisokKomplektyushix(SpisokKomplektyushix spisok_komplektyushix) {
        this.spisokKomplektyushixFacade.remove(spisok_komplektyushix);
        return "spisok_komplektyushix.xhtml?faces-redirect=true";
    }

}
