import java.util.Random;
import java.util.Scanner;

public class generate_password {
    public static void generate(int num, int let, int sym) {
        Random r = new Random();
        String letter = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String number = "0123456789";
        String symbol = "!@#$%^&*()_+-";

        int count = (let + num + sym);
        int let_count = 0;
        int num_count = 0;
        int sym_count = 0;

        for (int i = 0; i < count; i++) {
            int random = r.nextInt(3);

            if (random == 0 && let_count < let) {
                char c = letter.charAt(r.nextInt(letter.length()));
                let_count++;
                System.out.print(c);
            } else if (random == 1 && num_count < num) {
                char c = number.charAt(r.nextInt(number.length()));
                num_count++;
                System.out.print(c);
            } else if (random == 2 && sym_count < sym) {
                char c = symbol.charAt(r.nextInt(symbol.length()));
                sym_count++;
                System.out.print(c);
            } else {
                i--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Password generator");
        System.out.println("How many letters do you want in your password?");
        int let = sc.nextInt();
        System.out.println("How many numbers do you want in your password?");
        int num = sc.nextInt();
        System.out.println("How many symbols do you want in your password?");
        int sym = sc.nextInt();

        generate(num, let, sym);
    }
}
