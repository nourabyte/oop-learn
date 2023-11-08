# Step 01: What Is An Object Oriented Programming
  `OOP` is that it helps to **organize** your `code` in a logical and modular way.

## Concept
`OOP` or **Object-oriented programming** is a programming methodology that revolves around the concepts of `class` and `object`. It is used to structure software programs into **simple**, **reusable** pieces of code known as **class**. These class serve as **blueprint** or **template** for creating individual **instance** of **object**.

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

1. Based on the previous example, create a new object called secondNumber that has a value of 9.
