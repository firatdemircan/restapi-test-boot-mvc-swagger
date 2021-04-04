package com.example.jsondemo.Service;

import com.example.jsondemo.Entities.Product;
import com.example.jsondemo.Repostories.ProductRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepostory productRepostory;

    public Product saveProduct(Product product){
            return productRepostory.save(product);
    }

    public List<Product> getProducts(){
        return productRepostory.findAll();
    }

    public Product getById(int id){
        return productRepostory.getOne(id);
    }

    public List<Product> getByName(String name){
        return productRepostory.findByName(name);
    }

    public String deleteProduct(int id){

        productRepostory.deleteById(id);

        return "Başarılı : "+id;
    }

}
