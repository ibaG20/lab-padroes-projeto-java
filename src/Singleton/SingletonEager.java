package Singleton;

/*
 * Singleton "apressadinho".
 * -> j� instancia ddireto
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
