public class Escritor{
    private String nome;
    
    
    
    
    
    
    
    private int num_escritas = 0;
    private int num_acesso = 0;
    private String state = "Em espera para escrever";
    private final static int MAX_ACESSO = 100;
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getNome() {
        return nome;
    }
    public String getState() {
        return state;
    }
    public int getNum_acesso() {
        return num_acesso;
    }



    public void setNum_acesso(int num_acesso) {
        this.num_acesso = num_acesso;
    }



    public int getNum_escritas() {
        return num_escritas;
    }



    public void setNum_escritas(int num_escritas) {
        this.num_escritas = num_escritas;
    }


    // o metodo de escrever sera o uso do syncronized, para termos certeza de que apenas um Escritor esta escrevendo, ela ira primeiramente simular esperar para escrever,
    // e em seguida ira escrever incrementando na variavel
    public synchronized void Escrever() throws InterruptedException {
        while () {
            wait();
        }
        num_escritas ++;
        this.escrito();

        
    }
//  apos o uso do metodo escrever e usar o recurso para a escrita a thread chamara o metodo escrito, que notificará os outros escritores que ela ja foi escrita  
    public escrito(){
        if(){
            notifyAll();
        }
    }




// run é a sobrescrita para rodarmos a thread, nela iremos chamar o metodo escrever, para vermos se a 

    @Override
    public void run() {
        try {
            while (this.num_acesso < MAX_ACESSO) {
                // this.escrever();
            }

            this.state = "PRONTO";

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("!!!!!!!!!!!!!!!!!");
        }}

}