package veb.proj.veb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import veb.proj.veb.Entity.Korisnik;

public interface KorisnikRepository extends JpaRepository<Korisnik,Long> {
    public Korisnik getById(Long Id);
}
