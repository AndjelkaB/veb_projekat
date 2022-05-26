package veb.proj.veb.Entity;

import jdk.jfr.Category;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Kupac extends Korisnik {

    @Column
    private int brojBodova;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "kupac", orphanRemoval = true)
    private Set<Porudzbina> porudzbinas = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "kupac", orphanRemoval = true)
    private Set<Komentar> komentars = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private TipKupca tipKupca;

    public Kupac()
    {}

    public Kupac(Long id, String korisnickoIme, String lozinka, String ime, String prezime, String uloga, String datumRodjenja, String pol, int brojBodova, Set<Porudzbina> porudzbinas, Set<Komentar> komentars, TipKupca tipKupca) {
        super(id, korisnickoIme, lozinka, ime, prezime, uloga, datumRodjenja, pol);
    }

    public Kupac(int brojBodova, Set<Porudzbina> porudzbinas, Set<Komentar> komentars, TipKupca tipKupca) {
        this.brojBodova = brojBodova;
        this.porudzbinas = porudzbinas;
        this.komentars = komentars;
        this.tipKupca = tipKupca;
    }

    public int getBrojBodova() {
        return brojBodova;
    }

    public void setBrojBodova(int brojBodova) {
        this.brojBodova = brojBodova;
    }

    public Set<Porudzbina> getPorudzbinas() {
        return porudzbinas;
    }

    public void setPorudzbinas(Set<Porudzbina> porudzbinas) {
        this.porudzbinas = porudzbinas;
    }

    public Set<Komentar> getKomentars() {
        return komentars;
    }

    public void setKomentars(Set<Komentar> komentars) {
        this.komentars = komentars;
    }

    public TipKupca getTipKupca() {
        return tipKupca;
    }

    public void setTipKupca(TipKupca tipKupca) {
        this.tipKupca = tipKupca;
    }
}
