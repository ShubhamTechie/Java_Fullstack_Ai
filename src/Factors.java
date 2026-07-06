import java.util.Scanner;

public class Factors {

    int c = 1;

    public static void main(String[] args) {


        System.out.println(new Factors().c);

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                sum += i;
                System.out.println(" factors is " + i);
            }
        }
        System.out.println("sum to a  foactor" + sum);
        System.out.println("sum to a  foactor" + sum);

    }
}
