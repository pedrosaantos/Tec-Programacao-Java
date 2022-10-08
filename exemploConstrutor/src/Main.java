public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario();
        System.out.println(usuario1);
        Usuario usuario2 = new Usuario("admin", "123");
        System.out.println(usuario2);

        System.out.println(23.9);

        Usuario usuario3 = new Usuario("root", "123");
        System.out.println(usuario3);
    }
}