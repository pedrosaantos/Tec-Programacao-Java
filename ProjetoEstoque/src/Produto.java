public class Produto {
    private int codigo;
    private String descricao;
    private double valorUnitario;
    private int quantidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean registrarEntrada(int qtdEntrada){
        if(qtdEntrada <= 0){
            return false;
        }else{
            quantidade = quantidade + qtdEntrada;
            return true;
        }
    }

    public boolean registrarSaida(int qtdSaida){
        if(qtdSaida > quantidade){
            return false;
        }else{
            quantidade = quantidade - qtdSaida;
            return true;
        }
    }

    public void exibirDados(){
        System.out.println("Dados do Produto");
        System.out.println("Codigo: " + codigo);
        System.out.println("Descricao: " + descricao);
        System.out.println("Qtd Disponivel: "+ quantidade);
        System.out.println("Valor Unitario: " + valorUnitario);
    }

}