package com.bootcamp.robotikka.Robotikkaapi.service;

import com.bootcamp.robotikka.Robotikkaapi.dto.request.RequestProductDTO;
import com.bootcamp.robotikka.Robotikkaapi.dto.response.CommonResponseDTO;

public interface ProductService {
    public CommonResponseDTO createProduct(RequestProductDTO dto);
}
