import java.util.Scanner;

public class Cheslo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();

        int a = 1;
        int b = 1;
        int c;

    for(int i = 3; i <= g; i++) {
        c = a + b;
        System.out.print(c + " ");
        a = b;
        b = c;

        }

    }
}

