# Step 04: What Is Access Modifiers
`Access modifier` is the accessibility or visibility of **class, method, variable** within a program.
## Concept
access modifiers are keywords, you can control the visibility and accessibility of your code, promoting modularization, information hiding, and secure interactions between different parts of your program.
1. Public is accessible from anywhere in the program. 
2. Private is accessible within the same class only. 
3. Protected is accessible within the same class, subclasses, and same package. 
4. Default is accessible within the same package only.
    * When no access modifier is specified (i.e., no public, private, or protected), the default access modifier is applied.
## Example
* Public
public class Person {
    public String name;
    public void greet() {
        System.out.println("Hello, I'm " + name + "!");  }}

* Private
public class BankAccount {
    private double balance;
    private void deductFees() {
      }}

* Protected
public class Animal {
    protected String name;
    protected void sleep() {
        System.out.println("The animal is sleeping.");  }}

* Default
/* Default */
class Person {
    String name;
    void greet() {
        System.out.println("Hello, I'm " + name + "!");  }}

## Practice
1. How many public class a .java file can have?
