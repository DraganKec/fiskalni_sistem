package org.fs.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "kasa")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Kasa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "brojkase")
    private String brojKase;

    @ManyToOne
    @JoinColumn(name = "komitentid")
    private Komitent komitent;

    @Column(name = "brojmodula")
    private String brojModula;

    @Column(name = "brojterminala")
    private String brojTerminala;

    @Column(name = "simkartica")
    private String simKartica;

    private int pin;

    private String telefon;

    @Column(name = "adresainstaliranja")
    private String adresaInstaliranja;

    @ManyToOne
    @JoinColumn(name = "modelid")
    private Model model;

    private boolean defiskalicacija;

    @Column(name = "datumdefiskalizacije")
    private String datumDefiskalizacije;

    @Column(name = "dokumentacijaposlata")
    private boolean dokumentacijaPoslata;

    @Column(name = "datumslanjadokumentacije")
    private String datumSlanjaDokumentacije;

    @Column(name = "datumfiskalizacije")
    private String datumFiskalizacije;

    @Column(name = "fiskalnaplomba")
    private String fiskalnaPlomba;

    @Column(name = "programskaplomba")
    private String programskaPlomba;

    @Column(name = "brojugovora")
    private String brojUgovora;

    @Column(name = "flink")
    private String fLink;

    private String ibsa;

    private String napomena;

    @OneToMany(mappedBy = "kasa", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Servis> servis;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrojKase() {
        return brojKase;
    }

    public void setBrojKase(String brojKase) {
        this.brojKase = brojKase;
    }

    public Komitent getKomitent() {
        return komitent;
    }

    public void setKomitent(Komitent komitent) {
        this.komitent = komitent;
    }

    public String getBrojModula() {
        return brojModula;
    }

    public void setBrojModula(String brojModula) {
        this.brojModula = brojModula;
    }

    public String getBrojTerminala() {
        return brojTerminala;
    }

    public void setBrojTerminala(String brojTerminala) {
        this.brojTerminala = brojTerminala;
    }

    public String getSimKartica() {
        return simKartica;
    }

    public void setSimKartica(String simKartica) {
        this.simKartica = simKartica;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdresaInstaliranja() {
        return adresaInstaliranja;
    }

    public void setAdresaInstaliranja(String adresaInstaliranja) {
        this.adresaInstaliranja = adresaInstaliranja;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public boolean isDefiskalicacija() {
        return defiskalicacija;
    }

    public void setDefiskalicacija(boolean defiskalicacija) {
        this.defiskalicacija = defiskalicacija;
    }

    public String getDatumDefiskalizacije() {
        return datumDefiskalizacije;
    }

    public void setDatumDefiskalizacije(String datumDefiskalizacije) {
        this.datumDefiskalizacije = datumDefiskalizacije;
    }

    public boolean isDokumentacijaPoslata() {
        return dokumentacijaPoslata;
    }

    public void setDokumentacijaPoslata(boolean dokumentacijaPoslata) {
        this.dokumentacijaPoslata = dokumentacijaPoslata;
    }

    public String getDatumSlanjaDokumentacije() {
        return datumSlanjaDokumentacije;
    }

    public void setDatumSlanjaDokumentacije(String datumSlanjaDokumentacije) {
        this.datumSlanjaDokumentacije = datumSlanjaDokumentacije;
    }

    public String getDatumFiskalizacije() {
        return datumFiskalizacije;
    }

    public void setDatumFiskalizacije(String datumFiskalizacije) {
        this.datumFiskalizacije = datumFiskalizacije;
    }

    public String getFiskalnaPlomba() {
        return fiskalnaPlomba;
    }

    public void setFiskalnaPlomba(String fiskalnaPlomba) {
        this.fiskalnaPlomba = fiskalnaPlomba;
    }

    public String getProgramskaPlomba() {
        return programskaPlomba;
    }

    public void setProgramskaPlomba(String programskaPlomba) {
        this.programskaPlomba = programskaPlomba;
    }

    public String getBrojUgovora() {
        return brojUgovora;
    }

    public void setBrojUgovora(String brojUgovora) {
        this.brojUgovora = brojUgovora;
    }

    public String getfLink() {
        return fLink;
    }

    public void setfLink(String fLink) {
        this.fLink = fLink;
    }

    public String getIbsa() {
        return ibsa;
    }

    public void setIbsa(String ibsa) {
        this.ibsa = ibsa;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public Set<Servis> getServis() {
        return servis;
    }

    public void setServis(Set<Servis> servis) {
        this.servis = servis;
    }
}
