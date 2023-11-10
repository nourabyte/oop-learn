# Step 03: Static
When a member is declared `static` it can be accessed **before any objects of its class** are created, and **without reference to any object.**

## Concept
`Static` means When you **create an object or instance** for a class, each object will have its own **copy** of the members such as variables and methods.
* `Static variable` :
if we declare a variable static, **all objects of the class share the same static variable** It is because like static methods, static variables are also associated with the class, and we don't need to create objects of the class to access the static variables.
```java
   static int max = 10;
```
* `Static method` : can be accessed directly using the class name, without the need for an instance of the class like
   `ClassName.staticMethod()`, and are not associated with any specific instance of a class, they cannot directly access non-static (instance) variables or methods. They can only access other static members (variables or methods) within the same class.

## Example



## Practice
