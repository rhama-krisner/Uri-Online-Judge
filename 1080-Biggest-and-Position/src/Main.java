import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int numeros = ler.nextInt();
            lista.add(numeros);
        }
        int maior = Collections.max(lista);
        System.out.println(maior);
    }
}
