package com.meebo.meebo_werewolf.controller.dto.player;

import java.time.LocalDateTime;
import java.util.UUID;

public record InPlayerDTO(String color, UUID userId, LocalDateTime inDateTime) {
    
}