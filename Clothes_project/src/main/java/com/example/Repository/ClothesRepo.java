package com.example.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Clothes;

@Repository
public interface ClothesRepo extends JpaRepository<Clothes,Integer> {

}
