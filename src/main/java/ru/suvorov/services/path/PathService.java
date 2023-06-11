package ru.suvorov.services.path;

import ru.suvorov.models.Path;

import java.util.List;
import java.util.Optional;

public interface PathService {
    List<Path> getAllPath();

//    Optional<Path> getPathByCities(String cityOut, String cityIn);

    Path addPath(Path path);

    void deletePath(Path path);

    Path updatePath(Path path);
}
