package Singleton;

import Facade.Facade;
import Strategy.Comportamento;
import Strategy.ComportamentoAgressivo;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

public class Main {

	public static void main(String[] args) {
		
		//Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println (lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println (lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println (eager);
		eager = SingletonEager.getInstancia();
		System.out.println (eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println (lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println (lazyHolder);
		
		//Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		robo.mover();

		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Gabriella", "75110-750");


	
	}
}
