import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        int quantidade;
        String nome, cargo;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = sc.next();

        System.out.print("Escreva seu cargo: ");
        cargo = sc.next();

        System.out.print("Escreva a quantidade de dependentes: ");
        quantidade = sc.nextInt();
        
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Quantidade de dependentes: " + quantidade);

    }
}
