package com.example.bayernmunichproject.dao;

import com.example.bayernmunichproject.enums.AchievementType;
import com.example.bayernmunichproject.enums.MatchResult;
import com.example.bayernmunichproject.enums.MatchType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "matches")
public class MatchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String opponent;
    @Column(name = "match_date_time")
    private LocalDateTime matchDateTime;
    private String location; // stadium or neutral ground

    @ManyToOne
    @JoinColumn(name = "home_club_id")
    private ClubEntity homeClub; // The club hosting the match

    @ManyToOne
    @JoinColumn(name = "away_club_id")
    private ClubEntity awayClub; // The visiting team

    @ManyToOne
    @JoinColumn(name = "competition_id")
    private CompetitionEntity competition; // The competition the match belongs to

    //all following -> table
    @Enumerated(EnumType.STRING)
    private MatchResult matchResult;

    @Enumerated(EnumType.STRING)
    private MatchType matchType;

    private String score;

    private Integer attendance;

    private String refereeName;

}

