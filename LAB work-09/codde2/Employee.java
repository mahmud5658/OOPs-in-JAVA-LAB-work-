package code2;

public class Employee {
    String name;
    AddressInfo addressInfo;
    InsuranceInfo insuranceInfo;
    public Employee(String name,AddressInfo addressInfo,InsuranceInfo insuranceInfo){
        this.name = name;
        this.addressInfo = addressInfo;
        this.insuranceInfo = insuranceInfo;
    }
    public void display(){
        System.out.println("Name of Employee :"+name);
        System.out.println("Address of Employee: \n"+"Street : "+addressInfo.street+","+" City: "+addressInfo.city+","+" PostalCode: "+ addressInfo.postalCode+",");
        System.out.println("Insurance information of employee: \n"+"PolicyName: "+ insuranceInfo.policyName+","+" PolicyId: "+ insuranceInfo.policyId+",");
    }
}
