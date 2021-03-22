import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        List<Integer> listaIn = new ArrayList<>();
        List<Integer> listaOut = new ArrayList<>();
        int quatidadeDeEntrada = ler.nextInt();
        int entrada;
        for (int i = 0; i < quatidadeDeEntrada; i++) {
            entrada = ler.nextInt();
           if (entrada < 10 || entrada > 20){
               listaOut.add(entrada);
           } else {
               listaIn.add(entrada);
           }
        }
        System.out.println(listaIn.size() + " in");
        System.out.println(listaOut.size() + " out");

    }
}
