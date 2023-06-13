package sincronizarhilos;

public class Main {
    public static void main(String[] args) {
        try {
            boolean sincronizado  =true; 
            Counter c1 = new Counter(sincronizado);
            HiloContador h1 = new HiloContador(1, 5, c1);
            HiloContador h2 = new HiloContador(2, 10, c1);
            h1.start();
            h2.start();
            h1.join();
            h2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("fin de programa");

    }
}
