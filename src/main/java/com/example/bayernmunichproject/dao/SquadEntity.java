package com.example.bayernmunichproject.dao;

import com.example.bayernmunichproject.enums.AchievementType;
import com.example.bayernmunichproject.enums.Formation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "squads")
public class SquadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "position_category")
    private String positionCategory; // e.g., "Goalkeepers", "Defenders", etc.

    @OneToMany(mappedBy = "squad", cascade = CascadeType.ALL)
    private List<PlayerEntity> players; // Players belonging to this squad category

    @ManyToOne
    @JoinColumn(name = "club_id")
    private ClubEntity club; // Association with Club entity

    @Enumerated(EnumType.STRING)
    private Formation formation;

}

