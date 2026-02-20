package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/players")
public class PlayerCurrencyController {

    private final PlayerCurrencyRepository repo;

    public PlayerCurrencyController(PlayerCurrencyRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<PlayerCurrency> getAll() {
        return repo.findAll();
    }
}
