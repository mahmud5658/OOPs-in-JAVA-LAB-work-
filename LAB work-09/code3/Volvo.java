package code3;

public class Volvo extends Car {
    double price;
    String productionYear;
    String registrationNumber;
    Engine eg;
    DashBoard db;

    public Volvo(double price,String productionYear,String registrationNumber,Engine eg,DashBoard db){
        this.price = price;
        this.productionYear = productionYear;
        this.registrationNumber = registrationNumber;
        this.eg = eg;
        this.db = db;
    }

    public Volvo(int price, String productionYear) {
        super();
    }

    public void changeFuel(){
        System.out.println("Changing Fuel");
    }
    public void checkBattery(){
        System.out.println("Checking Battery");
    }

}
