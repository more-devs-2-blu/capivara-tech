package nfsetimbo.capivaratech.service;

import nfsetimbo.capivaratech.exception.UserNotFoundException;
import nfsetimbo.capivaratech.model.User;
import nfsetimbo.capivaratech.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


import static jakarta.persistence.GenerationType.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){this.userRepository = userRepository; }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User findUserById(Long id) {
        return userRepository.findUserById(id).orElseThrow(()-> new UserNotFoundException("User by id: "+id+" was not found"));
    }

    public User addUser(User user) {
        user.setUserCode(java.util.UUID.randomUUID());
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }



}
