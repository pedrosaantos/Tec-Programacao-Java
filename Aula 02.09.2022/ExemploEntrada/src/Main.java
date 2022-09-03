import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, soma;
        System.out.println("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        b = sc.nextInt();

        soma = a + b;

        System.out.println("A soma é: " + soma);
    }
}