import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        List<Double> lista = new ArrayList<>();
        int quantidadeListas = ler.nextInt();

        for (int i = 0; i < quantidadeListas; i++) {
            for (int j = 0; j < 3; j++) {
                double numero = ler.nextDouble();
                lista.add(numero);
            }
            double soma = (1 * lista.get(0)) + (2 * lista.get(1)) + (3 * lista.get(2));

            System.out.printf("%.1f%n", (soma / 6.0));
            lista.clear();
        }
    }
}
