package com.example.StudentRegistration.Event;

import com.example.StudentRegistration.dto.Student;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StudentCreatedEventListener {

    @EventListener
    public void handleStudentCreatedEvent(StudentCreatedEvent event) {
        Student student = event.getStudent();
        System.out.println("Студент создан: " + student);
    }
}