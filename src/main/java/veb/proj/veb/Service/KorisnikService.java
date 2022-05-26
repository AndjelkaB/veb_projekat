package veb.proj.veb.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import veb.proj.veb.Entity.Korisnik;
import veb.proj.veb.Repository.KorisnikRepository;

@Service
public class KorisnikService {
    @Autowired
    public KorisnikRepository korisnikRepository;
    public Korisnik findOneById(Long id) { return korisnikRepository.getById(id); }


}
