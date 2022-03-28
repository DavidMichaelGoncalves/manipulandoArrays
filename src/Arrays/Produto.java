package Arrays;

public class Produto {
    String nome;
    double preco;
    int cod;
    int quantidade;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Produto(String nome, double preco, int cod) {
        this.nome = nome;
        this.preco = preco;
        this.cod = cod;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getPreco() {

        return preco;
    }

    public void setPreco(double preco) {

        this.preco = preco;
    }
    public int getQuantidade() {

        return quantidade;
    }
    public void addProduto (int quantidade){
        this.quantidade =quantidade;

    }

}
