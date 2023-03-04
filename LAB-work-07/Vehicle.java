public class Vehicle {
    int speed;
    Vehicle(int speed) {
        this.speed = speed;
    }
    void run() {
        System.out.println("vehicle is running: " + speed + " KM/H");
    }
}
