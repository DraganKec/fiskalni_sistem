package org.fs.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by Dragan on 16/12/16.
 */
@Entity
@Table(name = "komitent")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Komitent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "nazivkomitenta")
    private String nazivKomitenta;

    private String telefon;

    private String adresa;

    private String jib;

    private String pib;

    private String napomena;

    public Komitent() {
    }

    public Komitent(int id, String nazivKomitenta) {
        this.id = id;
        this.nazivKomitenta = nazivKomitenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazivKomitenta() {
        return nazivKomitenta;
    }

    public void setNazivKomitenta(String nazivKomitenta) {
        this.nazivKomitenta = nazivKomitenta;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getJib() {
        return jib;
    }

    public void setJib(String jib) {
        this.jib = jib;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }
}
