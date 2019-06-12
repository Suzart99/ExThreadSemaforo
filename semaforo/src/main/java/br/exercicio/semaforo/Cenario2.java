package br.exercicio.semaforo;

import br.exercicio.semaforo.base.Semaforo;
import br.exercicio.semaforo.base.Simulador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Dois Semaforos voce deve sincronizalos como um cruzamento
 *
 */
public class Cenario2 implements Runnable {

	Semaforo semaforo1 = new Semaforo(1);
	Semaforo semaforo2 = new Semaforo(3);
	Thread threadSema1 = new Thread(semaforo1);
	Thread threadSema2 = new Thread(semaforo2);

	public Cenario2() {
		List<Semaforo> semaforos = new ArrayList<Semaforo>();
		semaforos.add(semaforo1);
		semaforos.add(semaforo2);

		Simulador simulador = new Simulador(semaforos, 300, 150);

	}

	public static void main(String[] args) {
		Cenario2 c2 = new Cenario2();
		Thread t1 = new Thread(c2);
		t1.start();
		System.out.println(t1.getName());
	}

	@Override
	public void run() {
		
		System.out.println(threadSema1.getName());
		System.out.println(threadSema2.getName());
		threadSema1.start();
		threadSema2.start();

		if(semaforo1.luz == 2 ){
			System.out.println("entrei");
			semaforo2.luz = 3;
			
			try {
				threadSema1.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(semaforo2.luz == 3 ){
			System.out.println("entrei no elseif");
			semaforo1.luz = 3;
			threadSema1.notify();
			
			
	
	}
		}
}
