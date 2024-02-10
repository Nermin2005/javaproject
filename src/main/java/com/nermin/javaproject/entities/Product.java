package com.nermin.javaproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    int id;
    @Column(name = "product_name")
    String name;
    @Column(name="category_id")
    int categoryId;
    @Column(name = "quantity_per_unit")
    String quantityPerUnit;
@Column(name = "unit_price")
    int unitPrice;



}
