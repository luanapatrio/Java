import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        int hora, minuto, total;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora: ");
        hora = sc.nextInt();

        System.out.print("Digite os minutos: ");
        minuto = sc.nextInt();

        total = hora * 60 * minuto;

        System.out.println("Se passaram " + total + " minutos desde o início do dia");
    }
}
