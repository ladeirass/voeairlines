package br.com.voeairlines.bo;

public class ClienteBO implements IValidacaoEmbarque {

//	Polimorfismo
	@Override
	public String validaIdade(int idade) {
		String r;
		if (idade < IValidacaoEmbarque.IDADEMIN) {
			r = "Embarque nãi autorizado";

		} else {
			r = "Boa Viagem! VoeAirlines fazendo você sonhar alto!";

		}
		return r;
	}

	@Override 
	public void validaIdade() {
		// TODO Auto-generated method stub
		
	}
}