package mediaarray;

import java.beans.MethodDescriptor;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[1000];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=i;
        }

        mediahilo m1 = new mediahilo(numeros, 0, 250);
        mediahilo m2 = new mediahilo(numeros, 250, 500);
        mediahilo m3 = new mediahilo(numeros, 500, 1000);
        //mediahilo m4 = new mediahilo(numeros, 750, 1000);

        m1.start();
        m2.start();
        m3.start();
       // m4.start();


        try {
            m1.join();
            m2.join();
            m3.join();
          //  m4.join();

            double r1 = m1.getResultado();
            double r2 = m2.getResultado();
            double r3 = m3.getResultado();
           // double r4 = m4.getResultado();

            double media = (r1 + r2 + r3 )/ 3;

            System.out.println("media: "+ media);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
