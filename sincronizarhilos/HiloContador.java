package sincronizarhilos;

public class HiloContador extends Thread {
    private int id;
    private int n;
    private Counter counter;
    public HiloContador(int id, int n, Counter counter) {
        this.id = id;
        this.n = n;
        this.counter = counter;
    }
    @Override
    public void run() {
        if(this.counter.isSincronizado()){
            this.counter.contarNumerosSincronizados(id, n);
        }else{
            this.counter.contarNumerosNoSincronizados(id, n);
        }
    }

    
}
