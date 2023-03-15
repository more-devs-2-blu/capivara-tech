package nfsetimbo.capivaratech.service;

import nfsetimbo.capivaratech.exception.UserNotFoundException;
import nfsetimbo.capivaratech.model.Nfse;
import nfsetimbo.capivaratech.model.User;
import nfsetimbo.capivaratech.repository.NfseRepository;
import nfsetimbo.capivaratech.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static jakarta.persistence.GenerationType.UUID;


@Service
public class NfseService {

    private final NfseRepository nfseRepository;

    public NfseService(NfseRepository nfseRepository){this.nfseRepository = nfseRepository; }

    public List<Nfse> findAllNfses() {
        return nfseRepository.findAll();
    }

    public Nfse findNfseById(Long id) {
        return nfseRepository.findNfseById(id).orElseThrow(()-> new UserNotFoundException("Nfse by id: "+id+" was not found"));
    }

    public Nfse addNfse(Nfse nfse) {
        return nfseRepository.save(nfse);
    }

    public Nfse updateNfse(Nfse nfse) {
        return nfseRepository.save(nfse);
    }

    public void deleteNfse(Long id) {
        nfseRepository.deleteById(id);
    }
}
