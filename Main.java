import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String ... args) {
        // defininido o tempo de escrita e o tempo de leitura de ambos os tipos (constantes) 
        final int TEMPO_ESCRITA = 500 ;
        final int TEMPO_LEITURA = 450;

        // definindo a quantidade de leitores / escritores
        int num_leitores = 5;
        int num_escritores = 2;


        // adicionando os escritores/ leitores e iniciando cada thread respectiva
        final List<Escritor> escritores = new ArrayList<Escritor>();
        for (int i = 0; i < num_escritores; i++) {
            String name = "leitor " + new Integer(i + 1).toString();
            Escritor escritor = new Escritor();
            escritores.add(escritor(name));
            new Thread(escritor).start();
        }

        
        final List<Leitor> Leitores = new ArrayList<Leitor>();
        for (int i = 0; i < num_leitores; i++) {
            String name = "leitor " + new Integer(i + 1).toString();
            Leitor leitor = new Leitor();
            Leitores.add(leitor(name));
            new Thread(leitor).start();
        }

      

        boolean hasRecurso;
        do{
            hasRecurso = false;
            
            for () {

                hasRecurso |= p.getState() != "PRONTO";
            }
            
            System.out.println("********************************************\n\n");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
        
            }
            
        }

    }
    
    }