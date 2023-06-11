package ru.suvorov.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.suvorov.models.Path;
import ru.suvorov.services.path.PathServiceImpl;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/test")
public class TestController {
    private final PathServiceImpl pathServiceImpl;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/path/getAll")
    public List<Path> getAllPath() {
        return pathServiceImpl.getAllPath();
    }

    @GetMapping("/path/add")
    public Path insertPath(@RequestBody Path path) {
        return pathServiceImpl.addPath(path);
    }

    @DeleteMapping("/path/delete/{id}")
    public ResponseEntity<?> deletePath(@PathVariable String id) {
        return ResponseEntity.ok("deleted");
    }
}
