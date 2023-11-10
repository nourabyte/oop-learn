# Step 03: Static
When a member is declared `static` it can be accessed **before any objects of its class** are created, and **without reference to any object.**

## Concept
`Static` means When you **create an object or instance** for a class, each object will have its own **copy** of the members such as variables and methods.
* `Static Variables` :
if we declare a variable static, **all objects of the class share the same static variable** It is because like static methods, static variables are also associated with the class, and we don't need to create objects of the class to access the static variables.

```java
class Test {
   /* 1. static variable */
   static int max = 10;
   /* 2. non-static variable */
   int min = 5;
}
public class Main {
   public static void main(String[] args) {
       Test obj = new Test();
       /* 3. access the non-static variable */
       System.out.println("min + 1 = " + (obj.min + 1));
  
       /* 4. access the static variable */
       System.out.println("max + 1 = " + (Test.max + 1));
   }}
```

## Example



## Practice
