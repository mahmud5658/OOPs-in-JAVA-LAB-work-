package code3;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(54.7);
        DashBoard dashBoard = new DashBoard(7.0);
        Volvo v = new Volvo(800,"2023","HKLSJS3",engine,dashBoard);
        v.drive();
        v.stop();
        v.changeFuel();
        v.checkBattery();
        v.model ="SUV. XC40";
        v.company="Volvo";
    }
}
