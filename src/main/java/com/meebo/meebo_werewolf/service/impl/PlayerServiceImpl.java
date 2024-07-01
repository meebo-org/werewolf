package com.meebo.meebo_werewolf.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.meebo.meebo_werewolf.config.component.UsersMS;
import com.meebo.meebo_werewolf.controller.dto.player.InPlayerDTO;
import com.meebo.meebo_werewolf.controller.dto.user.OutUserDTO;
import com.meebo.meebo_werewolf.domain.entity.Player;
import com.meebo.meebo_werewolf.domain.repository.PlayerRepository;
import com.meebo.meebo_werewolf.service.PlayerService;
import com.meebo.meebo_werewolf.service.exception.NoContentException;
import com.meebo.meebo_werewolf.service.exception.NotFoundException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository repository;
    private final UsersMS usersMS;

    @Override
    public Player create(InPlayerDTO dto) {
        OutUserDTO userFound = usersMS.getUserById(dto.userId());

        Player newPlayer = new Player();

        BeanUtils.copyProperties(dto, newPlayer);

        newPlayer.setUserId(userFound.getId());

        return repository.save(newPlayer);
    }

    @Override
    public List<Player> findAll() {
        List<Player> playersFound = repository.findAll();

        if (playersFound.isEmpty()) {
            throw new NoContentException();
        }

        return playersFound;
    }

    @Override
    public Player findById(UUID id) {
        Player playerFound = repository.findById(id).orElseThrow(NotFoundException::new);

        return playerFound;
    }
}