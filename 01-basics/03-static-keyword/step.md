# Step 03: Static
When a member is declared `static` it can be accessed **before any objects of its class** are created, and **without reference to any object.**

## Concept
`Static` **variables and methods** are **not** associated with **individual objects**. Instead, they are shared among **all instances of the class.**
### `Static variable` :
if we declare a variable static, **all objects of the class share the same static variable** It is because like static methods, static variables are also associated with the class, and we don't need to create objects of the class to access the static variables.
```java
   static int max = 10;
```
### `Static method` :
- Static methods are associated with the class itself and can be called directly using the class name, without the need to create an object.
- They cannot access non-static (instance) variables or methods directly, but they can access other static members within the same class.
- Static methods are commonly used for utility methods, mathematical computations, or operations that don't require specific instance state.

## Example
```java
public class SimpleStaticExample {
    private static int instanceCount = 0; // static variable

    public SimpleStaticExample() {
        instanceCount++; // Increment the instance count each time a new object is created
    }

    public static int getInstanceCount() { // static method
        return instanceCount;
    }

    public static void main(String[] args) {
        SimpleStaticExample obj1 = new SimpleStaticExample();
        SimpleStaticExample obj2 = new SimpleStaticExample();
        SimpleStaticExample obj3 = new SimpleStaticExample();

        System.out.println("Instance Count: " + SimpleStaticExample.getInstanceCount()); // Output: Instance Count: 3
    }
}
```

## Practice
1. Can we Overload static method?
