package code2;

public class Main {
    public static void main(String[] args) {
        AddressInfo addressInfo = new AddressInfo("Sector-7","Uttara","Dhaka","1711");
        InsuranceInfo insuranceInfo = new InsuranceInfo("Life Insurance",5658);

        Employee e1 = new Employee("Abdullah Al Mahmud",addressInfo,insuranceInfo);
        e1.display();

        }

    }

