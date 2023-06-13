package videojoin;

public class Contdor implements Runnable{

    private String nombre;
    private int contador;
    private int limite;

    public Contdor(String nombre, int limite) {
        this.contador=0;
        this.nombre = nombre;
        this.limite = limite;
    }

    @Override
    public void run() {
        while (contador<limite) {
            System.out.println("el hilo "+ nombre+ "esta ejecutandose" + "por " + contador + "vez");
            contador++;
        }
        System.out.println("el hilo "+ nombre+ "ha terminado");
    }

    
    
}
