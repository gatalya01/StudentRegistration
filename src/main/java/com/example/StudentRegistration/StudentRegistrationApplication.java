package com.example.StudentRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
@ConfigurationProperties("student")
public class StudentRegistrationApplication {
	private boolean createStudentsOnStartup;

	public static void main(String[] args) {
		SpringApplication.run(StudentRegistrationApplication.class, args);
	}

	public boolean isCreateStudentsOnStartup() {
		return createStudentsOnStartup;
	}

	public void setCreateStudentsOnStartup(boolean createStudentsOnStartup) {
		this.createStudentsOnStartup = createStudentsOnStartup;
	}
}