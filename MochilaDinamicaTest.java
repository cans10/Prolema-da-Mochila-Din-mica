package Tarefa6;

/**
 *
 * @author Carlinhos
 */
public class MochilaDinamicaTest {

    /**
     * @param args the command line arguments
     */
    private static int n, capacidade;
    private static int[] valor, peso;

    public static void main(String[] args) {

        // obtendo os dados do arquivo .txt
        String end = "src/Tarefa6/mochila01.txt";
        MochilaDinamicaTest.obterDados(end);

        // criando um vetor de Objetos e inicializando com seus valor e peso
        Objeto[] obj = new Objeto[n];
        for (int i = 0; i < n; i++) {
            obj[i] = new Objeto("" + (i + 1), valor[i], peso[i]);
        }

        // Calculando e imprimindo os resutados
        System.out.println("Capacidade da Mochila = " + capacidade);
        MochilaDinamica m = new MochilaDinamica();
        m.calcula(capacidade, obj);
        System.out.println("Valor: " + m.getLucro());
        System.out.println("Produdos escolhidos: " + m.getProdutosUsados());

    }

    public static void obterDados(String end) {
        LerDados ler = new LerDados(end);
        ler.lerArquivo();
        n = ler.getN();
        capacidade = ler.getCapacidade();
        valor = ler.getValor();
        peso = ler.getPeso();
    }

}
