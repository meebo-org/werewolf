package com.meebo.meebo_werewolf.controller.dto.player;

import java.time.LocalDateTime;
import java.util.UUID;

import com.meebo.meebo_werewolf.domain.entity.Player;

public record OutPlayerDTO(UUID id, String color, UUID userId, LocalDateTime inDateTime) {
    public OutPlayerDTO(Player p) {
        this(p.getId(), p.getColor(), p.getUserId(), p.getInDateTime());
    }
}
