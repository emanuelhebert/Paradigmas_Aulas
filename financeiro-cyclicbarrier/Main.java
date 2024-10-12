import model.AgregadorFinanceiro;
import model.ProcessadorFinanceiro;

import java.io.File;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;

public class Main {

    public static void main(String[] args) {
        // Definir os arquivos CSV com o caminho absoluto ou relativo
        String[] nomesArquivos = {
                "System.getProperty("user.dir")\\src\\receitas.csv",
                "System.getProperty("user.dir")\\src\\despesas.csv", 
                "System.getProperty("user.dir")\\src\\provisao.csv" 
        };

        for (String nomeArquivo : nomesArquivos) {
            File arquivo = new File(nomeArquivo);
            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado: " + nomeArquivo);
                return; 
            }
        }

        // Define a quantidade de threads
        int numThreads = 3;
        CyclicBarrier barreira = new CyclicBarrier(numThreads + 1); 

        
        AgregadorFinanceiro agregadorReceita = new AgregadorFinanceiro();
        AgregadorFinanceiro agregadorDespesa = new AgregadorFinanceiro();
        AgregadorFinanceiro agregadorProvisao = new AgregadorFinanceiro();

        new Thread(new ProcessadorFinanceiro(nomesArquivos[0], agregadorReceita, barreira)).start();
        new Thread(new ProcessadorFinanceiro(nomesArquivos[1], agregadorDespesa, barreira)).start();
        new Thread(new ProcessadorFinanceiro(nomesArquivos[2], agregadorProvisao, barreira)).start();

        try {
            barreira.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

        System.out.println("Receitas:");
        agregadorReceita.getRegistrosAgregados().forEach((data, total) ->
                System.out.println(data + "," + total));

        System.out.println("Total das receitas: " + agregadorReceita.getTotal());

        System.out.println("\nDespesas:");
        agregadorDespesa.getRegistrosAgregados().forEach((data, total) ->
                System.out.println(data + "," + total));

        System.out.println("Total das despesas: " + agregadorDespesa.getTotal());

        System.out.println("\nProvisões:");
        agregadorProvisao.getRegistrosAgregados().forEach((data, total) ->
                System.out.println(data + "," + total));

        System.out.println("Total das provisões: " + agregadorProvisao.getTotal());
    }
}
