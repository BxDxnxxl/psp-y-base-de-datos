package caballos;

import java.util.Observable;

public class Caballo extends Observable implements Runnable {
    private String nombre;

    public Caballo(String nombre) {
        this.nombre = nombre;
    }




    public static int generarNumeroAleatorio(int minimo, int maximo){
        int num = (int) Math.floor(Math.random() * (maximo-minimo + 1) + (minimo));
        return num;
    }




    @Override
    public void run() {
        int porcentaje = 0;
        int random;
            try {
                while(porcentaje<100){
                random = generarNumeroAleatorio(1, 10);
                System.out.println("el caballo de nombre "+ nombre + "aumenta el porcentaje en un "+ random + "%");
                porcentaje+=random;
                this.setChanged();
                this.notifyObservers(porcentaje);
                this.clearChanged();
                Thread.sleep(1000);
            }} catch (Exception e) {
                // TODO: handle exception
            }
    }
}

