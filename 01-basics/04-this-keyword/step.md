# Step 04: This Keyword
Keyword tells us about the behaviour and state of an object or instance related to the class.

## Concept
`This` refers to the current **instance/object** in a **method or constructor**. It’s most common use is to discard the confusion between class **attributes and parameters with the same name**.

1. **Accessing Other Methods and Fields**:
   * this keyword can be used to invoke other methods or access other fields within the same object.
   * It allows you to call other instance methods or access instance variables directly.
 
 ```java    
public class Person {
    private String name;
    public void printName() {
        System.out.println("Name: " + this.getName()); 
    }
    public String getName() {
        return this.name;
    }
} 
```
## Example





## Practice

