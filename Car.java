public class Car {
    int speed;
    String color;
    
    public Car(String color) {
        speed = 0;
        this.color = color;
    }
    
    void accelerate(int pressure) {
        if (speed + pressure >= 0) {
        speed += pressure;
        }
    }
    
    void colorChange(String color) {
        this.color = color;
    }
    
    void brake(int pressure) {
        if (speed - pressure >= 0) {
            speed -= pressure;
        } else {
            speed = 0;
        }
    }
    
    public static void main(String[] args) {
        Car car = new Car("red");
        car.accelerate(25);
        System.out.println("Speed: " + car.speed);
    }
}