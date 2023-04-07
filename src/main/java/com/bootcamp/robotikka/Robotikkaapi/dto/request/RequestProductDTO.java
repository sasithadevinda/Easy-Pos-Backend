package com.bootcamp.robotikka.Robotikkaapi.dto.request;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestProductDTO {
    private String displayName;
    private String description;
    private double unitPrice;
    private int qty;
    private double sellingPrice;


}



