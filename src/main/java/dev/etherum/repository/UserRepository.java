package dev.etherum.repository;

import java.util.Optional;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import dev.etherum.model.User;

@Repository
public interface UserRepository extends ListCrudRepository<User, Long> {

    Optional<User> findUserByName(String name);
}
