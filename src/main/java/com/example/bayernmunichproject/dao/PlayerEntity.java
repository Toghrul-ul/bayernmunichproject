package com.example.bayernmunichproject.dao;

import com.example.bayernmunichproject.enums.PlayerPosition;
import com.example.bayernmunichproject.enums.PlayerStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "players")
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer age;
    private String nationality;


//TODO PlayerPosition class is exists
//    private String position; // Goalkeeper, Defender, ...

    //all following -> table
    @Enumerated(EnumType.STRING)
    private PlayerPosition playerPosition;

//    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL)
//    private List<PlayerStatisticEntity> statistics;
//
//    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL)
//    private List<CareerHighlightEntity> careerHighlights;
//
//    @ManyToOne
//    @JoinColumn(name = "squad_id")
//    private SquadEntity squad; // Reference to the Squad this player belongs to


    @Enumerated(EnumType.STRING)
    private PlayerStatus playerStatus;

    private Integer shirtNumber;

    private LocalDate contractEndDate;

}
