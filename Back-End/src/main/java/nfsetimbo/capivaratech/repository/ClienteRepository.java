package nfsetimbo.capivaratech.repository;

import nfsetimbo.capivaratech.model.Cliente;
import nfsetimbo.capivaratech.model.Nfse;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    Optional<Cliente> findClienteById(Long id);
}{
}
