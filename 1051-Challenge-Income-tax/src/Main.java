import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        double valor = entrada.nextDouble();
        double pagamentoImposto;

        if (valor <= 2000.0) {
            System.out.println("Isento");

        } else if (valor > 2000.0 && valor <= 3000.0) {   //8% de imposto
            pagamentoImposto = Math.abs(((valor - 2000) % 100) * 0.08);
            System.out.println("R$ " + pagamentoImposto);

        } else if (valor > 3000.0 && valor < 4500.0) { //18% de imposto
            double imposto18 = (((valor - 2000.0)) - (valor - 3000.0)) * 0.08;
            pagamentoImposto = Math.abs((valor - 2000.0) % 1000) * 0.18;
            System.out.println("R$ " + (imposto18 + pagamentoImposto));

        } else if (valor >= 4500.0) { //28% de imposto
            double imposto28 = Math.abs(valor - 4500.0) * 0.28;
            double impostoTotal = (1000.0 * 0.08) + (1500.0 * 0.18);
            System.out.println("R$ " + (impostoTotal + imposto28));
        }

    }
}
