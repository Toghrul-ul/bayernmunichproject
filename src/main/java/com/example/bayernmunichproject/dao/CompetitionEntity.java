package com.example.bayernmunichproject.dao;

import com.example.bayernmunichproject.enums.AchievementType;
import com.example.bayernmunichproject.enums.CompetitionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "competitions")
public class CompetitionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // Bundesliga, UEFA Champions League
    private String season; // 2023/2024 .......

    @OneToMany(mappedBy = "competition", cascade = CascadeType.ALL)
    private List<MatchEntity> matches;

    @Enumerated(EnumType.STRING)
    private CompetitionType competitionType;
}
