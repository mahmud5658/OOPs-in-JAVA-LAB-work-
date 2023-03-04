public class Bike extends Vehicle {
    Bike(int speed) {
        super(speed);
    }

    public void run() {
        System.out.println("Bike is running with speed " + speed + " KM/H");
    }
}
