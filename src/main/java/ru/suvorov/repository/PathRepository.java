package ru.suvorov.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.suvorov.models.Path;

import java.util.List;

public interface PathRepository extends MongoRepository<Path, String> {
}
