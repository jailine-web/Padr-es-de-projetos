package Strategy;

public class Robo {

	private Comportamento estrategia;

	public void setStrategy(Comportamento strategy) {
		this.estrategia = strategy;
	}
	public void mover() {
		estrategia.mover();
	}
	
}
