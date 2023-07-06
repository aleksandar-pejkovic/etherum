package dev.etherum.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.etherum.model.User;
import dev.etherum.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        User storedUser = userRepository.findById(user.getId())
                .orElseThrow();
        BeanUtils.copyProperties(user, storedUser);
        User updatedUser = userRepository.save(storedUser);
        return storedUser;
    }

    public void deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
        }
    }

    public User loadUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow();
    }

    public List<User> loadAllUser() {
        return userRepository.findAll();
    }
}
