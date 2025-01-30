package com.example.bayernmunichproject.dao;

import com.example.bayernmunichproject.enums.AchievementType;
import com.example.bayernmunichproject.enums.HighlightType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "career_highlights")
public class CareerHighlightEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String year;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private PlayerEntity player;

    @Enumerated(EnumType.STRING)
    private HighlightType highlightType;

}

