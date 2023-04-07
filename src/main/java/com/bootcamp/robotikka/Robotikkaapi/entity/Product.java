package com.bootcamp.robotikka.Robotikkaapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @Column(name = "property_id")
    private String propertyId;
    @Column(name = "display_name")
    private String displayName;
    @Column(name = "description")
    private String description;
    @Column(name = "unit_price")
    private double unitPrice;
    @Column(name = "qty")
    private int qty;

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    private List<ProductImages> images;

    //    images;

    @Column(name = "selling_price")
    private double sellingPrice;

    @OneToMany(mappedBy = "productPropertyId")
    private List<Orders> ordersList;
    @OneToMany(mappedBy = "productPropertyId",cascade = CascadeType.ALL)
    private List<LovedProperty> lovedProperties;
}



