package com.meebo.meebo_werewolf.config.component;

import java.util.UUID;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import com.meebo.meebo_werewolf.controller.dto.user.OutUserDTO;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UsersMS {
    private final DiscoveryClient discoveryClient;

    public OutUserDTO getUserById(UUID id) {
        ServiceInstance service = discoveryClient.getInstances("USERS").get(0);
        RestClient restClient = RestClient.create();

        return restClient.get()
                .uri(service.getUri() + "/users/" + id)
                .retrieve()
                .toEntity(OutUserDTO.class)
                .getBody();
    }
}
