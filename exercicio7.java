import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        double num, triplo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = sc.nextDouble();

        triplo = num * 3;

        System.out.println("O triplo de " + num + " é " + triplo);
    }
}
