package com.example.bayernmunichproject.dao;

import com.example.bayernmunichproject.enums.AchievementType;
import com.example.bayernmunichproject.enums.PositionStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "league_standings")
public class LeagueStandingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer position;
    @Column(name = "matches_played")
    private Integer matchesPlayed;
    private Integer wins;
    private Integer losses;
    private Integer draws;
    private Integer points;

    @ManyToOne
    @JoinColumn(name = "club_id")
    private ClubEntity club;

    @ManyToOne
    @JoinColumn(name = "competition_id")
    private CompetitionEntity competition; // Bundesliga

    @Enumerated(EnumType.STRING)
    private PositionStatus positionStatus;

}

