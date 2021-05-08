package ru.job4j.cars.model;

import lombok.Builder;
import lombok.Value;

import javax.persistence.*;

@Value
@Builder(toBuilder = true)
@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
}
