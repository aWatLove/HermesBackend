package ru.suvorov.services;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.suvorov.models.Path;
import ru.suvorov.repository.PathRepository;

import java.util.List;

@Service
@Data
public class PathServiceImpl implements PathService{
    private final PathRepository repository;

    public List<Path> getAllPath(){
        return repository.findAll();
    }

    public List<Path> getPathByCityOut(String cityOut) {
        return repository.findPathByCityOutOrder(cityOut);
    }

    public void deletePath(Path path){
        repository.delete(path);
    }


    public Path addPath(Path path){
        return repository.save(path);
    }

    public Path updatePath(Path path) {
        return repository.save(path);
    }
}
