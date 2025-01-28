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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author STUDENT 1
 */
@Entity
@Table(name = "aouth")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aouth.findAll", query = "SELECT a FROM Aouth a")
    , @NamedQuery(name = "Aouth.findById", query = "SELECT a FROM Aouth a WHERE a.id = :id")
    , @NamedQuery(name = "Aouth.findBySalutation", query = "SELECT a FROM Aouth a WHERE a.salutation = :salutation")
    , @NamedQuery(name = "Aouth.findByFirstName", query = "SELECT a FROM Aouth a WHERE a.firstName = :firstName")
    , @NamedQuery(name = "Aouth.findByLastName", query = "SELECT a FROM Aouth a WHERE a.lastName = :lastName")
    , @NamedQuery(name = "Aouth.findByAge", query = "SELECT a FROM Aouth a WHERE a.age = :age")
    , @NamedQuery(name = "Aouth.findByEmail", query = "SELECT a FROM Aouth a WHERE a.email = :email")})
public class Aouth implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "salutation")
    private int salutation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "firstName")
    private int firstName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lastName")
    private int lastName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "age")
    private int age;
    @Basic(optional = false)
    @NotNull
    @Column(name = "email")
    private int email;

    public Aouth() {
    }

    public Aouth(Integer id) {
        this.id = id;
    }

    public Aouth(Integer id, int salutation, int firstName, int lastName, int age, int email) {
        this.id = id;
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getSalutation() {
        return salutation;
    }

    public void setSalutation(int salutation) {
        this.salutation = salutation;
    }

    public int getFirstName() {
        return firstName;
    }

    public void setFirstName(int firstName) {
        this.firstName = firstName;
    }

    public int getLastName() {
        return lastName;
    }

    public void setLastName(int lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
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
        if (!(object instanceof Aouth)) {
            return false;
        }
        Aouth other = (Aouth) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Aouth[ id=" + id + " ]";
    }
    
}
