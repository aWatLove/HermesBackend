package ru.suvorov.models;


import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "user")
public class User {
    @Id
    private ObjectId id;
    private String login;
    private String email;
    private String password;
    private String role;
    private List<Ticket> tickets;
}
