import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        List<Double> lista = new ArrayList<>();

        double numero;

        int totalDePositivos = 0;

        for (int i = 0; i < 6; i++) {
            numero = leitor.nextDouble();
            if (numero > 0) {
                totalDePositivos += 1;
                lista.add(numero);
            }
        }
        double tamanho = lista.size();
        double somaArray = 0;

        for (int i = 0; i < tamanho; i++) {
            somaArray += lista.get(i);
        }

        System.out.println(lista.size() + " valores positivos");
        System.out.println(somaArray / lista.size());
    }
}
