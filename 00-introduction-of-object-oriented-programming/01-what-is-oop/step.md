# Step 01: What is an object oriented programming
  > OOP is that it helps to organize your code in a logical and modular way.

## Concept
`OOP` or **Object-oriented programming** is a programming methodology that revolves around the concepts of `class` and `object`. It is used to structure software programs into **simple**, **reusable** pieces of code known as **classes**. These classes serve as **blueprints** or **templates** for creating individual **instances** of **objects**.

## Example
```java
/* 1. Create new class. */
public class Number {
   public int value = 10;

   public static void main(String[] args) {
      /* 2. Create new object */
      Number firstNumber = new Number(); 
      System.out.println(firstNumber.value);
   }
}
```

## Practice

1- Create a new value secondNumber, based on previous example, that return number 9.
