package com.bootcamp.robotikka.Robotikkaapi.entity;

import com.bootcamp.robotikka.Robotikkaapi.entity.share.FileResourse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "product_image")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductImages {
    @Id
    @Column(name = "property_id")
    private String property_id;
    @Embedded
    private FileResourse fileResourse;
    @ManyToOne
    private Product product;
}
