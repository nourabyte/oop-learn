# Step 03: Super Keyword
**unique keyword** is a reference variable that is used to refer to parent class objects.

## Concept

`Super` it is used to call superclass methods, and to access the superclass constructor.
The most common use of the `super` keyword is to eliminate the confusion between **superclasses and subclasses** that have methods with the same name.
- super with variables
- super with methods
- super with constructors
  
## Example
```java
/* 1. super with variables */
class Vehicle {
	int maxSpeed = 120;
}
class Car extends Vehicle {
	int maxSpeed = 180;
	void display()
	{
  System.out.println("Maximum Speed: "+ super.maxSpeed);  }
  }
class Test {
    public static void main(String[] args)
    {
        Car small = new Car();
        small.display();  }
}
/* 2. super with Methods */
class Person {
    void message()
    {
        System.out.println("This is person class\n");  }
 }
class Student extends Person {
    void message()
    {
        System.out.println("This is student class");
    }
    void display()
    {
        message();
        super.message();
    }
}
class Test {
    public static void main(String args[])
    {
        Student s = new Student();
        s.display();  }
}

/* 3. super with constructors */
class Person {
    Person()
    {
        System.out.println("Person class Constructor");
    }
}
class Student extends Person {
    Student()
    {
        super();
 
        System.out.println("Student class Constructor");
    }
}
class Test {
    public static void main(String[] args)
    {
        Student s = new Student();
    }
}
```
## Practice

