import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int numero;
        int totalPositivo = 0;
        int totalNegativo = 0;
        int totalImpar = 0;
        int totalPar = 0;

        for (int i = 0; i < 5; i++) {
            numero = ler.nextInt();
            if (numero > 0) {
                totalPositivo += 1;
            } else if (numero < 0) {
                totalNegativo += 1;
            }
            if (numero % 2 == 0) {
                totalPar += 1;
            } else if (numero % 2 != 0) {
                totalImpar += 1;
            }
        }
        System.out.println(totalPar + " valor(es) par(es)");
        System.out.println(totalImpar + " valo(res) impar (es)");
        System.out.println(totalPositivo + " valo(res) positivo(s)");
        System.out.println(totalNegativo + " valor(es) negativo(os)");
    }
}
