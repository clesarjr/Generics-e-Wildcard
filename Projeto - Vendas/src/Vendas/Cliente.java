package Vendas;

public class Cliente extends Pessoa {

	private long telefone;

	//construtor
	Cliente(){

	}
	//set e get
	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		if(telefone > 0)
			this.telefone = telefone;
	}

	//toString
	public String toString() {
		return "Cliente [telefone=" + telefone + ", toString()=" + super.toString() + "]";
	}
}
