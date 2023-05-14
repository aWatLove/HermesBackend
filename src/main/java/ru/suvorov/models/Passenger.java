package ru.suvorov.models;

import lombok.Data;

@Data
public class Passenger {
    private String ticketType;
    private String firstname;
    private String lastname;
    private String patronymic;
    private String phone;
    private String documentType;
    private String documentNumber;
    private String dateBirth;
    private int seatNumber;
}
