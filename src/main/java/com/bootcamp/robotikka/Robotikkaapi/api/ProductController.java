package com.bootcamp.robotikka.Robotikkaapi.api;

import com.bootcamp.robotikka.Robotikkaapi.dto.request.RequestProductDTO;
import com.bootcamp.robotikka.Robotikkaapi.util.StandardResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @PostMapping("/member/create")
    public ResponseEntity<StandardResponse> createProduct(@RequestBody RequestProductDTO dto){
        return null;
    }
}
