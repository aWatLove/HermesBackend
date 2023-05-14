package ru.suvorov.models;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "city")
public class City {
    @Id
    private ObjectId id;
    private String name;
}
