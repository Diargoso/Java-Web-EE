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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Student
 */
@Entity
@Table(name = "ychet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ychet.findAll", query = "SELECT y FROM Ychet y")
    , @NamedQuery(name = "Ychet.findById", query = "SELECT y FROM Ychet y WHERE y.id = :id")})
public class Ychet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Lob
    @Size(max = 65535)
    @Column(name = "Nomber_Techniki")
    private String nomberTechniki;
    @Lob
    @Size(max = 65535)
    @Column(name = "CabNum")
    private String cabNum;
    @Lob
    @Size(max = 65535)
    @Column(name = "depreciation")
    private String depreciation;

    public Ychet() {
    }

    public Ychet(Integer id) {
        this.id = id;
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

    public String getCabNum() {
        return cabNum;
    }

    public void setCabNum(String cabNum) {
        this.cabNum = cabNum;
    }

    public String getDepreciation() {
        return depreciation;
    }

    public void setDepreciation(String depreciation) {
        this.depreciation = depreciation;
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
        if (!(object instanceof Ychet)) {
            return false;
        }
        Ychet other = (Ychet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Ychet[ id=" + id + " ]";
    }
    
}
