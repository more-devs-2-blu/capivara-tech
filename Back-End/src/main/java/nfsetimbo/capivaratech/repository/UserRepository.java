package nfsetimbo.capivaratech.repository;

import nfsetimbo.capivaratech.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserById(Long id);

}
