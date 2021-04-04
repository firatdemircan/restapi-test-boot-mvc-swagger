package com.example.jsondemo.Controller;

import com.example.jsondemo.Entities.Product;
import com.example.jsondemo.Service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="/api/product")
@Api(value="ProductController",produces= MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    @ApiOperation("Post Product")
    public Product addProduct(@RequestBody Product product){
        return productService.saveProduct(product);

    }

    @GetMapping("/getAll")
    @ApiOperation("Get All Products")
    public List<Product> findAllProducts(){
        return productService.getProducts();
    }

    @GetMapping("/getById/{id}")
    @ApiOperation("Get The Product")
    public Product getProduct(@PathVariable int id){
        return productService.getById(id);
    }

    @GetMapping("/getByName/{name}")
    @ApiOperation("Get Products By Name")
    public List<Product> getProduct(@PathVariable String name){
        return productService.getByName(name);
    }

}
