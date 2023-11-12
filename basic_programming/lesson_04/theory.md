# Lesson 04

## Зачем Используются Различные Системы Счисления

Системы счисления играют важную роль в области информатики и вычислительной техники.
Основная цель использования различных систем счисления - представление данных и выполнение арифметических операций в
удобной и эффективной форме,
которая подходит для конкретного применения или устройства.

### Двоичная Система

Двоичная система (с основанием 2) используется почти во всех цифровых компьютерах и устройствах, так как она идеально
подходит для физического представления данных
с помощью двух состояний (включено/выключено, 0/1). Простота и надежность хранения и обработки двоичных данных делают ее
основой современной вычислительной техники.

_Чтобы записать в коде число в двоично системе используется префикс `0b`_
`int x = 0b101; // 5`

<details style="margin-left: 20px;">
<summary><strong><em> Десятичная и Двоичная Системы Счисления: (нажмите на треугольник, чтобы развернуть текст)</em></strong></summary>

Десятичная система счисления (с основанием 10) — это система, используемая в повседневной жизни, состоящая из цифр от 0
до 9.
Двоичная система (с основанием 2) использует только два символа: 0 и 1.

### Перевод из Двоичной Системы в Десятичную

Чтобы перевести число из двоичной системы в десятичную, следует умножить каждый бит на 2, возведенное в степень его
позиции (начиная справа с нуля), и затем суммировать результаты.

Пример: перевод двоичного числа `1101` в десятичное
`1*2^3 + 1*2^2 + 0*2^1 + 1*2^0 = 8 + 4 + 0 + 1 = 13`

### Перевод из Десятичной Системы в Двоичную

Чтобы перевести число из десятичной системы в двоичную, нужно делить число на 2 и записывать остатки от деления, пока
число не станет равно нулю.
Затем записанные остатки читаются снизу вверх.

Пример: перевод десятичного числа 13 в двоичное  
`13 / 2 = 6`, остаток 1  
`6 / 2 = 3`, остаток 0  
`3 / 2 = 1`, остаток 1  
`1 / 2 = 0`, остаток 1  
Результат: `1101`
--------
</details>

### Восьмеричная (октальная) и Шестнадцатеричная (гексальная) Системы

Восьмеричная (с основанием 8) и шестнадцатеричная (с основанием 16) системы часто используются в программировании и
вычислительной технике для упрощения работы с
двоичными данными. Восьмеричные и шестнадцатеричные числа позволяют представить длинные последовательности двоичных
чисел более компактно и удобно для восприятия человека.
Например, в системах UNIX и при низкоуровневом программировании для представления прав доступа и адресов памяти часто
используются эти системы.

_Чтобы записать в коде число в восьимиричной системе используется префикс `0`_  
`int x = 010; // 8`

_Чтобы записать в коде число в восьимиричной системе используется префикс `0x`_
`int x = 0x1A3; // 419`

<details style="margin-left: 20px;">
<summary><strong><em> Восьмеричная (октальная) и Шестнадцатеричная (гексальная) Системы: (нажмите на треугольник, чтобы развернуть текст)</em></strong></summary>

### Восьмеричная -> десятичную

Для перевода октального числа в десятичное умножаем каждую цифру на 8, возведенную в степень позиции цифры (начиная
справа с 0).

Пример: перевод октального числа `157` в десятичное  
`7*8^0 + 5*8^1 + 1*8^2 = 7 + 40 + 64 = 111`

Чтобы перевести число из десятичной системы в восьмеричную, следует делить число на 8 до тех пор, пока результат деления
не будет равен нулю,
записывая остатки. Полученные остатки читаются в обратном порядке.

### Десятичная -> Восьмеричная

Переведем десятичное число `156` в восьмеричное.

`156 / 8 = 19`, остаток 4
`19 / 8 = 2`, остаток 3
`2 / 8 = 0`, остаток 2
Результат: 234 (в восьмеричной системе)


### Десятичная -> шестнадцатеричная

Чтобы перевести шестнадцатеричное число в десятичное, умножаем каждую цифру на 16, возведенную в степень позиции цифры (
начиная справа с 0).

Пример: перевод шестнадцатеричного числа `1A3` в десятичное   
`3*16^0 + A(10)*16^1 + 1*16^2 = 3 + 160 + 256 = 419`


### Шестнадцатеричная -> Десятичная

Переведем десятичное число 156 в шестнадцатеричное.

`156 / 16 = 9`, остаток 12 (C в шестнадцатеричной системе)
`9 / 16 = 0`, остаток 9
Результат: 9C (в шестнадцатеричной системе)

</details>

### Десятичная Система

