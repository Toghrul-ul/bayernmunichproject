package com.example.bayernmunichproject.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "performance_stats")
public class PerformanceStatsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "goals_scored")
    private Integer goalsScored; // Total goals scored
    @Column(name = "goals_conceded")
    private Integer goalsConceded; // Total goals conceded
    @Column(name = "possession_percentage")
    private Double possessionPercentage; // Possession percentage
    @Column(name = "passing_accuracy")
    private Double passingAccuracy; // Passing accuracy percentage

    @ManyToOne
    @JoinColumn(name = "club_id")
    private ClubEntity club; // The club associated with the performance stats

    @ManyToOne
    @JoinColumn(name = "competition_id")
    private CompetitionEntity competition; // The competition (e.g., Bundesliga)

}

