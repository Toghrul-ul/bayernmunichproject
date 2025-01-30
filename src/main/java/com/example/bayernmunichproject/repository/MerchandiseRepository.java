package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.MerchandiseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MerchandiseRepository extends JpaRepository<MerchandiseEntity, Long> {

    List<MerchandiseEntity> findByCategory(String category);

}

//Use case: Filter merch based on jerseys, scarves, accessories, etc..


