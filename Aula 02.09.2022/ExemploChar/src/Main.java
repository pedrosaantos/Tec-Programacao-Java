import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        char letra;
        System.out.println("Digite um letra: ");
        letra = (char) System.in.read();
        System.out.println("Letra digitada: " + letra);
    }
}