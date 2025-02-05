package com.example.bayernmunichproject.repository;

import com.example.bayernmunichproject.dao.MerchandiseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MerchandiseRepository extends JpaRepository<MerchandiseEntity, Long> {

    List<MerchandiseEntity> findByCategory(String category);

}

//Use case: Filter merch based on jerseys, scarves, accessories, etc..


