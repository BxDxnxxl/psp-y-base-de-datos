package videojoin;

public class Main {
    public static void main(String[] args) {
        Contdor c1 = new Contdor("dani", 10);
        Contdor c2 = new Contdor("alberto", 20);
        Contdor c3 = new Contdor("mama", 15);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
           
        }
    }
}
