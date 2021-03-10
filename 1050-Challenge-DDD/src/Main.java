import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ddd = entrada.nextInt();

        switch (ddd) {
            case 61 -> System.out.println("Brasilia");
            case 71 -> System.out.println("Salvador");
            case 11 -> System.out.println("São Paulo");
            case 21 -> System.out.println("Rio de Janeiro");
            case 32 -> System.out.println("Juiz de Fora");
            case 19 -> System.out.println("Campinas");
            case 27 -> System.out.println("Vitória");
            case 31 -> System.out.println("Belo Horizinte");
        }
    }
}
