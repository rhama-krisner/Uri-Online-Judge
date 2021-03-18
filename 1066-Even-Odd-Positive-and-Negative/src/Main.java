import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        List<Integer> listaPar = new ArrayList<>();
        List<Integer> listaImpar = new ArrayList<>();
        List<Integer> listaPositivo = new ArrayList<>();
        List<Integer> listaNegativo = new ArrayList<>();

        int numero;
        int totalPositivo = 0;
        int totalNegativo = 0;
        int totalImpar = 0;
        int totalPar = 0;

        for (int i = 0; i < 5; i++) {
            numero = ler.nextInt();
            if (numero > 0) {
                totalPositivo += 1;
                listaPositivo.add(numero);
            } else if (numero < 0) {
                totalNegativo += 1;
                listaNegativo.add(numero);
            } else if (numero % 2 == 0) {
                totalPar += 1;
                listaPar.add(numero);
            } else if (numero % 2 != 0) {
                totalImpar += 1;
                listaImpar.add(numero);
            }
        }
        System.out.println(listaPar.size() + " valor(es) par(es)");
        System.out.println(listaImpar.size() + " valo(res) impar (es)");
        System.out.println(listaPositivo.size() + " valo(res) positivo(s)");
        System.out.println(listaNegativo.size() + " valor(es) negativo(os)");
    }
}
