/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.TehnikaTip;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.TehnikaTipFacadeLocal;

/**
 *
 * @author Student
 */
@Named(value = "tehnika")
@SessionScoped
public class tehnika_tipController implements Serializable {

    /**
     * Creates a new instance of tehnika_tip
     */
    public tehnika_tipController() {
    }
    @EJB
    private TehnikaTipFacadeLocal TehnikaTipFacade;
    private TehnikaTip tehnika_tip = new TehnikaTip();
    private String name, type;
    private int id;
    private Date Date;

    public TehnikaTipFacadeLocal getTehnikaTipFacade() {
        return TehnikaTipFacade;
    }

    public void setTehnikaTipsFacade(TehnikaTipFacadeLocal TehnikaTipFacade) {
        this.TehnikaTipFacade = TehnikaTipFacade;
    }

    public TehnikaTip getTehnikaTip() {
        return tehnika_tip;
    }

    public void setTehnikaTip(TehnikaTip tehnika_tip) {
        this.tehnika_tip = tehnika_tip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private TehnikaTip selectedTehnikaTip;

    public TehnikaTip getSelectedTehnikaTip() {
        return selectedTehnikaTip;
    }

    public void setSelectedTehnikaTip(TehnikaTip selectedTehnikaTip) {
        this.selectedTehnikaTip = selectedTehnikaTip;
    }

    public void emptyVariables() {
        this.Date = null;
        this.name = "";
        this.type = "";
    }

    public String createTehnikaTip() {
        this.tehnika_tip.setDate(this.Date);
        this.tehnika_tip.setName(this.name);
        this.tehnika_tip.setType(this.type);
        this.TehnikaTipFacade.create(this.tehnika_tip);
        this.emptyVariables();
        return "TehnikaTip.xhtml?faces-redirect=true";
    }

    public List<TehnikaTip> getAllTehnikaTips() {
        return this.TehnikaTipFacade.findAll();
    }

    public String updateTehnikaTip(TehnikaTip tehnika_tip) {
        this.TehnikaTipFacade.edit(tehnika_tip);
        return "TehnikaTip.xhtml?faces-redirect=true";
    }

    public String deleteTehnikaTip(TehnikaTip tehnika_tip) {
        this.TehnikaTipFacade.remove(tehnika_tip);
        return "TehnikaTip.xhtml?faces-redirect=true";
    }

}
