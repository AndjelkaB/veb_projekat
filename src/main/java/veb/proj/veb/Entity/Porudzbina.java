package veb.proj.veb.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Porudzbina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "porudzbina", orphanRemoval = true)
    private Set<Artikl> artikli = new HashSet<>();

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Restoran restoran;

    @Column
    private String datum;

    @Column
    private String statusPorudzbine;

    @Column
    private double cena;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Kupac kupac;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Dostavljac dostavljac;

    public Porudzbina(Long id, Set<Artikl> artikli, Restoran restoran, String datum, String statusPorudzbine, double cena, Kupac kupac, Dostavljac dostavljac) {
        this.id = id;
        this.artikli = artikli;
        this.restoran = restoran;
        this.datum = datum;
        this.statusPorudzbine = statusPorudzbine;
        this.cena = cena;
        this.kupac = kupac;
        this.dostavljac = dostavljac;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Artikl> getArtikli() {
        return artikli;
    }

    public void setArtikli(Set<Artikl> artikli) {
        this.artikli = artikli;
    }

    public Restoran getRestoran() {
        return restoran;
    }

    public void setRestoran(Restoran restoran) {
        this.restoran = restoran;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getStatusPorudzbine() {
        return statusPorudzbine;
    }

    public void setStatusPorudzbine(String statusPorudzbine) {
        this.statusPorudzbine = statusPorudzbine;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public Dostavljac getDostavljac() {
        return dostavljac;
    }

    public void setDostavljac(Dostavljac dostavljac) {
        this.dostavljac = dostavljac;
    }
}
