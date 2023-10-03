package com.example.kinoxpproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hallId;

    private String hallName;
    private int capacity;
    private String layout;

    @OneToMany(mappedBy = "hall")
    private List<Show> shows;

    @OneToMany(mappedBy = "hall")
    private List<Seat> seats;
}
