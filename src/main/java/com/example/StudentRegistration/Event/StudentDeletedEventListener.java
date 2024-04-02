package com.example.StudentRegistration.Event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StudentDeletedEventListener {

    @EventListener
    public void handleStudentDeletedEvent(StudentDeletedEvent event) {
        Long studentId = event.getStudentId();
        System.out.println("Студент удален, id: " + studentId);
    }
}