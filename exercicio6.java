import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        int n1, n2, soma, subt, mult;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();

        soma = n1 + n2;
        subt = n1 - n2;
        mult = n1 * n2;

        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subt);
        System.out.println("Multiplicação = " + mult);

    }
}
