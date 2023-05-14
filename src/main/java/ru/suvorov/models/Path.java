package ru.suvorov.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "path")
public class Path {
    @Id
    private String id;
    private City cityOut;
    private City cityIn;
    private String[] points;
    private String time;
    private int price;
}
