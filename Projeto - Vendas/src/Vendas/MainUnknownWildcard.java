package Vendas;

import java.util.ArrayList;
import java.util.List;

public class MainUnknownWildcard {

	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		c.setNome("Clésar");
		c.setCpf("12345678911");
		c.setTelefone(1232423);
		
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		listaClientes.add(c);
		
	}
}
