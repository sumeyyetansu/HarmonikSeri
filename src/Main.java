import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir N sayısı girniz : ");
        double N = scanner.nextDouble();
        double result = 0;

        for (double i = 1 ; i <= N ; i++){
            result += (1/i );

        }
        System.out.println( result);
    }
}