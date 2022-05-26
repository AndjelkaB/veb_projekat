package veb.proj.veb.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Menadzer extends Korisnik {
    @OneToMany(mappedBy = "menadzer", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Restoran> restorans = new HashSet<>();

    public Menadzer()
    {}

    public Menadzer(Long id, String korisnickoIme, String lozinka, String ime, String prezime, String uloga, String datumRodjenja, String pol, Set<Restoran> restorans) {
        super(id, korisnickoIme, lozinka, ime, prezime, uloga, datumRodjenja, pol);
        this.restorans = restorans;
    }

    public Menadzer(Set<Restoran> restorans) {
        this.restorans = restorans;
    }

    public Set<Restoran> getRestorans() {
        return restorans;
    }

    public void setRestorans(Set<Restoran> restorans) {
        this.restorans = restorans;
    }
}
