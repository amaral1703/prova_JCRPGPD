public class Leitor {
    private String nome;
    private int num_leituras = 0;
    private int num_acesso = 0;
    private String state = "Em espera para ler";
    private final static int MAX_ACESSO = 100;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getNum_acesso() {
        return num_acesso;
    }

    public void setNum_acesso(int num_acesso) {
        this.num_acesso = num_acesso;
    }

    public int getNum_leituras() {
        return num_leituras;
    }

    public void setNum_leituras(int num_leituras) {
        this.num_leituras = num_leituras;
    }

// não precisa ter syncronized pois varios leitores podem ler
    public void ler() throws InterruptedException {
        while (condition) {
            wait();
        }
        this.state = "lendo";
        this.lendo();

    }


    public void lendo(){ 
        try {
        Thread.sleep(1);
    } catch (InterruptedException e) {
    
    }}

    @Override
    public void run() {
        try {
            while (this.num_acesso < MAX_ACESSO) {
                // this.ler();
            }

            this.state = "PRONTO";

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("!!!!!!!!!!!!!!!!!");
        }}

}


