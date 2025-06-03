package com.example.BillingSoftware.repository;

import com.example.BillingSoftware.entity.CategoryEntity;
import org.aspectj.apache.bcel.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

     Optional<CategoryEntity> findByCategoryId(String categoryId);
}


