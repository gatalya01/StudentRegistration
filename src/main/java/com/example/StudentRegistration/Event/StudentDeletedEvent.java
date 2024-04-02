package com.example.StudentRegistration.Event;

import org.springframework.context.ApplicationEvent;

public class StudentDeletedEvent extends ApplicationEvent {

    private final Long studentId;

    public StudentDeletedEvent(Long studentId) {
        super(studentId);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }
}