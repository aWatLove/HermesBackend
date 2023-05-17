package ru.suvorov.models;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "path")
public class Path {
    @Id
    private String id;
    private String cityOut;
    private String cityIn;
    private String[] points;
    private String time;
    private int price;
}
