package com.nermin.javaproject.business.abstracts;

import com.nermin.javaproject.core.utilities.results.DataResult;
import com.nermin.javaproject.entities.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
}
