package br.exercicio.semaforo;

import br.exercicio.semaforo.base.Semaforo;
import br.exercicio.semaforo.base.Simulador;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * Apenas um semaforo
 *
 */
public class Cenario1 {


    Semaforo semaforo = new Semaforo(1);


    public Cenario1() {
        List<Semaforo> semaforos = new ArrayList<Semaforo>();
        semaforos.add(semaforo);
        Simulador simulador = new Simulador(semaforos,300,150);
        new Thread(semaforo).start();
    }

    public static void main(String[] args) {
        new Cenario1();
    }


}