package com.example.bayernmunichproject.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clubs")
public class ClubEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "founded_date")
    private Date foundedDate;

    @OneToMany(mappedBy = "club", cascade = CascadeType.ALL)
    private List<AchievementEntity> achievements;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "stadium_id")
    private StadiumEntity stadium;

    @OneToMany(mappedBy = "club", cascade = CascadeType.ALL)
    private List<ManagementMemberEntity> managementTeam;

}

