package view;

import controller.ClienteJpaDAO;
import controller.VendedorJpaDAO;
import model.Cliente;
import model.Vendedor;

public class App 
{
    public static void main( String[] args )
    {
    	Cliente cliente = new Cliente();
        cliente.setCpf("372.468.423-53");
        cliente.setId(3);
        cliente.setNome("Jeferson Roberto de Lima");
        cliente.setRg("52.563.456-2");
        cliente.setId_vendedor(vendedor);
        ClienteJpaDAO.getInstance().merge(cliente);
        System.out.println("Objetos salvo com sucesso!!!");
    	
    	Vendedor vendedor = new Vendedor();
    	
//    	vendedor.setId(1);
//    	vendedor.setNome("Fulano");
//    	vendedor.setRg("555666111-35");
//    	vendedor.setCpf("888222555-44");
//    	vendedor.setCtps("000000000000");
//    	vendedor.setEndereco("Rua tal, nº1");
//    	VendedorJpaDAO.getInstance().persist(vendedor);
//    	System.out.println("Objetos salvo com sucesso!!!");
    }
}
