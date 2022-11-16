package org.example.ws;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "compte")
public class Compte {

    private int code;
    private double solde;

    @XmlTransient
    private Date created;

    public Compte() {
    }

    public Compte(int code, double solde, Date created) {
        this.code = code;
        this.solde = solde;
        this.created = created;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public Date getCreated() {
        return created;
    }
}
