package ru.job4j.cars.model;

import lombok.Builder;
import lombok.Value;

import javax.persistence.*;

@Value
@Entity
@Table(name = "users")
@Builder(toBuilder = true)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String email;
    String password;
}
