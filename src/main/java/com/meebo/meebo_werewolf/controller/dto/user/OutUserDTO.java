package com.meebo.meebo_werewolf.controller.dto.user;

import java.util.UUID;

import lombok.Data;

@Data
public class OutUserDTO {
    UUID id;

    String username;

    String email;
}