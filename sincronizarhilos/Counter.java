package sincronizarhilos;

public class Counter {
    private boolean sincronizado;

    public Counter(boolean sincronizado) {
        this.sincronizado = sincronizado;
    }

    public boolean isSincronizado() {
        return sincronizado;
    }

    public void setSincronizado(boolean sincronizado) {
        this.sincronizado = sincronizado;
    }

    public synchronized void contarNumerosSincronizados(int id, int n){
        System.out.println("empieza el hilo "+ id);
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        System.out.println("hilo "+ id + "finalizado");
    }

    public  void contarNumerosNoSincronizados(int id, int n){
        System.out.println("empieza el hilo "+ id);
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        System.out.println("hilo "+ id + "finalizado");
    }
}
