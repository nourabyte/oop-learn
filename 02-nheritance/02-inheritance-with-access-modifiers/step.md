# Step 02: Inheritance with access Modifiers
Determining the **visibility and accessibility** of members (fields, methods, and nested classes) in classes and their subclasses during `inheritance`.
## Concept
1. `Public`: is used when the user wants all **child classes** to have **access** to the **parent class** from **anywhere**.

2. `Protected`: a **superclass** are `inherited` by its subclasses and remain protected in the subclass. They are accessible within the same package and by subclasses, even if they are in a different package.

3. `Default` : **(package-private)** members of a **superclass** are `inherited` by its **subclasses**. within the **same package** and **not** visible to classes outside the package.

4. `Private` : a **superclas**s are **not inherited** by its **subclasses** and are **not accessible in the subclass**.

## Example
```java
//Private
class A {
  int i;
  private int j; //private to A.
  void setA (int x,int y){
i = x;
j = y;
  }
}
class B extends A{
double total;
void sum(){
total = i+j;

// ERROR, j not accessible here
  }
}
```
## Practice
1. is the below code written correctly?
```java
package pack1;
 class A
{
   
    } 
package pack2;
class B extends A
{
     
    }
```
