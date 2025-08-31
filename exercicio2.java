import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        int n1, n2, soma;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        n1 = sc.nextInt();

        System.out.print("Digite outro número inteiro: ");
        n2 = sc.nextInt();

        soma = n1 + n2;

        System.out.println("A soma é: " + soma);


    }
}
