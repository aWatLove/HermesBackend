package ru.suvorov.services;

import ru.suvorov.models.Path;

import java.util.List;

public interface PathService {
    List<Path> getAllPath();

    List<Path> getPathByCityOut(String cityOut);


    Path addPath(Path path);

    void deletePath(Path path);

    Path updatePath(Path path);
}
