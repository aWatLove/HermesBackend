package ru.suvorov.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;
import ru.suvorov.models.Path;

import java.util.List;
import java.util.Optional;

@Repository
public interface PathRepository extends MongoRepository<Path, String> {

}
