class Demo {
    static void test() {
        Car car = new Car("red");
        
        System.out.println("Color: " + car.color);
        
        car.accelerate(25);
        
        System.out.println("Speed: " + car.speed);
        
        car.colorChange("green");
        
        System.out.println("Color: " + car.color);
    }
}