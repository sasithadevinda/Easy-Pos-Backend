package com.bootcamp.robotikka.Robotikkaapi.entity.share;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class UserNameResource {
    @Column(name = "frist_name")
    private String fristName;
    @Column(name = "last_name")
    private String lastName;
}
