package com.otec.player;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/players")
@AllArgsConstructor
public class PlayerController {

    private final PlayerService playerService;

    @PostMapping
    public void registerPlayer(@RequestBody PlayerRegistrationRequest playerRegistrationRequest){
        log.info("New player registration {}",playerRegistrationRequest);
        playerService.registerPlayer(playerRegistrationRequest);
    }

}
