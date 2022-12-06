import java.util.Scanner;

public class Power {
    static int power (int base, int power) {
        if(power == 0) {
            return 1;
        }
        else {
            return base * power(base, power -1);
        }
    }

    public static void main(String[] args) {
        int base;
        int power;

        Scanner input = new Scanner(System.in);

        System.out.print("Base : ");
        base = input.nextInt();

        System.out.print("Power : ");
        power = input.nextInt();

        System.out.println("Result : " + power(base,power));
    }
}
