package ru.suvorov.models;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "flight")
public class Flight {
    @Id
    private String id;
    private Path path;
    private String timeOut;
    private String timeIn;
    private Passenger[] passengers;
    private Bus bus;
    private String dateOut;
    private String dateIn;
}
