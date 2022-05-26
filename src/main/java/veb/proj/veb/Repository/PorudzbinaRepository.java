package veb.proj.veb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import veb.proj.veb.Entity.Porudzbina;

public interface PorudzbinaRepository extends JpaRepository<Porudzbina, Long> {
    public Porudzbina getById(Long id);
}
