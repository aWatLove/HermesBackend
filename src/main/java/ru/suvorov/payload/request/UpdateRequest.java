package ru.suvorov.payload.request;

import lombok.Data;

@Data
public class UpdateRequest {
    String id;
    String newText;
}
