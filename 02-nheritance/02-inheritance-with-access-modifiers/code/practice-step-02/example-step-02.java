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
