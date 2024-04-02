package com.example.StudentRegistration.Event;

import com.example.StudentRegistration.dto.Student;
import com.example.StudentRegistration.service.StudentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentStartupInitializer implements ApplicationRunner {

    private final StudentService studentService;
    private final boolean createStudentsOnStartup;

    public StudentStartupInitializer(StudentService studentService, @Value("${create.students.on.startup:true}") boolean createStudentsOnStartup) {
        this.studentService = studentService;
        this.createStudentsOnStartup = createStudentsOnStartup;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (createStudentsOnStartup) {
            // Создание студентов при старте приложения
            studentService.addStudent("John", "Doe", 20);
            studentService.addStudent("Jane", "Smith", 22);
            studentService.addStudent("Alice", "Johnson", 21);
        }
    }
}