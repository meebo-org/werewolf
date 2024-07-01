package com.meebo.meebo_werewolf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meebo.meebo_werewolf.controller.dto.player.InPlayerDTO;
import com.meebo.meebo_werewolf.controller.dto.player.OutPlayerDTO;
import com.meebo.meebo_werewolf.domain.entity.Player;
import com.meebo.meebo_werewolf.service.PlayerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("players")
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService service;

    @PostMapping
    public ResponseEntity<OutPlayerDTO> create(@RequestBody InPlayerDTO dto) {
        Player newPlayer = service.create(dto);

        return ResponseEntity.ok(new OutPlayerDTO(newPlayer));
    }
}