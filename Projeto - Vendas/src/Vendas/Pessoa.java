package Vendas;

import java.util.List;

public class Pessoa {

	private String nome;
	private String cpf;
	
	//construtor
	Pessoa(){
		
	}
	//set e get
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	//método unknown Wildcard
	public void mostraPessoas1(List<?> pessoas) {
		for(Object p: pessoas) {
			System.out.println(p);
		}
	}
	
	//método extends Wildcard 
	public void mostraPessoas(List<? extends Pessoa> pessoas) {
		for(Pessoa p: pessoas) {
			System.out.println(p.getNome());
		}
	}
	
	//toString
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + "]";
	}	
}
