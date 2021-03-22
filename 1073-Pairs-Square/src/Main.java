import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int numeroImput = ler.nextInt();
        for (int i = 0; i <= numeroImput; i++) {
            int j = i+1;
            if (j%2 == 0){
                System.out.println(j + "^2 = " + (int)Math.pow(j,2));
            }
        }
    }
}
