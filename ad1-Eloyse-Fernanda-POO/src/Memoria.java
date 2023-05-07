class Memoria extends ItemVenda{
    //Aqui existe uma herança da classe abstrata ItemVenda

    //atributo proprio
    private int capacidade;

    //Construtor
    public Memoria(String descricao, int capacidade, double preco){
        super(descricao, preco);
        this.capacidade = capacidade;
    }

    //Getters e setters, caso necessite
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public int getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString() {
        return
                "Capacidade: " + capacidade;
    }
}
