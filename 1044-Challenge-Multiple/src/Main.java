import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner numero = new Scanner(System.in);
        int A = numero.nextInt();
        int B = numero.nextInt();
        if (A%B == 0 || B%A == 0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

    }
}
