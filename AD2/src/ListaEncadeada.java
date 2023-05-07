public class ListaEncadeada {

    //Supondo que você tenha uma empresa de software, e que o NBB contrate sua empresa para escrever
    //um programa que informe, automaticamente, quem são os primeiros k times dessa competição. Seu
    //programa deve ler o arquivo de entrada uma ÚNICA vez, e a ordenação desses times é determinada
    //a partir do número de vitórias obtidas, e caso os times tenham o mesmo número de vitórias, o
    //critério de desempate é o número de pontos. Os dados de entrada são as datas, os horários, os times
    //e os placares dos jogos. Se o usuário digitar o nome do arquivo que segue e k = 1, o melhor time
    //do NBB deve ser mostrado. Se k = 2, o melhor e o vice times da competição devem ser apresentados.
    No primeiroNo;

    public ListaEncadeada() {
        primeiroNo = null;
    }

    //Busca no dentro da lista encadeada
    No busca(String nome){
        No p = primeiroNo;
        while((p != null) && nome.compareToIgnoreCase(p.nome_time) != 0){
            p = p.prox;
        }
        return p;
    }

    //Insere o time
    void insere(String nome){
        No novo = new No(nome);
        //primeira insercao
        if(primeiroNo == null) primeiroNo = novo;
        else{
            No aux = primeiroNo;

            while(aux != null){
                if(nome.compareToIgnoreCase(aux.nome_time) == 0) return;
                aux = aux.prox;
            }

            novo.prox = primeiroNo;
            primeiroNo = novo;
        }

    }

    //Insere pontos e gols
    void insere(String nome, int gf, int gc){
        No p = busca(nome);
        if(p != null){
            p.pts_favor  += gf;
            p.pts_contra += gc;

            if(gf > gc){
                p.qtd_vitoria++;
                p.pontos += 3;
            }
            if(gf == gc){
                p.pontos++;
            }
        }
    }


    /*void insere(String nome, int gf, int gc){
        No p = busca(nome);
        adicionaPontuacao(p, gf, gc);
    }

    void adicionaPontuacao(No p, int gf, int gc){
        if(p != null){
            p.pts_favor  += gf;
            p.pts_contra += gc;

            if(gf > gc){
                p.qtd_vitoria++;
                p.pontos += 3;
            }
            if(gf == gc){
                p.pontos++;
            }
        }
    }


    public String toString(){
        String resp = "";
        No p = primeiro;

        while(p!=null){
            resp+= p.toString() + " " + p.pontos + " " + p.qtd_vitoria + " " +p.pts_favor + " "+ p.pts_contra;
            p = p.prox;
        }
        return resp;
    }
*/


}
