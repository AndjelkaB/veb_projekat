package veb.proj.veb.Entity;
import java.util.Set;
import java.util.HashSet;
import javax.persistence.*;

@Entity
public class Dostavljac extends Korisnik {

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "dostavljac", orphanRemoval = true)
    private Set<Porudzbina> porudzbinas = new HashSet<>();

    public Dostavljac()
    {}

    public Dostavljac(Long id, String korisnickoIme, String lozinka, String ime, String prezime, String uloga, String datumRodjenja, String pol, Set<Porudzbina> porudzbinas) {
        super(id, korisnickoIme, lozinka, ime, prezime, uloga, datumRodjenja, pol);
        this.porudzbinas = porudzbinas;
    }

    public Set<Porudzbina> getPorudzbinas() {
        return porudzbinas;
    }

    public void setPorudzbinas(Set<Porudzbina> porudzbinas) {
        this.porudzbinas = porudzbinas;
    }
}
