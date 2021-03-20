import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int numero = ler.nextInt();
        for (int i = 0; i < 12; i++) {
            numero++;
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
        }
    }
}