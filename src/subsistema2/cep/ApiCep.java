package subsistema2.cep;

public class ApiCep {

	private static ApiCep instancia = new ApiCep();
	
	private ApiCep() {
		
	}
	
	public static ApiCep getInstancia() {
		return instancia;
	}
	public String recuperarCidade (String cep) {
		return "Catu";
	}
	
	public String recuperarEstado (String cep) {
		return "Bahia";
	}
}
