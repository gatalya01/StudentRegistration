plugins {
	id("org.springframework.boot") version "3.1.11-SNAPSHOT"
	id("io.spring.dependency-management") version "1.1.4"
	id("java")
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_19
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
	maven { url = uri("https://repo.spring.io/snapshot") }
}

extra["springShellVersion"] = "3.1.10"

dependencies {
	implementation("org.projectlombok:lombok")
	implementation("org.springframework.shell:spring-shell-starter")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

dependencyManagement {
	imports {
		mavenBom("org.springframework.shell:spring-shell-dependencies:${property("springShellVersion")}")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.bootBuildImage {
	builder.set("paketobuildpacks/builder-jammy-base:latest")
}