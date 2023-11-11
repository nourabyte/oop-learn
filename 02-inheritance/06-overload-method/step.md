# Step 06: Overload Method
Multiple methods with the same name but different parameters to coexist within a class.

## Concept
`Overloaded methods` must have **different method signature**s, which include the method name and the parameter list.

The return type of the method doesn't play a role in distinguishing overloaded methods, only the method name and parameter list matter.

## Example
```java
public class Sum { 
	// Overloaded sum(). This sum takes two int parameters 
	public int sum(int x, int y) { return (x + y); } 

	// Overloaded sum(). This sum takes three int parameters 
	public int sum(int x, int y, int z) 
	{ 
		return (x + y + z); 
	} 

	// Overloaded sum(). This sum takes two double 
	// parameters 
	public double sum(double x, double y) 
	{ 
		return (x + y); 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
		Sum s = new Sum(); 
		System.out.println(s.sum(10, 20)); 
		System.out.println(s.sum(10, 20, 30)); 
		System.out.println(s.sum(10.5, 20.5)); 
	} 
}
```

## Practice

