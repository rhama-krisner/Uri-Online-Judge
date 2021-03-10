import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String filo = ler.nextLine();
        String familia = ler.nextLine();
        String ordem = ler.nextLine();

        if (filo.equals("vertebrado") && familia.equals("ave") && ordem.equals("carnivoro")){
            System.out.println("aguia");
        } else if (filo.equals("vertebrado") && familia.equals("ave") && ordem.equals("onivoro")){
            System.out.println("pomba");
        } else if (filo.equals("vertebrado") && familia.equals("mamifero") && ordem.equals("onivoro")){
            System.out.println("homem");
        } else if (filo.equals("vertebrado") && familia.equals("mamifero") && ordem.equals("herbivoro")){
            System.out.println("vaca");
        } else if (filo.equals("invertebrado") && familia.equals("inseto") && ordem.equals("hematofago")){
            System.out.println("pulga");
        } else if (filo.equals("invertebrado") && familia.equals("inseto") && ordem.equals("herbivoro")){
            System.out.println("lagarta");
        } else if (filo.equals("invertebrado") && familia.equals("anelideo") && ordem.equals("hematofago")){
            System.out.println("sanguessuga");
        } else if (filo.equals("invertebrado") && familia.equals("anelideo") && ordem.equals("onivoro")){
            System.out.println("minhoca");
        }

    }
}
