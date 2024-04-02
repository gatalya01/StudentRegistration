package com.example.StudentRegistration.dto;

import lombok.Data;
import java.util.UUID;

@Data
public class Student {
    private UUID id;
    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = UUID.randomUUID(); // Генерация уникального ID с помощью UUID
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}