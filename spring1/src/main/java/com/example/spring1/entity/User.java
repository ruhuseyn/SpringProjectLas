package com.example.spring1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    Integer id;
    @Column(name = "full_name")
    String fullName;
    LocalDate age;
}
