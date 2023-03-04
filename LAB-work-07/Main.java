
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the speed of vehicle: ");
        Vehicle v = new Vehicle(sc.nextInt());
        v.run();
        System.out.print("Enter the speed of bike: ");
        Bike b = new Bike(sc.nextInt());
        b.run();
        System.out.print("Enter the speed of Car: ");
        Car c = new Car(sc.nextInt());
        c.run();
    }

}
