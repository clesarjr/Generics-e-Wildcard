package Vendas;

public class Produto {

	private String nome;
	private int quantidade;
	private float valor;
	
	protected Marca marca;
	
	Produto(){
		marca = new Marca();
	}

	//set e get
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length() > 0)
			this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if(quantidade > 0)
			this.quantidade = quantidade;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		if(valor > 0)
			this.valor = valor;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	//toString
	public String toString() {
		return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", valor=" + valor + ", marca=" + marca + "]";
	}
}
