import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        double numero;

        int totalNumeroPositivo = 0;

        for (int i = 0; i < 6; i++) {
            numero = leitor.nextDouble();
            if (numero > 0) {
                totalNumeroPositivo += 1;
            }
        }
        System.out.println(totalNumeroPositivo + " números positivos");
    }
}
