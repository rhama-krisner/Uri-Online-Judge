import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int numero1 = ler.nextInt();
        int numero2 = ler.nextInt();
        // aqui vai medir o intervalo entre os dois números.
        int quantidadePosicao = Math.abs(numero1 - numero2);
        //enquanto o "i" for menor que o intervalo, o "i" aumenta mais um e os numeros dos intervalos
        // serão jogados para dentro de um array, somente os números ímpares.
        for (int i = 0; i < quantidadePosicao; i++) {
            if (lista.indexOf(1) == numero2){
                lista.remove(1);
            }
            if (numero1 > numero2) {
                numero2++;
                if (numero2 % 2 != 0) {
                    lista.add(numero2);
                }
            } else if (numero1 < numero2) {
                numero1++;
                if (numero1 % 2 != 0){
                    lista.add(numero1);
                }
                if (lista.get(lista.size()-1) == numero2){
                    lista.remove(lista.get(lista.size()-1));
                }
            }
        }
        //soma o valor dos números ímpares adicionados dentro do array.
        int soma = 0;
        for (Integer integer : lista) {
            soma = soma + integer;
        }

        System.out.println(soma);
    }
}
