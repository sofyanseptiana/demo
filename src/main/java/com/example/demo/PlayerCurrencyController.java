package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*") // cors enabled
public class PlayerCurrencyController {

    private final PlayerCurrencyRepository repository;

    public PlayerCurrencyController(PlayerCurrencyRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/players")
    public List<PlayerCurrency> getPlayers() {
        return repository.findAll();
    }
}