package Vendas;

public class Marca {

	private String descricao;

	Marca(){

	}
	//set e get
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if(descricao.length() > 0)
			this.descricao = descricao;
	}

	//toString
	public String toString() {
		return "Marca [descricao=" + descricao + "]";
	}	
}
