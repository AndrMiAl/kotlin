# Учебные задачи на Kotlin

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?logo=kotlin&logoColor=white)
![Education](https://img.shields.io/badge/Учебный_проект-333333)

Подборка самостоятельных учебных задач на **Kotlin**: работа с числами и строками, коллекции, функции высшего порядка и основы ООП.

## Задачи

| Файл | Что демонстрирует |
|---|---|
| [`01-max-digit-divisible-by-3.kt`](./01-max-digit-divisible-by-3.kt) | Фильтрация цифр и поиск максимума |
| [`02-first-char-shortest-even-word.kt`](./02-first-char-shortest-even-word.kt) | Строки, коллекции и поиск минимума |
| [`03-max-digit-by-predicate.kt`](./03-max-digit-by-predicate.kt) | Функция высшего порядка с предикатом |
| [`04-count-unique-digit-numbers.kt`](./04-count-unique-digit-numbers.kt) | `Set` и проверка уникальности цифр |
| [`05-bitwise-or-first-digits.kt`](./05-bitwise-or-first-digits.kt) | Побитовое `OR` и преобразование коллекций |
| [`06-pythagorean-triple.kt`](./06-pythagorean-triple.kt) | Последовательности, тройки и условный поиск |
| [`07-student-median-ranking.kt`](./07-student-median-ranking.kt) | Медиана, сортировка и составной компаратор |
| [`08-max-nullable-functions.kt`](./08-max-nullable-functions.kt) | Nullable-значения и функции как параметры |
| [`09-date-plus-two-months.kt`](./09-date-plus-two-months.kt) | Календарная логика и високосный год |
| [`10-max-odd-digit.kt`](./10-max-odd-digit.kt) | Цикл и обработка цифр числа |
| [`11-ebook-oop.kt`](./11-ebook-oop.kt) | Интерфейсы, наследование, сервис и presenter |
| [`12-mutual-funds-decorator.kt`](./12-mutual-funds-decorator.kt) | Делегирование и паттерн Decorator |

Каждый файл — отдельный небольшой пример со своей точкой входа `main`.

## Запуск

Если установлен Kotlin compiler:

```bash
kotlinc 01-max-digit-divisible-by-3.kt -include-runtime -d app.jar
java -jar app.jar
```

Для другого задания замените имя `.kt`-файла в команде.

Также репозиторий удобно открыть в **IntelliJ IDEA** и запускать примеры по отдельности.

## Назначение

Репозиторий показывает прогресс в изучении Kotlin: от базового синтаксиса и коллекций до функций высшего порядка и объектно-ориентированных примеров.
