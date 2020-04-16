package Vendas;

public class MainSuperWildcard {

	public static void main(String[] args) {
		
		Box<Cliente> cliente = new Box<Cliente>();
		Box<String> stringBox = new Box<String>();
		
		Cliente c = new Cliente();
		c.setNome("Joao");
		c.setCpf("124242342");
		c.setTelefone(3123124);
		
		cliente.setT(c);
		stringBox.setT(new String("Clésar"));
		
		System.out.println("String: " + stringBox.getT());
		System.out.println("Cliente: " + cliente.getT());
	}
}
