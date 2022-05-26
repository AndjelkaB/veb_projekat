package veb.proj.veb.Entity;

import javax.persistence.*;

@Entity
public class Lokacija {

    @Column
    private String geografskaDuzina;

    @Column
    private String geografskaSirina;

    @Column
    private String adresa;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Restoran restoran;

    public Lokacija(String geografskaDuzina, String geografskaSirina, String adresa, Long id, Restoran restoran) {
        this.geografskaDuzina = geografskaDuzina;
        this.geografskaSirina = geografskaSirina;
        this.adresa = adresa;
        this.id = id;
        this.restoran = restoran;
    }

    public String getGeografskaDuzina() {
        return geografskaDuzina;
    }

    public void setGeografskaDuzina(String geografskaDuzina) {
        this.geografskaDuzina = geografskaDuzina;
    }

    public String getGeografskaSirina() {
        return geografskaSirina;
    }

    public void setGeografskaSirina(String geografskaSirina) {
        this.geografskaSirina = geografskaSirina;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Restoran getRestoran() {
        return restoran;
    }

    public void setRestoran(Restoran restoran) {
        this.restoran = restoran;
    }
}
