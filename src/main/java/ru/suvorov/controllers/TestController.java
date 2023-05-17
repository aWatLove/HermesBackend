package ru.suvorov.controllers;

import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.suvorov.models.Path;
import ru.suvorov.repository.PathRepository;
import ru.suvorov.services.PathService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/test")
public class TestController {
    private final PathService pathService;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/path/getAll")
    public List<Path> getAllPath() {
        return pathService.getAllPath();
    }

    @GetMapping("/path/add")
    public Path insertPath(@RequestBody Path path) {
        return pathService.addPath(path);
    }

    @DeleteMapping("/path/delete/{id}")
    public ResponseEntity<?> deletePath(@PathVariable String id) {
        pathService.deletePath(id);
        return ResponseEntity.ok("deleted");
    }
}
