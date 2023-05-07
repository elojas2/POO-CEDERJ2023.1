public abstract class ItemVenda {

    //Essa será a classe abstrata e também a classe pai da maioria das outras classes

    private int codigo;
    private static int proxCodigo = 1;
    private double preco;
    private String descricao;



    //Construtor da classe abstrata
    public ItemVenda(String descricao, double preco ) {
        this.preco = preco;
        this.descricao = descricao;
        this.codigo = proxCodigo++;
    }

    //Getters e setters
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
                "preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", codigo=" + codigo +
                '}'+"\n\n";
    }
}
