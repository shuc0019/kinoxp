package com.example.kinoxpproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int bookingId;

    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;

    @ManyToOne
    @JoinColumn(name = "seat_id")
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "cust_id")
    private Customer customer;

    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    private double totalAmount;

}
