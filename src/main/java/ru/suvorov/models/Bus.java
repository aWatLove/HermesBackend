package ru.suvorov.models;

import lombok.Data;

@Data
public class Bus {
    private String busType;
    private String busName;
    private int amountSeats;
    private String busNumber;
    private String driver;
}
