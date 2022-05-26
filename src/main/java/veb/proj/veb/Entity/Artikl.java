package veb.proj.veb.Entity;

import javax.persistence.*;

@Entity
public class Artikl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String naziv;

    @Column
    private String tipArtikla; //jelo, pice

    @Column
    private int cijena;

    @Column
    private int kolicina;

    @Column
    private String opis;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Restoran restoran;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Porudzbina porudzbina;


    public Artikl(Long id, String naziv, String tipArtikla, int cijena, int kolicina, String opis, Restoran restoran) {
        this.id = id;
        this.naziv = naziv;
        this.tipArtikla = tipArtikla;
        this.cijena = cijena;
        this.kolicina = kolicina;
        this.opis = opis;
        this.restoran = restoran;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getTipArtikla() {
        return tipArtikla;
    }

    public void setTipArtikla(String tipArtikla) {
        this.tipArtikla = tipArtikla;
    }

    public int getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Restoran getRestoran() {
        return restoran;
    }

    public void setRestoran(Restoran restoran) {
        this.restoran = restoran;
    }

    public Artikl() {}
}
