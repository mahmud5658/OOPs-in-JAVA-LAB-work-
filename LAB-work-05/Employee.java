//create Employee class
public class Employee{
  //instance variable
    int empId;
    String name;
  //constructor create to initialize the instance variable
    Employee(int empId,String name){
        this.empId=empId;
        this.name=name;
    }
  // create a method to display this information
    void display(){
        System.out.println(empId);
        System.out.println(name);
    }
}
//create a method named Main which contain main method
class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(5658, "Abdullah");
        e1.display();
    }
}

