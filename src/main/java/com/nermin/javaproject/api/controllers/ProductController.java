package com.nermin.javaproject.api.controllers;

import com.nermin.javaproject.business.abstracts.ProductService;
import com.nermin.javaproject.core.utilities.results.DataResult;
import com.nermin.javaproject.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor

public class ProductController {
    private ProductService productService;
@GetMapping("/getAll")
    public DataResult<List<Product>> getAll() {
    return this.productService.getAll();
}

}
