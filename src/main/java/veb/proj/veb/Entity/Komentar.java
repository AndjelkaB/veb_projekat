package veb.proj.veb.Entity;

import javax.persistence.*;

@Entity
public class Komentar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Kupac kupac;

    @OneToOne
    private Restoran restoran;

    @Column
    private int ocena; //1-5

    public Komentar()
    {}

    public Komentar(Kupac kupac, Restoran restoran, int ocena) {
        this.kupac = kupac;
        this.restoran = restoran;
        this.ocena = ocena;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public Restoran getRestoran() {
        return restoran;
    }

    public void setRestoran(Restoran restoran) {
        this.restoran = restoran;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
}
