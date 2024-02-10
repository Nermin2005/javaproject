package com.nermin.javaproject.dataAccess;

import com.nermin.javaproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
//JpaRespositoryde hemcinin interfacedir.Interface interfacei extends edir.
