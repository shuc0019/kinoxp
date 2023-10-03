package com.example.kinoxpproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long showId;

    @ManyToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "movieId")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "hall_id", referencedColumnName = "hallId")
    private Hall hall;

    private LocalDate showDate; // LocalDate for date

    private LocalDateTime showTime; // LocalDateTime for date and time

}
