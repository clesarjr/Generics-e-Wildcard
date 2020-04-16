package Vendas;

import java.util.ArrayList;
import java.util.List;

public class MainExtendsWildcard {

	public static void main(String[] args) {
		
		Vendedor a = new Vendedor();
		a.setIdVendedor(1);
		a.setNome("Claudia");
		a.setCpf("1123213124");
		a.setEmail("claudia@gmail.com");
		
		List<Vendedor> listaVendedores = new ArrayList<Vendedor>();
		listaVendedores.add(a);
		
		Cliente b = new Cliente();
		b.setNome("Mauro");
		b.setCpf("083213122");
		b.setTelefone(122341212);
		
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		listaClientes.add(b);
		
		a.mostraPessoas(listaVendedores);
		a.mostraPessoas(listaClientes);
	}
}
