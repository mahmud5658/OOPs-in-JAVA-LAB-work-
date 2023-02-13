//creating a class "StaticMethod"
public class StaticMethod {

    //declare static void method with no parameter
    static void method1() {

        System.out.println("This is static method");
    }

    //declare non-static void method with no parameter
    void method2() {

        System.out.println("This is non-static method");
    }

    public static void main(String[] args) {

        //creating an "Static_method" object
        StaticMethod s1 = new StaticMethod();

        //calling static method with no parameter
        method1();
        //calling non-static method with no parameter
        s1.method2();
    }
}
