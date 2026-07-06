import java.util.Scanner;

public class Factors {

//    int c = 1;

    public static void main(String[] args) {


//        System.out.println(new Factors().c);

//        Scanner s = new Scanner(System.in);
//
//        int a = s.nextInt();
        {

            for (int a = 1; a < 1000; a++) {
                int sum = 0;


//        for (int i = 1; i <= a; i++) {
                for (int i = 1; i < a; i++) {
                    if (a % i == 0) {
                        sum += i;
//                        System.out.println(" factors is " + i);


                    }

                }
//                System.out.println("sum to a  foactor" + sum);

                if (sum == a) {


                    System.out.println(a);
//            System.out.println("perfect number");
//        }else {
//            System.out.println("nit a perfect number");
                }
            }
        }

    }
}