package veb.proj.veb.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class TipKupca implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int brojBodova;

    @Column
    private int popust;

    @OneToMany(mappedBy = "tipKupca", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Kupac> kupci = new HashSet<>();

    public TipKupca(Long id, int brojBodova, int popust, Set<Kupac> kupci) {
        this.id = id;
        this.brojBodova = brojBodova;
        this.popust = popust;
        this.kupci = kupci;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBrojBodova() {
        return brojBodova;
    }

    public void setBrojBodova(int brojBodova) {
        this.brojBodova = brojBodova;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public Set<Kupac> getKupci() {
        return kupci;
    }

    public void setKupci(Set<Kupac> kupci) {
        this.kupci = kupci;
    }
}
