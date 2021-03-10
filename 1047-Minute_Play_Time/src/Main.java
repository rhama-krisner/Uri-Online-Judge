import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
      Scanner hora = new Scanner(System.in);
      int h1 = hora.nextInt();
      int m1 = hora.nextInt();
      int h2 = hora.nextInt();
      int m2 = hora.nextInt();

      int hora1 = (h1*60)+m1;
      int hora2 = (h2*60)+m2;

      System.out.printf("%d horas e %d minutos", Math.abs((hora1-hora2)/60), Math.abs((hora1-hora2)%60));

    }
}


