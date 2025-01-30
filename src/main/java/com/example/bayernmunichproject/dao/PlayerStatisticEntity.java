package com.example.bayernmunichproject.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "player_statistics")
public class PlayerStatisticEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "matches_played")
    private Integer matchesPlayed;
    @Column(name = "goals_scored")
    private Integer goalsScored;
    private Integer assists;
    @Column(name = "clean_sheets")
    private Integer cleanSheets;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private PlayerEntity player;

    private String season; // 2023/2024 ...

}

