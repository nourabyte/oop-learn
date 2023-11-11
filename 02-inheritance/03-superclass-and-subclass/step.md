# Step 03: SuperClass And SubClass
In `inheritance`, the `superclass` and `subclass` refer to the **relationship** between **classes**. 

## Concept
>Superclass: class that is being inherited from.

It is also referred to **parent class or base class**. A `superclass` defines common **characteristics, properties, and behaviors** that **can be shared** by multiple `subclasses`.

>Subclass: a subclass is a class that inherits from a superclass.

is the **child class or derived class**. A `subclass extends` the **functionality of the superclass** by **adding** its own unique properties, methods, and behaviors. It can also override or modify the inherited members from the superclass.

## Example
```java
class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking.");
    }
}
class Cat extends Animal {
    public void meow() {
        System.out.println("The cat is meowing.");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();      /* Inherited from superclass Animal */
        dog.bark();     /* Defined in subclass Dog */

        Cat cat = new Cat();
        cat.eat();      /* . Inherited from superclass Animal */
        cat.meow();     /* . Defined in subclass Cat */
    }
}


```
## Practice
1- What keyword do you use in a class declaration to create a subclass?
