package com.meebo.meebo_werewolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MeeboWerewolfApplication {
	public static void main(String[] args) {
		SpringApplication.run(MeeboWerewolfApplication.class, args);
	}
}