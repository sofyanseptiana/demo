package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "playercurrency")
public class PlayerCurrency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nama;
    private Long copper;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public Long getCopper() { return copper; }
    public void setCopper(Long copper) { this.copper = copper; }
}
