package veb.proj.veb.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Korisnik implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(unique = true)
    private String korisnickoIme;

    @Column
    private String lozinka;

    public void setId(Long id) {
        this.id = id;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setUloga(String uloga) {
        this.uloga = uloga;
    }

    public void setDatumRodjenja(String datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    @Column
    private String ime;

    @Column
    private String prezime;

    @Column
    private String uloga; // Kupac, Menadzer, Dostavljac, Administrator

    public Long getId() {
        return id;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getUloga() {
        return uloga;
    }

    public String getDatumRodjenja() {
        return datumRodjenja;
    }

    public String getPol() {
        return pol;
    }

    @Column
    private String datumRodjenja;

    @Column
    private String pol;

    public Korisnik(Long id, String korisnickoIme, String lozinka, String ime, String prezime, String uloga, String datumRodjenja, String pol) {
        this.id = id;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
        this.ime = ime;
        this.prezime = prezime;
        this.uloga = uloga;
        this.datumRodjenja = datumRodjenja;
        this.pol = pol;
    }

    public Korisnik()
    {}



}
