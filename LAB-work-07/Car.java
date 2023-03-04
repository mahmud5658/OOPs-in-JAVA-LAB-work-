public class Car extends Vehicle {
    Car(int speed) {
        super(speed);
    }

    public void run() {
        System.out.println("Car is running with speed " + speed + " KM/H");
    }
}
