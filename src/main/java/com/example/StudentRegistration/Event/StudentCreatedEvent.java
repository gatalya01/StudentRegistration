package com.example.StudentRegistration.Event;

import com.example.StudentRegistration.dto.Student;
import org.springframework.context.ApplicationEvent;

public class StudentCreatedEvent extends ApplicationEvent {

    public StudentCreatedEvent(Student student) {
        super(student);
    }

    public Student getStudent() {
        return (Student) getSource();
    }
}