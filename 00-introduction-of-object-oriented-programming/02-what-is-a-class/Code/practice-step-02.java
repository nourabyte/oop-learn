public class Car {
    public String brand;
    public String color;
    public int year;
    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }
    public void turn(String direction) {
        System.out.println("The car is turning " + direction);
    }
  public void turn(String direction) {
        System.out.println("The car is turning " + direction);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Red", 2022);
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Year: " + myCar.getYear());

        myCar.turn("left");
    }
}
