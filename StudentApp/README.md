## StudentApp

1) Создан класс *TeacherService*. Подключен обобщенный интерфейс *iPersonService*. Добавлен метод вывода списка учителей отсортированного обобщенным классом *PersonComparator*.
2) Создан класс *TeacherController*. Подключен обобщенный интерфейс *iPersonController*.
3) Разработан обобщенный класс *AverageAge* для подсчета среднего возраста студентов, учителей и работников.


#### Результат работы класса AverageAge в консоли:
```
============== Average age ==============
Average age of students: 24
Average age of teachers: 41
Average age of employees: 59
```

#### Вывод студентов, преподавателей и работников:
```
============== Students ==============
		Student Иван(age=25; id=121)
		Student Игорь(age=23; id=301)

============== Teachers ==============
        Teacher Иван Игоревич(age=40; Доцент)
		Teacher Игорь Евгеньевич(age=45; Профессор)
		Teacher Федор Иванович(age=39; Доцент)

============== Employees ==============
		Employee Петрович(age=60; Сантехник)
		Employee Саныч(age=55; Электрик)
		Employee Сергеич(age=62; Электрик)
```