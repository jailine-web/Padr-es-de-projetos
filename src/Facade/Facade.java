package Facade;

import subsistema1.crm.ServiceCrm;
import subsistema2.cep.ApiCep;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = ApiCep.getInstancia().recuperarCidade(cep);
		String estado = ApiCep.getInstancia().recuperarEstado(cep);
		ServiceCrm.gravarCliente(nome, cep, cidade, estado);
	}
}
