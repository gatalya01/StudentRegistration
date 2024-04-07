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

    @ShellMethod(value = "Добавить студента. Пример использования: addStudent John Doe 20", key = {"addStudent"})
    public void addStudent(String firstName, String lastName, int age) {
        studentService.addStudent(firstName, lastName, age);
    }

    @ShellMethod(value = "Удалить студента по ID. Пример использования: removeStudent 123e4567-e89b-12d3-a456-556642440000", key = {"removeStudent"})
    public void removeStudent(String id) {
        studentService.removeStudent(UUID.fromString(id));
    }

    @ShellMethod(value = "Показать всех студентов", key = {"showStudents"})
    public void showStudents() {
        List<Student> students = studentService.getAllStudents();
        students.forEach(System.out::println);
    }

    @ShellMethod(value = "Очистить список студентов", key = {"clearStudents"})
    public void clearStudents() {
        studentService.clearStudents();
    }
}