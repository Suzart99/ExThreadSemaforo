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
public class Cenario1 implements Runnable {

	
	public Cenario1() {

	}

	@Override
	public void run() {
		System.out.println("não fuinciono");
		Semaforo semaforo = new Semaforo(1);
		List<Semaforo> semaforos = new ArrayList<Semaforo>();
		semaforos.add(semaforo);
		new Simulador(semaforos, 300, 150);
		
	}

	public static void main(String[] args) {
		Cenario1 c1 = new Cenario1();
		Thread t1 = new Thread(c1);
		t1.start();
	}

}
