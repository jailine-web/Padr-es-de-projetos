package Strategy;

public class Main {

	public static void main(String[] args) {
		
		Comportamento normal = new ComportamentoNatural();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		
		Robo robo = new Robo();
		
		robo.setStrategy(normal);
		robo.mover();
		
		robo.setStrategy(defensivo);
		robo.mover();
		
		robo.setStrategy(agressivo);
		robo.mover();
		
	}
}
