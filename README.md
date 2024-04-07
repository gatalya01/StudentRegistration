# Приложение для "Учёта студентов"

Это простое консольное приложение для управления записями студентов. Оно позволяет добавлять, удалять, просматривать и очищать записи студентов через интерфейс командной строки.

Как запустить!

Для запуска приложения вам потребуется установленная на вашей системе Java. Выполните следующие шаги:

Запуск с помощью Gradle

Вы можете запустить приложение с помощью Gradle следующей командой:
./gradlew bootRun

Запуск с помощью Docker

Вы также можете собрать Docker-образ и запустить контейнер с помощью Docker. Для этого выполните следующие команды:

./gradlew bootBuildImage

docker run -p 8080:8080 -t student-registration:0.0.1-SNAPSHOT

Настройки по умолчанию!

По умолчанию приложение настроено на создание записей студентов при запуске. Вы можете изменить это поведение, изменив соответствующую настройку в файле application.properties.

Доступные команды!

Приложение поддерживает следующие команды:

addStudent: Добавляет нового студента в записи.

removeStudent: Удаляет студента из записей по ID.

showStudents: Отображает все записи студентов.

clearStudents: Очищает все записи студентов.

Пример использования
Вот как вы можете использовать эти команды:

Чтобы добавить студента: *addStudent John Doe 20*

Чтобы удалить студента по ID: *removeStudent 123e4567-e89b-12d3-a456-556642440000*

Чтобы показать всех студентов: *showStudents*

Чтобы очистить всех студентов: *clearStudents*