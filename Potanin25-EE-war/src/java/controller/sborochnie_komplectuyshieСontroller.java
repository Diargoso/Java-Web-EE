/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.SborochnieKomplectuyshie;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sessionbean.SborochnieKomplectuyshieFacadeLocal;

/**
 *
 * @author Student
 */
@Named(value = "sborochnie_komplectuyshieController")
@SessionScoped
public class sborochnie_komplectuyshieСontroller implements Serializable {

    /**
     * Creates a new instance of sborochnie_komplectuyshie
     */
    public sborochnie_komplectuyshieСontroller() {
    }
    @EJB
    private SborochnieKomplectuyshieFacadeLocal sborochnieKomplectuyshiesFacede;
    private SborochnieKomplectuyshie sborochnieKomplectuyshie = new SborochnieKomplectuyshie();
    
    private String Nomber_Techniki, Motherboard, GPU, HDDSSDCD, Procesor, Korpus, OZY, Battery, Cooling;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SborochnieKomplectuyshieFacadeLocal getSborochnieKomplectuyshieFacede() {
        return sborochnieKomplectuyshiesFacede;
    }

    public void setSborochnieKomplectuyshiesFacade(SborochnieKomplectuyshieFacadeLocal sborochnieKomplectuyshiesFacede) {
        this.sborochnieKomplectuyshiesFacede = sborochnieKomplectuyshiesFacede;
    }

    public String getNomber_Techniki() {
        return Nomber_Techniki;
    }

    public void setNomber_Techniki(String Nomber_Techniki) {
        this.Nomber_Techniki = Nomber_Techniki;
    }

    public String getMotherboard() {
        return Motherboard;
    }

    public void setMotherboard(String Motherboard) {
        this.Motherboard = Motherboard;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getHDDSSDCD() {
        return HDDSSDCD;
    }

    public void setHDDSSDCD(String HDDSSDCD) {
        this.HDDSSDCD = HDDSSDCD;
    }

    public String getProcesor() {
        return Procesor;
    }

    public void setProcesor(String Procesor) {
        this.Procesor = Procesor;
    }

    public String getKorpus() {
        return Korpus;
    }

    public void setKorpus(String Korpus) {
        this.Korpus = Korpus;
    }

    public String getOZY() {
        return OZY;
    }

    public void setOZY(String OZY) {
        this.OZY = OZY;
    }

    public String getBattery() {
        return Battery;
    }

    public void setBattery(String Battery) {
        this.Battery = Battery;
    }

    public String getCooling() {
        return Cooling;
    }

    public void setCooling(String Cooling) {
        this.Cooling = Cooling;
    }

    private SborochnieKomplectuyshie selectedSborochnieKomplectuyshie;

    public SborochnieKomplectuyshie getSelectedSborochnieKomplectuyshie() {
        return selectedSborochnieKomplectuyshie;
    }

    public void setSelectedSborochnieKomplectuyshie(SborochnieKomplectuyshie selectedSborochnieKomplectuyshie) {
        this.selectedSborochnieKomplectuyshie = selectedSborochnieKomplectuyshie;
    }

    public void emptyVariables() {
        this.Battery = "";
        this.Cooling = "";
        this.GPU = "";
        this.HDDSSDCD = "";
        this.Korpus = "";
        this.Motherboard = "";
        this.Nomber_Techniki = "";
        this.OZY = "";
        this.Procesor = "";
    }

    public String createSborochnieKomplectuyshie() {
        this.sborochnieKomplectuyshie.setBattery(this.Battery);
        this.sborochnieKomplectuyshie.setCooling(this.Cooling);
        this.sborochnieKomplectuyshie.setGpu(this.GPU);
        this.sborochnieKomplectuyshie.setHddssdcd(this.HDDSSDCD);
        this.sborochnieKomplectuyshie.setKorpus(this.Korpus);
        this.sborochnieKomplectuyshie.setMotherboard(this.Motherboard);
        this.sborochnieKomplectuyshie.setNomberTechniki(this.Nomber_Techniki);
        this.sborochnieKomplectuyshie.setOzy(this.OZY);
        this.sborochnieKomplectuyshie.setProcesor(this.Procesor);
        this.sborochnieKomplectuyshiesFacede.create(this.sborochnieKomplectuyshie);
        this.emptyVariables();
        return "SborochnieKomplectuyshie.xhtml?faces-redirect=true";
    }

    public List<SborochnieKomplectuyshie> getAllSborochnieKomplectuyshies() {
        return this.sborochnieKomplectuyshiesFacede.findAll();
    }

    public String updateSborochnieKomplectuyshie(SborochnieKomplectuyshie sborochnieKomplectuyshie) {
        this.sborochnieKomplectuyshiesFacede.edit(sborochnieKomplectuyshie);
        return "SborochnieKomplectuyshie.xhtml?faces-redirect=true";
    }

    public String deleteSborochnieKomplectuyshie(SborochnieKomplectuyshie sborochnieKomplectuyshie) {
        this.sborochnieKomplectuyshiesFacede.remove(sborochnieKomplectuyshie);
        return "SborochnieKomplectuyshie.xhtml?faces-redirect=true";
    }

}
