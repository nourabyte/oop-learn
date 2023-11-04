# Step 01:Concept Of Inheritance
Creating new classes based on **existing ones**. A class that `inherits` from another `class` can reuse the **methods and fields of that class**

## Concept
`Inheritance` is the method to create a **hierarchy** between classes by inheriting **from other classes**.

So if Sedan **extends** Car and Car **extends** Vehicle, then Sedan is also **inherited** from the Vehicle class. The Vehicle becomes the **superclass** of both Car and Sedan.

## Example
```java
/*1. Vehicle class is the superclass*/
public class Vehicle {
    public String manufacturer;
    public String color;
public Vehicle(String manufacturer, String color) {
        this.manufacturer = manufacturer;
        this.color = color;
}
/*3. Sedan subclass inherit all properties and method that veichle have*/
public class Car extends Vehicle {
   public String model;
    public Car(String manufacturer, String color, String model) {
        super(manufacturer, color);
        this.model = model;
    }
/*3. Sedan subclass inherit all properties and method that car have*/
public class Sedan extends Car {
   public int numDoors;
    public Sedan(String manufacturer, String color, String model, int numDoors)
 {
        super(manufacturer, color, model);
        this.numDoors = numDoors;
    }
}
public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        // You can create instances of Sedan, Car, and Vehicle
        // and access their respective methods and properties.
    }}
```
## Practice

