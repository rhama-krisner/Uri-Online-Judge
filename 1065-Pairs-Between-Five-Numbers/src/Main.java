import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
  

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        int numero;

        int totalPar = 0;

        for (int i = 0; i < 5; i++) {
            numero = read.nextInt();
            if (numero%2 == 0){
                totalPar+=1;
                lista.add(numero);
            }
        }
        int tamanho = lista.size();
        int somalista = 0;

        for (int i = 0; i < tamanho; i++) {
            somalista += lista.get(i);
        }
        System.out.println(lista.size() + " valores pares");
    }
    
}
