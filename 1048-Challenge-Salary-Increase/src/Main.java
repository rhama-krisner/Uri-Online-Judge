import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner valor  = new Scanner(System.in);
        double salario = valor.nextDouble();
        double novoSalario = 0;
        if (salario > 0 && salario <= 400.00){
            novoSalario = salario + (salario*15)/100;
        } else if (salario >= 400.01 && salario <= 800.00){
            novoSalario = salario + (salario*12)/100;
        } else  if (salario >= 800.01 && salario <= 1200.00){
            novoSalario = salario + (salario*10)/100;
        } else if (salario >= 1200.01 && salario <= 2000.00){
            novoSalario = salario + (salario*7)/100;
        } else {
            novoSalario = salario +(salario*4)/100;
        }
        System.out.printf("Novo salario: %.2f %n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f %n", novoSalario -salario);
        System.out.printf("Em percentual: %.0f %% %n", ((novoSalario -salario)/salario)*100);
    }
}
