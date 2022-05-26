package veb.proj.veb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import veb.proj.veb.Entity.Lokacija;

public interface LokacijaRepository extends JpaRepository<Lokacija, Long> {
    public Lokacija getById(Long id);
}
