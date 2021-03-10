import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args)  throws IOException {
        Scanner numero = new Scanner(System.in);
        double A = numero.nextDouble();
        double B = numero.nextDouble();
        double C = numero.nextDouble();

        if (A + B <= C || B + C <= A || C + A <= B){
            double trapezio = ((A+B)*C)/2;
            System.out.printf("Area = %.1f",trapezio);
        } else {
            double perimetro = A+B+C;
            System.out.printf("Perimetro = %.1f",perimetro);
        }

    }
}
