package Singleton;

public class SingletonDireto {

private static SingletonDireto instancia = new SingletonDireto();
	
	private SingletonDireto() {
		super();
	}
	
	public static SingletonDireto getInstancia() {
					
		return instancia;
	}
	
}
