package com.example.jsondemo.Repostories;

import com.example.jsondemo.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepostory extends JpaRepository<Product, Integer> {

    List<Product> findByName(String name);

}
