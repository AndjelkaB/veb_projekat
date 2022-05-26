package veb.proj.veb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import veb.proj.veb.Entity.Artikl;

public interface ArtiklRepository extends JpaRepository<Artikl, Long> {
    public Artikl getById(Long id);

}
