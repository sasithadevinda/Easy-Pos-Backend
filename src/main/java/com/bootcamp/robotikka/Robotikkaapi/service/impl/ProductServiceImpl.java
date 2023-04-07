package com.bootcamp.robotikka.Robotikkaapi.service.impl;

import com.bootcamp.robotikka.Robotikkaapi.dto.request.RequestProductDTO;
import com.bootcamp.robotikka.Robotikkaapi.dto.response.CommonResponseDTO;
import com.bootcamp.robotikka.Robotikkaapi.repo.ProductRepo;
import com.bootcamp.robotikka.Robotikkaapi.service.ProductService;
import org.apache.tomcat.jni.Time;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public CommonResponseDTO createProduct(RequestProductDTO dto) {

        String id =  Time.now()+""+(int) (Math.random() * 10);

        return null;
    }
}
