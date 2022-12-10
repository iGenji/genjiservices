package com.otec.player;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public void registerPlayer(PlayerRegistrationRequest playerRegistrationRequest) {
        Player player = Player.builder()
                .username(playerRegistrationRequest.username())
                .password(playerRegistrationRequest.password())
                .email(playerRegistrationRequest.email())
                .build();
        //TODO: check if email is valid
        //TODO: check if email is not taken;
        //TODO: check if username is not taken
        //store player in DB
        playerRepository.save(player);
    }
}
