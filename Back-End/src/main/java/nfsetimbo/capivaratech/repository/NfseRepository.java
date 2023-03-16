package nfsetimbo.capivaratech.repository;

import nfsetimbo.capivaratech.model.Nfse;
import nfsetimbo.capivaratech.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NfseRepository extends JpaRepository<Nfse, Long> {

    Optional<Nfse> findNfseById(Long id);
}
