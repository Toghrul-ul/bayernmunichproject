package com.example.bayernmunichproject.dao;

import com.example.bayernmunichproject.enums.AchievementType;
import com.example.bayernmunichproject.enums.StatCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "top_player_stats")
public class TopPlayerStatsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer goals;
    private Integer assists;
    private Integer saves; //if player is a goalkeeper

    @ManyToOne
    @JoinColumn(name = "player_id")
    private PlayerEntity player;

    @ManyToOne
    @JoinColumn(name = "club_id")
    private ClubEntity club;

    @ManyToOne
    @JoinColumn(name = "competition_id")
    private CompetitionEntity competition;

    @Enumerated(EnumType.STRING)
    private StatCategory statCategory;

}

