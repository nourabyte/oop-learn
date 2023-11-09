# Step 04: What Is Methods
Collection of instructions that performs a specific task.
## Concept
>Method is a **block of code** that performs a specific task.

We write a **method** once and use it many times
- `Defining Method`: provides information about modifier,return type, name, parameter list(), 
 and a body between braces, {}.
  ```java
  public double calculatediv(double numberOne, int numberTwo) {
  }
  ```
  
 - `Return type`: data type of the value returned by the method or void if does not return a value. It is **mandatory** in syntax.
 - `Naming Method`: should be a verb in lowercase or a multi-word name that begins with a verb in lowercase, has a unique name within its class. It is **mandatory** in syntax.
 - `Parameter list`: comma-separated list of the **input parameters is defined**, preceded by their data type, if there are no parameters, you must use **empty parentheses ()**.  It is **optional** in syntax.

## Example
```java
class Main {
  /* 1. method with no parameter */
  public void display1() {
    System.out.println("Method without parameter");
  }
  /* 2. method with single parameter */
  public void display2(int a) {
    System.out.println("Method with a single parameter: " + a);
  }
  /* 3. method takes two parameter */
   public int addNumbers(int a, int b) {
    int sum = a + b;
    // return value
    return sum;
  }

  public static void main(String[] args){
    int num1 = 25;
    int num2 = 15;
    /* 3. create an object of Main */
    Main obj = new Main();
    /* 4. calling method with no parameter */
    obj.display1();
    /* 5. calling method with the single parameter */
    obj.display2(24);
    Main object = new Main();
    /* 6. called the method by passing two arguments */
   int result = object.addNumbers(num1, num2);
    System.out.println("Sum is: " + result);
  }
}
```

## Practice
1. Write a Java method to compute the average of three numbers.
the numbers is (25, 45, 65)
