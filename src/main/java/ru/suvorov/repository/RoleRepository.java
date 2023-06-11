package ru.suvorov.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.suvorov.models.ERole;
import ru.suvorov.models.Role;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
