package com.example.jsondemo.Service;

import com.example.jsondemo.Entities.Product;
import com.example.jsondemo.Repostories.ProductRepostory;

import java.util.List;

public interface IProductService {


     Product saveProduct(Product product);

     List<Product> getProducts();

     Product getById(int id);

     List<Product> getByName(String name);

     String deleteProduct(int id);

}
