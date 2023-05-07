class Monitor extends ItemVenda {
    //Aqui existe uma herança da classe abstrata ItemVenda

    //atributo proprio
    private double pixel;

    public Monitor(String descricao, double preco, double p){
        super(descricao, preco);
        this.pixel = p;
    }

    //Getters e setters caso necessite
    public double getPixel() {
        return pixel;
    }

    public void setPixel(double pixel) {
        this.pixel = pixel;
    }

    @Override
    public String toString() {
        return
                "Pixel\n:" + pixel;
    }
}
