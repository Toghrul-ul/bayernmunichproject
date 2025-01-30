package com.example.bayernmunichproject.dao;

import com.example.bayernmunichproject.enums.AchievementType;
import com.example.bayernmunichproject.enums.ManagementRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "management_members")
public class ManagementMemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String role; // "President", "Coach"
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "club_id")
    private ClubEntity club;

    @Enumerated(EnumType.STRING)
    private ManagementRole managementRole;

}

