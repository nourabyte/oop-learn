# Step 07: Final Keyword
Is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit 
or override).

## Concept
Final keyword is used to declare entities (variables, methods, and classes) that cannot be modified or extended, depending on the context in which it is applied.

1. Final Variables:
     * When final is used to declare a variable, it means the variable's value cannot be changed once assigned.
     * must be initialized at the time of declaration or within the constructor if it's an instance variable. Example:
        ```java
       
       final int MAX_SIZE = 10;
        ```

2. Final Methods:
     * When final is used to declare a method, it means the method **cannot be overridden by subclasses**.
     * `Subclasse` are **not allowed** to provide a different implementation for a final method.
3. final Classes:
     * When final is used to declare a class, it means the class cannot be subclassed.
     * No other class can inherit from a final class.

4. final Parameters:
     * When final is used to declare a method parameter, it means the parameter's value cannot be changed within the method.
     * It is a way to indicate that the value passed should not be modified.
       
 By using the final keyword wisely, you can make your code more robust, secure, and maintainable.
       
## Example

## Practice

