package com.meebo.meebo_werewolf.domain.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meebo.meebo_werewolf.domain.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, UUID> {

}