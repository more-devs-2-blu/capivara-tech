package nfsetimbo.capivaratech.repository;

import nfsetimbo.capivaratech.model.Nfse;
import nfsetimbo.capivaratech.model.User;

import java.util.Optional;

public interface NfseRepository extends JpaRepository<Nfse, Long>{

    Optional<Nfse> findNfseById(Long id);
}
