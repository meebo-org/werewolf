package com.meebo.meebo_werewolf.domain.entity;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String name;

    @Column
    private Boolean active;

    @Column
    private String code;

    @ManyToOne
    private Player leader;

    @OneToOne(mappedBy = "room")
    private Settings settings;

    @OneToMany(mappedBy = "room")
    private List<Game> games;
}
