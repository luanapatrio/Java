import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        double dolar, cotacao, total;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cotação atual do dólar em reais: ");
        cotacao = sc.nextDouble();

        System.out.print("Digite um valor em dólar: ");
        dolar = sc.nextDouble();

        total = dolar * cotacao;

        System.out.println("O valor de " + dolar + " dólares em reais é: R$" + total);
    }
}
