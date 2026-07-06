import java.util.Scanner;

public class Factors {

   int c =1;
    public static void main(String[] args) {


        System.out.println(new Factors().c);

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        for (int i = 1; i <= a ; i++) {
            if (a % i == 0){

                System.out.println(i);
            }

        }

    }
}
