package com.meebo.meebo_werewolf.domain.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String color;

    @Column
    private UUID userId;

    @Column
    private LocalDateTime inDateTime;

    @Column
    private LocalDateTime outDateTime;

    @OneToMany(mappedBy = "leader")
    private List<Room> rooms;

    @OneToMany(mappedBy = "winner")
    private List<Game> games;
}