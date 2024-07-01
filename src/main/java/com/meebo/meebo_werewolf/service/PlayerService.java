package com.meebo.meebo_werewolf.service;

import java.util.UUID;

import com.meebo.meebo_werewolf.controller.dto.player.InPlayerDTO;
import com.meebo.meebo_werewolf.domain.entity.Player;

public interface PlayerService extends ConstService<Player, UUID, InPlayerDTO> {
    
}