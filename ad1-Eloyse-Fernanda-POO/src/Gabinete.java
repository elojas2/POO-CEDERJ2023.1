import java.util.Arrays;

class Gabinete{

    //Encapsulamento (encondendo os atributos com o private para que outras classes não tenham acesso direto)
    private double preco;
    private int pos;
    private final int MAX = 100;
    private String descricao;


    //Vetores encapsulados
    private Processador[] cpu = new Processador[MAX];
    private Memoria[] mem = new Memoria[MAX];


    //Construtor
     Gabinete(String d) {
        this.descricao = d;
        pos = 0;

    }


    //Aqui temos o polimorfismo de sobrecarga, as funções têm o mesmo nome, mas servem pra componentes diferentes
    public void inclui(Processador c){
        if(pos != MAX){
            cpu[pos] = c;
            pos++;
        }
        preco += c.getPreco();
    }

    public void inclui(Memoria m){
        if(pos != MAX){
            mem[pos] = m;
            pos++;
        }
        preco += m.getPreco();
    }

    //getters e setters, caso necessite
    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setProcessador(Processador[] processador) {
        this.cpu = processador;
    }

    public void setMemoria(Memoria[] memoria) {
        this.mem = memoria;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }



    @Override
    public String toString() {
        return "Gabinete{" +
                "descricao='" + descricao + '\'' +
                ", cpu=" + Arrays.toString(cpu) +
                ", mem=" + Arrays.toString(mem) +
                ", preco=" + preco +
                '}'+"\n\n";
    }
}
