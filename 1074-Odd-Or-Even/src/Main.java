import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int numero = ler.nextInt();
        for (int i = 0; i < numero; i++) {
            int entradaNumero = ler.nextInt();
            if (entradaNumero % 2 == 0 && entradaNumero > 0) {
                System.out.println("EVEN POSITIVE");
            } else if (entradaNumero % 2 == 0 && entradaNumero < 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (entradaNumero % 2 != 0 && entradaNumero > 0) {
                System.out.println("ODD POSITIVE");
            } else if (entradaNumero % 2 != 0 && entradaNumero < 0) {
                System.out.println("ODD NEGATIVE");
            } else if (entradaNumero == 0) {
                System.out.println("NULL");
            }
        }

    }
}
