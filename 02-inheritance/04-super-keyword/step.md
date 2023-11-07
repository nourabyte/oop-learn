# Step 03: Super Keyword
**unique keyword** is a reference variable that is used to refer to parent class objects.

## Concept
`Super` keyword is used to refer to the **superclass constructor**, **superclass methods**, and **superclass variables**.
It is often used in subclass code to invoke or access the **superclass** elements.
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
1. Can we call super class methods from static methods of sub class?
