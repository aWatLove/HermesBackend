package ru.suvorov.services;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import ru.suvorov.models.Path;
import ru.suvorov.repository.PathRepository;

import java.util.List;

@Service
@Data
public class PathService {
    private final PathRepository repository;

    public List<Path> getAllPath(){
        return repository.findAll();
    }

    public Path addPath(Path path){
        return repository.save(path);
    }

    public void deletePath(String id) {
        repository.deleteById(id);
    }
}
