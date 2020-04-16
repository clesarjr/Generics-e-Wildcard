package Vendas;

public class Vendedor extends Pessoa {

	private int idVendedor;
	private String email;
	
	//construtor
	Vendedor(){
		
	}
	//set e get
	public int getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(int idVendedor) {
		if(idVendedor > 0)
			this.idVendedor = idVendedor;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.length() > 0)
			this.email = email;
	}
	
	//toString
	public String toString() {
		return "Vendedor [idVendedor=" + idVendedor + ", email=" + email + ", toString()=" + super.toString() + "]";
	}
}
