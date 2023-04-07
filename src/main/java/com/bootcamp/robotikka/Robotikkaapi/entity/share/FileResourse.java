package com.bootcamp.robotikka.Robotikkaapi.entity.share;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable

public class FileResourse {
    private String directory;
    private String hash;
    private String resourceUrl;
    private String fileName;
}
