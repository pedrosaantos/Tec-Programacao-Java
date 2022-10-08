public class Usuario {

    private String nome;
    private String tipo;
    private String login;
    private String senha;

    //método construtor personalizado

    public Usuario(){
        tipo = "comum";
    }

    public Usuario(String login, String senha){

        if (login.equals("admin") && senha.equals("123")){

            this.nome = "administrador";
            this.login = login;
            this.senha = senha;
            this.tipo = "cadastrado";

        }else{

            System.out.println("Sem permissão de acesso");
            System.exit(0); //força finalizar o processo

        }
    }

    public String toString(){

        return "Nome: " + nome + "\n" +
               "login: " + login + "\n" +
               "tipo de Usuario: " + tipo + "\n";
    }

}
