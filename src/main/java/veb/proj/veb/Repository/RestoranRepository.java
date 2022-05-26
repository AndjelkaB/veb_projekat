package veb.proj.veb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import veb.proj.veb.Entity.Restoran;

public interface RestoranRepository extends JpaRepository<Restoran,Long> {
    public Restoran getById (Long id);
}
