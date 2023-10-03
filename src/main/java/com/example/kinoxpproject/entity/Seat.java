package com.example.kinoxpproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seatId;

    private String seatNum;
    private String row;

    @ManyToOne
    @JoinColumn(name = "hall_id")
    private Hall hall;

    private boolean isBooked;
}