Десятичная система (с основанием 10) - это универсально используемая система счисления в повседневной жизни. Это
объясняется историческими и практическими причинами,
включая естественное использование 10 пальцев на руках для счета.

Эти системы счисления предлагают разные преимущества в зависимости от области применения, будь то программирование,
электроника или простые арифметические расчеты.


<details style="margin-left: 20px;">
<summary><strong><em> Пример кода: (нажмите на треугольник, чтобы развернуть текст)</em></strong></summary>

```java
public class NumberSystemsOperations {

    public static void main(String[] args) {
        // Двоичное число (например, 0b1101 соответствует 13 в десятичной системе)
        int binaryNumber = 0b1101; 

        // Десятичное число (например, 10)
        int decimalNumber = 10; 

        // Восьмеричное число (например, 0157 соответствует 111 в десятичной системе)
        int octalNumber = 0157; 

        // Шестнадцатеричное число (например, 0x1A3 соответствует 419 в десятичной системе)
        int hexNumber = 0x1A3; 

        // Примеры операций
        // Сложение двоичного и десятичного числа
        int sumBinaryDecimal = binaryNumber + decimalNumber;
        System.out.println("Сумма двоичного и десятичного: " + sumBinaryDecimal); // 23

        // Вычитание восьмеричного числа из шестнадцатеричного
        int differenceHexOctal = hexNumber - octalNumber;
        System.out.println("Разность шестнадцатеричного и восьмеричного: " + differenceHexOctal); // 308

        // Умножение восьмеричного и десятичного числа
        int productOctalDecimal = octalNumber * decimalNumber;
        System.out.println("Произведение восьмеричного и десятичного: " + productOctalDecimal); // 1110

        // Деление шестнадцатеричного на двоичное число
        int divisionHexBinary = hexNumber / binaryNumber;
        System.out.println("Частное шестнадцатеричного и двоичного: " + divisionHexBinary); // 32
    }
}

```

В этом коде:

 - Числа задаются в разных системах счисления.
 - Выполняются различные математические операции: сложение, вычитание, умножение и деление.
- Результаты операций выводятся в консоль. Все операции выполняются с числами, представленными в их первоначальных
  системах счисления, но результаты отображаются в десятичной форме, так как это формат по умолчанию для вывода чисел в
  Java.

</details>

## Биты и Байты

Бит (Binary digit) — это основная единица измерения информации, представляющая два состояния: 0 или 1.
Байт состоит из 8 битов и является стандартной единицей, используемой для измерения объема данных.


## Хранение Отрицательных Чисел

