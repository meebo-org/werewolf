package com.meebo.meebo_werewolf.domain.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Settings {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private Boolean bodyGuard;

    @Column
    private Boolean sheriff;

    @Column
    private Boolean lover;

    @Column
    private Boolean medium;

    @Column
    private Boolean coroner;

    @Column
    private Boolean mayor;

    @Column
    private Boolean seer;

    @Column
    private Boolean jester;

    @Column
    private Boolean jailer;

    @Column
    private Boolean silencer;

    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Room room;
}