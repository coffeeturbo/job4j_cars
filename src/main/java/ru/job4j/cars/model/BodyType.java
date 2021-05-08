package ru.job4j.cars.model;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.persistence.*;

@Value
@Entity
@NoArgsConstructor
@Builder(toBuilder = true)
public class BodyType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id = null;
    String name = null;
}
