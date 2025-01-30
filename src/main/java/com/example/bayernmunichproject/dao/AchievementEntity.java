package com.example.bayernmunichproject.dao;

import com.example.bayernmunichproject.enums.AchievementType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "achievements")
public class AchievementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String year;

    @ManyToOne
    @JoinColumn(name = "club_id")
    private ClubEntity club;

    //both following -> table
    @Enumerated(EnumType.STRING)
    private AchievementType achievementType;

    private String description;

}

