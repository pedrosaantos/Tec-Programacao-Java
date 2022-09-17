import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarProduto {

    List<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        GerenciarProduto gerenciar = new GerenciarProduto();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do{
            opcao = montarMenu(gerenciar, sc);
        }while (opcao != 9);
    }

    private static int montarMenu(GerenciarProduto gerenciar, Scanner sc) {
        int opcao;
        System.out.println(">>>> Menu Principal <<<<");
        System.out.println("1. Cadastrar Novo Produto");
        System.out.println("2. Registrar Entrada");
        System.out.println("3. Registrar Saida");
        System.out.println("4. Saldo de um produto");
        System.out.println("5. Listar Todos Produtos");
        System.out.println("6. Mostrar Patrimonio");
        System.out.println("9. Sair");
        System.out.println("Escolha sua opcao: ");
        opcao = Integer.parseInt(sc.nextLine());
        switch (opcao){
            case 1:
                gerenciar.execCadastrarNovo(sc);
                break;

            case 2:
                gerenciar.execRegistrarEntrada(sc, gerenciar);
                break;

            case 3:
                gerenciar.execRegistrarSaida(sc, gerenciar);
                break;

            case 4:
                gerenciar.execMostrarSaldo(sc, gerenciar);
                break;

            case 5:
                gerenciar.execListarTodos();
                break;

            case 6:
                gerenciar.execPatrimonioInventariado();
                break;

            case 9:
                System.out.println("Fim do programa");
                break;

            default:
                System.out.println("OPCAO INVALIDA");
        }
        return opcao;
    }

    public void execCadastrarNovo(Scanner sc){
        //Cadastra um novo produto e coloca na lista
        Produto produto = new Produto();
        System.out.println("Digite o codigo do produto");
        produto.setCodigo(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a descricao do produto");
        produto.setDescricao(sc.nextLine());
        System.out.println("Digite o valor unitario do produto");
        produto.setValorUnitario(Double.parseDouble(sc.nextLine()));
        //finalmente colocando na lista
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso");

    }

    public void execRegistrarEntrada(Scanner sc, GerenciarProduto gerenciar){

        System.out.println("Digite o codigo do produto");
        int codProcurado = Integer.parseInt(sc.nextLine());
        Produto produto = gerenciar.procurarProduto(codProcurado);

        if(produto!=null){

            //Produto existe logo dou a entrada
            System.out.println("Digite a quantidade de entrada: ");
            int qtdentrada = Integer.parseInt(sc.nextLine());
            boolean ok = produto.registrarEntrada(qtdentrada);

            if(ok){
                System.out.println("Entrada Registrada do Produto");
            }else {
                System.out.println("Quantidade Invalida. Corrija");
            }
        }
    }
    public void execRegistrarSaida(Scanner sc, GerenciarProduto gerenciar){

        System.out.println("Digite o codigo do produto a dar saida");
        int codProcurado = Integer.parseInt(sc.nextLine());
        Produto produto = gerenciar.procurarProduto(codProcurado);

        if(produto!=null){

            //pedir a quantidade de saida do produto
            System.out.println("Digite a quantidade de saida deste produto");
            int qtdSaida = Integer.parseInt(sc.nextLine());
            boolean ok = produto.registrarSaida(qtdSaida);

            if(ok){
                System.out.println("Saida do produto registrada com sucesso");
            }else{
                System.out.println("Quantidade indisponivel em estoque");
            }
        }

    }
    public void execMostrarSaldo(Scanner sc, GerenciarProduto gerenciar){

        System.out.println("Digite o codigo do produto");
        int codProcurado = Integer.parseInt(sc.nextLine());
        Produto produto = gerenciar.procurarProduto(codProcurado);

        if (produto!=null){
            produto.exibirDados();
        }else{
            System.out.println("Produto nao cadastrado.");
        }
    }
    public void execListarTodos(){
        //Apresentar na tela todos os produtos cadastrados
        for(Produto item : produtos){
            item.exibirDados();
        }
    }
    public void execPatrimonioInventariado(){
        double total = 0;
        for(Produto item : produtos){
            total += item.getValorUnitario() + item.getQuantidade();
        }
        System.out.println("Valor total do inventario: " + total);
    }

    public Produto procurarProduto(int codProduto){
        for(Produto item : produtos){
            if(codProduto == item.getCodigo()){
                return item;
            }
        }
        return null;
    }

}