package com.example.bayernmunichproject.dao;

import com.example.bayernmunichproject.enums.AchievementType;
import com.example.bayernmunichproject.enums.StadiumType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stadiums")
public class StadiumEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer capacity;
    private String location;

    @OneToOne(mappedBy = "stadium")
    private ClubEntity club; // Back-reference to the Club entity

    //all following -> table
    @Enumerated(EnumType.STRING)
    private StadiumType stadiumType;

    private Boolean isIndoor;

    private Integer recordAttendance;
}

