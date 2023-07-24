## StudentAppMVC

1) Сделан вариант класса *ViewEng* с текстом на английском языке.
2) Сделан вариант класса *ModelHash* с хранилищем типа *HashMap<Long,Student>*.
3) Добавлена команда в метод *run* класса контролер по удалению студента:
   - запрашивается у пользователя номер студента на удаление
   - вызов удаления у модели
   - если такого номера нет, выводится сообщение


#### Выбор языка:
```
Choose language. Enter the number: RUS - 1 / ENG - 2: 
1
Language set to Rus
Команды: NONE / READ / CREATE / UPDATE / LIST / DELETE / EXIT
Введите команду: 
```
```
Choose language. Enter the number: RUS - 1 / ENG - 2: 
2
Language set to Eng
Commands: NONE / READ / CREATE / UPDATE / LIST / DELETE / EXIT
Enter command: 
```

#### Удаление студента:
```
Commands: NONE / READ / CREATE / UPDATE / LIST / DELETE / EXIT
Enter command: DELETE
Enter the student ID to delete: 111
Student with id 111 removed
```

#### Введение неверного ID при удалении студента:
```
Commands: NONE / READ / CREATE / UPDATE / LIST / DELETE / EXIT
Enter command: DELETE
Enter the student ID to delete: 555
Student 555 not found
```