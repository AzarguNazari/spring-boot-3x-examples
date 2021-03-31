package com.khoubyari.example.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.Objects;

@Entity
@Table(name = "hotel")
public record Hotel (@Id @GeneratedValue(strategy = GenerationType.AUTO) long id,
                     @Column String name,
                     @Column String description,
                     @Column String city,
                     @Column int rating){
    public Hotel {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        Objects.requireNonNull(city);
    }
}
