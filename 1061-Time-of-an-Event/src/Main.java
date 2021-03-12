import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner tempo = new Scanner(System.in);

        System.out.print("Dia ");
        int dia1 = tempo.nextInt();
        int hora1 = tempo.nextInt();
        int minuto1 = tempo.nextInt();
        int segundo1 = tempo.nextInt();

        System.out.print("Dia ");
        int dia2 = tempo.nextInt();
        int hora2 = tempo.nextInt();
        int minuto2 = tempo.nextInt();
        int segundo2 = tempo.nextInt();

        int hora = (hora1 + hora2 + ((minuto1 + minuto2) * 60) + ((segundo1 + segundo2) * 3600)) + (dia1 - dia2);

        System.out.println((dia2 - dia1) - (int) 24 / (hora % 24) + " dia (s)");
        System.out.println(hora % 24 + " hora (s)");
        System.out.println(Math.abs(minuto1 - minuto2) + " minuto (s)");
        System.out.println(Math.abs(segundo1 - segundo2) + " segundo (s)");
    }
}
