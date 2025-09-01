import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        double a, b, d;
        double A1, A2, AT;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da base do retângulo superior: ");
        a = sc.nextDouble();

        System.out.print("Digite o valor da base do retângulo inferior: ");
        b = sc.nextDouble();

        System.out.print("Digite o valor da altura: ");
        d = sc.nextDouble();

        A1 = a * d;
        A2 = b * d;
        AT = A1 + A2;

        System.out.println("Área do retângulo superior = " + A1);
        
        System.out.println("Área do retângulo inferior = " + A2);

        System.out.println("Área total = " + AT);




    }
}
