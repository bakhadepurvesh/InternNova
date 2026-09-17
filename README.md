# InternNova Virtual Internship — Week 1 Java Fundamentals

## 📌 Overview

This repository contains my **Week 2 tasks** completed as part of the **InternNova Virtual Internship**.

During this week, I practiced fundamental Java concepts related to variables, data types, user input, operators, type casting, and Java modifiers.

---

## 📚 Topics Covered

### 1. Java Data Types

Practiced different Java data types and their usage:

* `String`
* `int`
* `long`
* `float`
* `double`
* `char`
* `boolean`

Example:

```java
String name = "Purvesh";
int age = 22;
double cgpa = 6.56;
char gender = 'M';
boolean isStudent = true;
```

---

### 2. Scanner Class

Used the `Scanner` class to accept input from the user.

```java
Scanner sc = new Scanner(System.in);

int num = sc.nextInt();
double value = sc.nextDouble();
char ch = sc.next().charAt(0);
```

---

### 3. Arithmetic Operators

Practiced basic arithmetic operations:

* Addition `+`
* Subtraction `-`
* Multiplication `*`
* Division `/`
* Modulus `%`

Example:

```java
float modulus = num1 % num2;
```

The `%` operator returns the remainder after division.

---

### 4. Implicit Type Casting

Implicit type casting is the **automatic conversion of a smaller data type into a larger compatible data type** by Java.

Example:

```java
int num = 10;
double result = num;

System.out.println(result);
```

Output:

```text
10.0
```

Example conversions:

```text
int → long
int → float
int → double
char → int
```

---

### 5. Explicit Type Casting

Explicit type casting is the **manual conversion of one data type into another data type using the casting operator `(datatype)`**.

Example:

```java
double num = 25.75;

int result = (int) num;

System.out.println(result);
```

Output:

```text
25
```

Here:

```text
double → int
```

The decimal portion is removed during the conversion.

---

### 6. Type Casting with Different Data Types

Practiced both implicit and explicit casting wherever applicable.

Example:

```java
int num1 = 100;

double implicitResult = num1;

double num2 = 99.99;

int explicitResult = (int) num2;
```

---

### 7. `static` Keyword

Learned the basic concept of the `static` keyword.

A `static` member belongs to the **class rather than an individual object**.

Example:

```java
class Test {

    static int number = 10;

}
```

Also learned that a **static local variable is not allowed in Java**.

```java
void test() {

    // static int x = 10;   // Not allowed
}
```

---

### 8. `final` Local Variable

Learned that a local variable can be declared as `final`.

A `final` variable cannot be reassigned after its value has been assigned.

Example:

```java
final int age = 22;

// age = 23;  // Error
```

---

## 💻 Week 2 Practice Program

The main practice program accepts values from the user and performs type casting operations.

```java
package Task_First;

import java.util.Scanner;

public class Fundamentals_Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num1 = sc.nextInt();

        // Implicit casting: int → double
        double num2 = num1;

        System.out.println("Before casting: " + num1);
        System.out.println("After implicit casting: " + num2);

        System.out.print("Enter a double value: ");
        double value = sc.nextDouble();

        // Explicit casting: double → int
        int result = (int) value;

        System.out.println("Before casting: " + value);
        System.out.println("After explicit casting: " + result);

        sc.close();
    }
}
```

---

## 🎯 Learning Outcomes

Through this week's practice, I learned:

* How to use different Java data types.
* How to take user input using `Scanner`.
* How arithmetic operators work.
* The difference between implicit and explicit type casting.
* How Java automatically performs widening conversion.
* How to manually perform narrowing conversion.
* The basic purpose of the `static` keyword.
* How `final` variables work.
* How data can change when converting between different data types.

---

## 📁 Project Structure

```text
InternNova-Week-2/
│
├── src/
│   └── Task_First/
│       └── Fundamentals_Practice.java
│
└── README.md
```

---

## 🏷️ Internship

**Program:** InternNova Virtual Internship
**Task:** Week 2
**Domain:** Java Development
**Focus:** Java Fundamentals & Type Casting

---

## 👨‍💻 Author

**Purvesh Bakhade**

Java Developer | Spring Boot | React | MySQL | REST APIs
