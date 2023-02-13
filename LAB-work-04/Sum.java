//creating a class "Sum"
public class Sum {

    //declare return type (int) method with one parameter
    int calculate(int n){

        int sum = 0;

        for(int i=0;i<=n;i++){

            sum +=i;
        }

        return sum;
    }

    public static void main(String[] args) {

        //creating an "Sum" object
        Sum num = new Sum();

        //calling return type (int) method with one parameter
        System.out.println("Sum : "+num.calculate(10));
    }
}
