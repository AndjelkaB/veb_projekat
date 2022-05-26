package veb.proj.veb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import veb.proj.veb.Entity.TipKupca;

public interface TipKupcaRepository extends JpaRepository<TipKupca, Long> {
    public TipKupca getById (Long id);
}
