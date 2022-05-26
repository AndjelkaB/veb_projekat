package veb.proj.veb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import veb.proj.veb.Entity.Komentar;

public interface KomentarRepository extends JpaRepository<Komentar, Long> {
    public Komentar getById(Long id);
}
