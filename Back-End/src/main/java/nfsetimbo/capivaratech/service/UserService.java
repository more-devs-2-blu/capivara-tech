package nfsetimbo.capivaratech.service;

import nfsetimbo.capivaratech.exception.UserNotFoundException;
import nfsetimbo.capivaratech.model.User;
import nfsetimbo.capivaratech.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){this.userRepository = userRepository; }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User findUserById(Long id) {
        return userRepository.findPetById(id).orElseThrow(()-> new UserNotFoundException("User by id: "+id+" was not found"));
    }

    public User addUser(User user) {
        user.setUserCode((UUID.randomUUID().toString()));
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }



}
