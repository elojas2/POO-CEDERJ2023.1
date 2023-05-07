public class No {

    String nome_time;
    int pontos, qtd_vitoria, pts_favor, pts_contra;
    No prox;

    public No(String nome_time) {
        this.nome_time = nome_time;
        pontos = 0;
        qtd_vitoria = 0;
        pts_contra = 0;
        pts_favor = 0;
        prox = null;
    }

    public String toString() {
        return "-time: " + nome_time +" com "+qtd_vitoria+" vitórias e "+ pontos +" pontos na tabela";
    }

}
