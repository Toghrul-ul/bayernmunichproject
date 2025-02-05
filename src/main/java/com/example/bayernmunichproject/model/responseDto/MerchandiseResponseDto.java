package com.example.bayernmunichproject.model.responseDto;

import com.example.bayernmunichproject.enums.MerchandiseType;
import lombok.Data;

@Data
public class MerchandiseResponseDto {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer stockQuantity;
    private MerchandiseType merchandiseType;
    private String imageUrl;
    private Boolean isOnSale;
    private Integer discountPercentage;
}

