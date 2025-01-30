/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author STUDENT 1
 */
@Entity
@Table(name = "sborochnie_komplectuyshie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SborochnieKomplectuyshie.findAll", query = "SELECT s FROM SborochnieKomplectuyshie s")
    , @NamedQuery(name = "SborochnieKomplectuyshie.findById", query = "SELECT s FROM SborochnieKomplectuyshie s WHERE s.id = :id")})
public class SborochnieKomplectuyshie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Nomber_Techniki")
    private String nomberTechniki;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Motherboard")
    private String motherboard;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "GPU")
    private String gpu;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "HDDSSDCD")
    private String hddssdcd;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Procesor")
    private String procesor;
    @Lob
    @Size(max = 65535)
    @Column(name = "Korpus")
    private String korpus;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "OZY")
    private String ozy;
    @Lob
    @Size(max = 65535)
    @Column(name = "Battery")
    private String battery;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Cooling")
    private String cooling;

    public SborochnieKomplectuyshie() {
    }

    public SborochnieKomplectuyshie(Integer id) {
        this.id = id;
    }

    public SborochnieKomplectuyshie(Integer id, String nomberTechniki, String motherboard, String gpu, String hddssdcd, String procesor, String ozy, String cooling) {
        this.id = id;
        this.nomberTechniki = nomberTechniki;
        this.motherboard = motherboard;
        this.gpu = gpu;
        this.hddssdcd = hddssdcd;
        this.procesor = procesor;
        this.ozy = ozy;
        this.cooling = cooling;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomberTechniki() {
        return nomberTechniki;
    }

    public void setNomberTechniki(String nomberTechniki) {
        this.nomberTechniki = nomberTechniki;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getHddssdcd() {
        return hddssdcd;
    }

    public void setHddssdcd(String hddssdcd) {
        this.hddssdcd = hddssdcd;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getKorpus() {
        return korpus;
    }

    public void setKorpus(String korpus) {
        this.korpus = korpus;
    }

    public String getOzy() {
        return ozy;
    }

    public void setOzy(String ozy) {
        this.ozy = ozy;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getCooling() {
        return cooling;
    }

    public void setCooling(String cooling) {
        this.cooling = cooling;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SborochnieKomplectuyshie)) {
            return false;
        }
        SborochnieKomplectuyshie other = (SborochnieKomplectuyshie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.SborochnieKomplectuyshie[ id=" + id + " ]";
    }
    
}
