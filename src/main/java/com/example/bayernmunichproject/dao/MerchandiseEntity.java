package com.example.bayernmunichproject.dao;

import com.example.bayernmunichproject.enums.AchievementType;
import com.example.bayernmunichproject.enums.MerchandiseType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "merchandises")
public class MerchandiseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // (Jersey, Scarf, Mug)
    private String description;
    private Double price;
    @Column(name = "stock_quantity")
    private Integer stockQuantity;

    //all following -> table
    @Enumerated(EnumType.STRING)
    private MerchandiseType merchandiseType;

    private String imageUrl;

    private Boolean isOnSale;

    private Integer discountPercentage;

}

