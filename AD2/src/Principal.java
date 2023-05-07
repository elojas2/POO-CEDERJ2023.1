import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String [] args) throws IOException{

        BufferedReader in = new BufferedReader(new FileReader("src/teste"));
        ListaEncadeada listaTimes = new ListaEncadeada();
        String linha;

        try{
            //leitura por linha do arquivo
            while((linha = in.readLine()) != null){
                System.out.println(linha);
                String vs[] = linha.split("/");

                listaTimes.insere(vs[1]);
                listaTimes.insere(vs[2]);

                listaTimes.insere(vs[1], Integer.parseInt(vs[3]), Integer.parseInt(vs[4]));
                listaTimes.insere(vs[2], Integer.parseInt(vs[4]), Integer.parseInt(vs[3]));

            }

            //Ordenação e leitura dos K números
            ordenaLista(listaTimes);
            System.out.println("Informe o número: ");
            int k;
            Scanner ler = new Scanner(System.in);
            k = ler.nextInt();
            System.out.println(imprime(listaTimes, k));


        }catch(Exception e){
            System.out.println("Deu algum erro na leitura!");
        }finally{
            //fecha arquivo
            in.close();
        }

    }

    static void ordenaLista(ListaEncadeada l){

        if(l.primeiroNo != null){
            for(No aux = l.primeiroNo; aux != null; aux = aux.prox){
                No maior = aux;

                for(No q = aux.prox; q != null; q = q.prox){
                    if((q.qtd_vitoria > maior.qtd_vitoria) || ((q.qtd_vitoria == maior.qtd_vitoria) && (q.pontos>maior.pontos))){
                        maior = q;
                    }
                }
                if(maior!=aux) trocaPosicao(maior, aux);
            }
        }
    }


    //Troca de posição via Bubble Sort dos atributos do time
    static void trocaPosicao(No maior, No prox){

        //Nome
        String nome_aux = maior.nome_time;
        maior.nome_time = prox.nome_time;
        prox.nome_time = nome_aux;
        //Pontuação
        int temporario = maior.pontos;
        maior.pontos = prox.pontos;
        prox.pontos = temporario;
        //Vitórias
        temporario = maior.qtd_vitoria;
        maior.qtd_vitoria = prox.qtd_vitoria;
        prox.qtd_vitoria = temporario;
        //Gols
        temporario = maior.pts_favor;
        maior.pts_favor = prox.pts_favor;
        prox.pts_favor = temporario;
        //Gols tomados
        temporario = maior.pts_contra;
        maior.pts_contra = prox.pts_contra;
        prox.pts_contra = temporario;

    }

    //Imprime a lista
    static String imprime(ListaEncadeada l, int k){

        String impri = " ";
        int qtd = 1;

        for(int i = 1; i<=k;i++){
            impri += qtd+ l.primeiroNo.toString() + " \n ";

            //Verificar depois

            if(l.primeiroNo.prox == null && qtd != k){
                return "=============================================Placar=============================================\n\n" +
                        impri+"\nOBS.:Não é possível imprimir os "+ k +" times solicitados, pois há apenas: " +qtd +
                        " times no arquivo."+" São eles:\n";
            }
            l.primeiroNo = l.primeiroNo.prox;
            qtd++;
        }

        return "=============================================Placar=============================================\n" +"\nOs "+k+" Times solicitados: \n"+impri ;
    }



}
