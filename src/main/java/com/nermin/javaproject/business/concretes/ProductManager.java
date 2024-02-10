package com.nermin.javaproject.business.concretes;

import com.nermin.javaproject.business.abstracts.ProductService;
import com.nermin.javaproject.core.utilities.results.DataResult;
import com.nermin.javaproject.core.utilities.results.SuccessDataResult;
import com.nermin.javaproject.dataAccess.ProductDao;
import com.nermin.javaproject.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class ProductManager implements ProductService {
    public ProductDao productDao;

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<>("ugurlu alindi" ,this.productDao.findAll());
    }
}
