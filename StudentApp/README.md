## StudentApp

1) Создан класс *StudentStream* (поток студентов с полем номер потока), содержащий в себе список учебных групп (*StudentGroup*).
2) Для класса *StudentSteam* реализован интерфейс *Iterable*
3) Для класса *StudentGroup* реализован интерфейс *Comparable* (сортировка по количеству студентов в группе)
4) Переопределены методы *ToString* классов *StudentGroup* (вывод идентификатора группы, количество студентов и список студентов) и *StudentSteam* (вывод названия потока, количество групп и список студентов с указанием идентификатора группы)


####Вывод групп из класса StudentStream через for:
```
	GROUP 8080 (4 students):
		Student Иван(age=22; id=121)
		Student Игорь(age=23; id=444)
		Student Даша(age=23; id=171)
		Student Лена(age=23; id=104)

	GROUP 7070 (3 students):
		Student Магомед(age=19; id=204)
		Student Женесбек(age=20; id=206)
		Student Умиджон(age=21; id=215)

	GROUP 6060 (3 students):
		Student Магомед(age=19; id=204)
		Student Женесбек(age=20; id=206)
		Student Умиджон(age=21; id=215)
```

####Сортировка групп студентов в потоке сначала по количеству студентов (от большего к меньшему), а затем по идентификатору группы (от меньшего к большему):
```
============= before sort =============

Economic stream (size: 3)
	GROUP 7070 (3 students):
		Student Магомед(age=19; id=204)
		Student Женесбек(age=20; id=206)
		Student Умиджон(age=21; id=215)
	GROUP 8080 (4 students):
		Student Иван(age=22; id=121)
		Student Игорь(age=23; id=444)
		Student Даша(age=23; id=171)
		Student Лена(age=23; id=104)
	GROUP 6060 (3 students):
		Student Айгуль(age=24; id=322)
		Student Фарануш(age=25; id=333)
		Student Гульнара(age=26; id=344)
```
```
============= after sort ==============

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