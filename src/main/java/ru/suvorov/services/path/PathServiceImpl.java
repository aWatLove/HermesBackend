package ru.suvorov.services.path;

import lombok.Data;
import org.springframework.stereotype.Service;
import ru.suvorov.models.Path;
import ru.suvorov.repository.PathRepository;

import java.util.List;

@Service
@Data
public class PathServiceImpl implements PathService {
    private final PathRepository repository;

    public List<Path> getAllPath(){
        return repository.findAll();
    }

//    public Optional<Path> getPathByCities(String cityOut, String cityIn) {
//        return repository.findPathByCityInAndAndCityOut(cityOut, cityIn);
//    }

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
