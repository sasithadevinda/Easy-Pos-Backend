package com.bootcamp.robotikka.Robotikkaapi.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "payment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    @Column(name = "property_id")
    private String propertyId;
    @Column(name = "payment_date")
    private Date paymentDate;
    @Column(name = "amount")
    private double amount;
    @Column(name = "bank")
    private String bank;


    @OneToOne
    @JoinColumn(name = "order_property_id", unique = true)
    private Orders  ordersPropertyId;

    /*    order_property_id*/
    /*property_id; payment_date; amount; bank; order_property_id*/
}
