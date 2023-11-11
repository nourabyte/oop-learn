# Step 05: Override method
Allows a `subclass` to provide a different implementation of a method that is already defined in its `superclass`.

## Concept
When a **subclass** `overrides` a method, it provides a new implementation of that method with the **same signature** (name, return type, and parameters) as the method in the **superclass**. The subclass can modify the behavior of the method to suit its specific requirements.

Use the `@Override` annotation when overriding a method, this annotation informs the compiler that the intention is to override a method, and it helps catch errors if the method signature does not match any method in the superclass.
## Example
```java
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}
public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); 

        Dog dog = new Dog();
        dog.makeSound(); 

        Cat cat = new Cat();
        cat.makeSound(); 
    }
}
```

## Practice
1. Can you identify the error in below code snippet?
```java
class A
{
    void myMethod()
    {
        System.out.println("Super Class");
    }
} 
class B extends A
{
    @Override
    void myMethod() throws SQLException
    {
        System.out.println("Sub Class");
    }
}
