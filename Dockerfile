# Используем базовый образ OpenJDK
FROM openjdk:17-jdk-alpine

# Устанавливаем рабочую директорию внутри контейнера
WORKDIR /app

# Копируем собранный JAR файл внутрь контейнера
COPY build/libs/StudentRegistration-0.0.1-SNAPSHOT.jar app.jar

# Определяем команду для запуска приложения при старте контейнера
CMD ["java", "-jar", "app.jar"]