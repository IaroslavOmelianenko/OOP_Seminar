## StudentApp

1) Создан класс *TeacherService*. Подключен обобщенный интерфейс *iPersonService*. Добавлен метод вывода списка учителей отсортированного обобщенным классом *PersonComparator*.
2) Создан класс *TeacherController*. Подключен обобщенный интерфейс *iPersonController*.
3) Разработан обобщенный класс *AverageAge* для подсчета среднего возраста студентов, учителей и работников.


<<<<<<< HEAD
#### Результат работы класса AverageAge в консоли:
=======
#### Вывод групп из класса StudentStream через for:
>>>>>>> a23f00c45f9462cb8373f443ee42c7f6a14a4d29
```
============== Average age ==============
Average age of students: 24
Average age of teachers: 41
Average age of employees: 59
```

<<<<<<< HEAD
#### Вывод студентов, преподавателей и работников:
=======
#### Сортировка групп студентов в потоке сначала по количеству студентов (от большего к меньшему), а затем по идентификатору группы (от меньшего к большему):
>>>>>>> a23f00c45f9462cb8373f443ee42c7f6a14a4d29
```
============== Students ==============
		Student Иван(age=25; id=121)
		Student Игорь(age=23; id=301)

============== Teachers ==============
        Teacher Иван Игоревич(age=40; Доцент)
		Teacher Игорь Евгеньевич(age=45; Профессор)
		Teacher Федор Иванович(age=39; Доцент)

<<<<<<< HEAD
============== Employees ==============
		Employee Петрович(age=60; Сантехник)
		Employee Саныч(age=55; Электрик)
		Employee Сергеич(age=62; Электрик)
```
=======
Economic stream (size: 3)
	GROUP 8080 (4 students):
		Student Иван(age=22; id=121)
		Student Игорь(age=23; id=444)
		Student Даша(age=23; id=171)
		Student Лена(age=23; id=104)
	GROUP 6060 (3 students):
		Student Айгуль(age=24; id=322)
		Student Фарануш(age=25; id=333)
		Student Гульнара(age=26; id=344)
	GROUP 7070 (3 students):
		Student Магомед(age=19; id=204)
		Student Женесбек(age=20; id=206)
		Student Умиджон(age=21; id=215)
```
>>>>>>> a23f00c45f9462cb8373f443ee42c7f6a14a4d29
