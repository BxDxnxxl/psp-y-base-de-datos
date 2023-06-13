package mediaarray;

public class mediahilo extends Thread {
    private int[] numeros;
    private int inicio;
    private int fin;
    private double resultado;

    public mediahilo(int[] numeros, int inicio, int fin) {
        this.numeros = numeros;
        this.inicio = inicio;
        this.fin = fin;
    }

    public double getResultado() {
        return resultado;
    }

    @Override
    public void run() {
        int suma = 0;

        for (int i = inicio; i <fin; i++) {
            suma += numeros[i];
        }
        this.resultado =(double) suma / (this.fin-this.inicio);
    }

        
    
}
