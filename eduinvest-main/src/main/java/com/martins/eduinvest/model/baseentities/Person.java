package com.martins.eduinvest.model.baseentities;

import lombok.experimental.SuperBuilder;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@MappedSuperclass
@SuperBuilder
@ToString
@Getter
@Setter
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password; // Hash this in practice
    private LocalDateTime dob;
    private String address;

    // Additional common properties...
    private boolean google2FAEnabled;
}