Отрицательные числа обычно хранятся с использованием дополнительного кода (two's complement).
В этом методе старший бит (leftmost bit) используется как знаковый бит: 0 для положительных и 1 для отрицательных чисел.

## Переполнение

Переполнение происходит, когда результат арифметической операции превышает максимально допустимый размер, который может
храниться в переменной.
Это может привести к неожиданным результатам или ошибкам.

<details style="margin-left: 20px;">
<summary><strong><em> Примеры Переполнения для Различных Типов Данных: (нажмите на треугольник, чтобы развернуть текст)</em></strong></summary>


### Переполнение целочисленных типов (int, long)

Целочисленные типы, такие как `int` и `long`, имеют фиксированный диапазон значений.
Переполнение происходит, когда результат операции выходит за эти пределы.

#### Пример для `int`

```java
// Максимальное значение для int: 2,147,483,647
int maxValue = Integer.MAX_VALUE;
int result = maxValue + 1; // Здесь происходит переполнение
// result становится -2,147,483,648 (Integer.MIN_VALUE)
```

#### Пример для `long`

```java
// Максимальное значение для long: 9,223,372,036,854,775,807
long maxValueLong = Long.MAX_VALUE;
long resultLong = maxValueLong + 1; // Переполнение
// resultLong становится -9,223,372,036,854,775,808 (Long.MIN_VALUE)
```

### Переполнение с плавающей точкой (float, double)

Для типов с плавающей точкой, таких как `float` и `double`, переполнение обрабатывается по-разному.
Вместо "оборачивания" значений, как у целочисленных типов, результатом переполнения может стать специальное значение "
бесконечность".

#### Пример для `float`

```java
// Максимальное значение для float: 3.4028235E38
float maxValueFloat = Float.MAX_VALUE;
float resultFloat = maxValueFloat * 2; // Переполнение
// resultFloat становится "Infinity"
```

#### Пример для `double`

```java
// Максимальное значение для double: 1.7976931348623157E308
double maxValueDouble = Double.MAX_VALUE;
double resultDouble = maxValueDouble * 2; // Переполнение
// resultDouble становится "Infinity"
```

### Заметка о переполнении

Переполнение часто приводит к ошибкам в программе, так как результат операции не соответствует ожиданиям.
Важно учитывать диапазоны значений при работе с различными типами данных.

</details>

## Явное и не явное Приведение Типов

В Java явное приведение типов данных (explicit casting) происходит, когда мы явно указываем тип, к которому должно быть
преобразовано значение. Неявное приведение типов (implicit casting), или автоматическое преобразование, происходит
автоматически, когда значение одного типа автоматически преобразуется в другой тип без явного указания.

<details style="margin-left: 20px;">
<summary><strong><em> Явное и Неявное Приведение Типов: (нажмите на треугольник, чтобы развернуть текст)</em></strong></summary>

## Неявное Приведение Типов (Implicit Casting)

Неявное приведение типов данных работает от меньших типов к большим, когда не надо "явно" указывать тип:

`byte` -> `short` -> `int` -> `long` -> `float` -> `doule`

Неявное приведение типов происходит автоматически, когда переменной меньшего размера (например, `int`) присваивается
значение большего размера (например, `long`).

### Пример Неявного Приведения

```java
int smallValue = 100;
long largeValue = smallValue; // Неявное приведение из int в long
// largeValue будет равно 100, приведение происходит автоматически
```

<details style="margin-left: 20px;">
<summary><strong><em> Бытовая Аналогия для Неявного Приведения Типов: (нажмите на треугольник, чтобы развернуть текст)</em></strong></summary>

Теперь представь, что у тебя есть набор коробок разного размера, которые автоматически расширяются, чтобы вместить
предмет, который ты в них кладешь. Ты кладешь маленький кубик в одну из таких коробок, и коробка автоматически
адаптируется к размеру кубика без каких-либо усилий с твоей стороны. Это схоже с неявным приведением типов, когда
меньший тип данных (кубик) автоматически преобразуется в больший тип (коробка) без потери информации и без необходимости
каких-либо действий со стороны программиста.
</details>

## Явное Приведение Типов (Explicit Casting)

Явное приведение типов используется, когда нужно преобразовать значение более широкого типа в значение более узкого
типа, например, из `double` в `int`.

### Пример Явного Приведения

```java
double doubleValue = 9.99;
int intValue = (int) doubleValue; // Явное приведение из double в int
// intValue будет равно 9, так как дробная часть отсекается
```

<details style="margin-left: 20px;">
<summary><strong><em> Бытовая Аналогия для Явного Приведения Типов: (нажмите на треугольник, чтобы развернуть текст)</em></strong></summary>

Представим, что ты хочешь поместить большой квадратный предмет в меньшую круглую коробку. Ты понимаешь, что это не
удастся сделать без изменений. Поэтому ты аккуратно обрезаешь углы предмета, чтобы он поместился в коробку. В этом
случае, ты самостоятельно (явно) изменил форму предмета, чтобы он подошёл. Это похоже на явное приведение типов в
программировании, когда ты сам указываешь, что и как нужно преобразовать, даже если это может привести к потере
информации (например, обрезанию углов).
</details>

### Важность Понимания Приведения Типов

Понимание разницы между явным и неявным приведением типов критически важно, так как неправильное использование может
привести к потере данных (например, при обрезке дробной части) или к ошибкам в коде.

</details>

<details style="margin-left: 20px;">
<summary><strong><em> Пример кода: (нажмите на треугольник, чтобы развернуть текст)</em></strong></summary>

```java
public class CastingExample {

    public static void main(String[] args) {
        // Неявное приведение типов (Implicit Casting)
        // Пример: преобразование от меньшего к большему типу данных
        int intVal = 100;
        long longVal = intVal; // неявное приведение из int в long
        float floatVal = longVal; // неявное приведение из long в float
        System.out.println("Неявное приведение (int -> long): " + longVal);
        System.out.println("Неявное приведение (long -> float): " + floatVal);

        // Явное приведение типов (Explicit Casting)
        // Пример: преобразование от большего к меньшему типу данных
        double doubleVal = 9.99;
        int intValFromDouble = (int) doubleVal; // явное приведение из double в int
        short shortValFromInt = (short) intValFromDouble; // явное приведение из int в short
        System.out.println("Явное приведение (double -> int): " + intValFromDouble);
        System.out.println("Явное приведение (int -> short): " + shortValFromInt);
    }
}
```

В этом примере:

- Для неявного приведения используются типы `int`, `long` и `float`, где значения автоматически преобразуются от
  меньшего к большему типу данных без явного указания.
- Для явного приведения используются типы `double`, `int` и `short`, где значения преобразуются от большего к меньшему
  типу данных с явным указанием типа, к которому осуществляется приведение.

</details>




