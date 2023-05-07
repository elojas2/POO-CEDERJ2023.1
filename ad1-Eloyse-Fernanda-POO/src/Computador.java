import java.util.Arrays;

class Computador{

    //Encapsulamento (encondendo os atributos com o private para que outras classes não tenham acesso direto)
    private double preco;
    private String descricao;
    private final int MAX = 100;
    private int pos;

    //Vetores encapsulados.
    private Teclado[] tecla = new Teclado[MAX];
    private Monitor[] mon = new Monitor[MAX];
    private Gabinete[] gab = new Gabinete[MAX];


    public Computador(String descricao) {
        this.descricao = descricao;
        this.pos = 0;
    }


    //Aqui temos o polimorfismo de sobrecarga, as funções têm o mesmo nome, mas servem pra componentes diferentes
    public void inclui(Monitor m){
        if(pos != MAX){
            mon[pos] = m;
            pos++;
        }
        preco += m.getPreco();
    }

    public void inclui(Teclado t){
        if(pos != MAX){
            tecla[pos] = t;
            pos++;
        }
        preco += t.getPreco();
    }


    public void inclui(Gabinete g){
        if(pos != MAX){
            gab[pos] = g;
            pos++;
        }
        preco += g.getPreco();
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }



    @Override
    public String toString() {
        return "Computador{" +
                "preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", tecla=" + Arrays.toString(tecla) +
                ", mon=" + Arrays.toString(mon) +
                ", gab=" + Arrays.toString(gab) +
                '}'+"\n\n";
    }
}
