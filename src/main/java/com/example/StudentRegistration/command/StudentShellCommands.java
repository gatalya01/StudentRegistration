package com.example.StudentRegistration.command;

import com.example.StudentRegistration.dto.Student;
import com.example.StudentRegistration.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import java.util.List;
import java.util.UUID;

@ShellComponent
public class StudentShellCommands {
    private final StudentService studentService;

    @Autowired
    public StudentShellCommands(StudentService studentService) {
        this.studentService = studentService;
    }

    @ShellMethod("Добавить студента")
    public void addStudent(String firstName, String lastName, int age) {
        studentService.addStudent(firstName, lastName, age);
    }

    @ShellMethod("Удалить студента по ID")
    public void removeStudent(UUID id) {
        studentService.removeStudent(id);
    }

    @ShellMethod("Показать всех студентов")
    public void showStudents() {
        List<Student> students = studentService.getAllStudents();
        students.forEach(System.out::println);
    }

    @ShellMethod("Очистить список студентов")
    public void clearStudents() {
        studentService.clearStudents();
    }
}