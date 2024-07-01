package com.meebo.meebo_werewolf.domain.entity;

import java.util.UUID;

import com.meebo.meebo_werewolf.domain.enums.MovesEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Move {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private MovesEnum move;

    @Column
    private Boolean day;

    @ManyToOne
    private Player target;

    @ManyToOne
    private Round round;

    @ManyToOne
    private Player player;
}