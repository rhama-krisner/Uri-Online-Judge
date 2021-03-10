import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int valor = 6;
        int[] minhaLista = new int[valor];
        
        int i = 0;
        while (i < 6){
            minhaLista[i] = leitor.nextInt();
            i++;

            if (minhaLista[i] <= 0) {
                valor--;
            }
        }
        System.out.println(Arrays.toString(minhaLista));
        System.out.println(minhaLista.length);






    }
}
