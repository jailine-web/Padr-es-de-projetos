package Singleton;
public class Main {

	
	public static void main(String[] args) {
		
		Singleton sing1 = Singleton.getInstancia();
		System.out.println(sing1);
		
		sing1 = Singleton.getInstancia();
		System.out.println(sing1);
		
		System.out.println();
		
		SingletonDireto sing2 = SingletonDireto.getInstancia();
		System.out.println(sing2);
		sing2 = SingletonDireto.getInstancia();
		System.out.println(sing2);
		
		System.out.println(); 
		
		SingletonHolder sing3 = SingletonHolder.getInstancia();
		System.out.println(sing3);
		//sing3.getInstancia();
		sing3 = SingletonHolder.getInstancia();
		System.out.println(sing3);
		
		
	}
}
