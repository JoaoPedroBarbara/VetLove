package controller;

import java.util.ArrayList;

import model.Animal;
import model.Cliente;
import model.Vacina;

public class GereCliente 
{
	public ArrayList<Cliente> arClientes;

	public GereCliente() 
	{
		this.arClientes = new ArrayList<Cliente>();
	}
	
	public void addCliente(String nome, String morada, String email, String telefone)
	{
		Cliente c = new Cliente(nome, morada, email, telefone);
		int novoId = arClientes.size(); //O ID e do tamanho da arraylist
		c.setId(novoId);
		arClientes.add(c);
	}
	
	public Cliente getCliente(int id)
	{
		/*foreach
		 * Para cada cliente, sob a variavel c, dentro da colecao arCliente, faz:
		 */
		for (Cliente c : arClientes)
		{
			if(c.getId() == id)
				return c;
		}
		
		return null;
	}
	
	public double getGastoVacinas(Cliente c)
	{
		/*
		 * for(int i = 0; i < arCliente.size(); i++)
		 * 			Cliente c = arCliente.get(i);
		 * 			Continuar ...
		 */
		
		
		
			double totalVacAnimais = 0;
			for(Animal a : c.getArAnimal()) //Para cada animal
			{
				double totalVacinaAnimal = 0;
				for(Vacina v : a.getFicha().getVacinas()) // Para cada Vacina
				{
					totalVacinaAnimal += v.getPreco();
				}
				totalVacAnimais += totalVacinaAnimal;
				/*
				 * Pode ser substituido por
				 */
				//totalVacAnimais += a.getGastosVacinas();
				
			}
			totalVacAnimais += totalVacAnimais;
		
		return totalVacAnimais;
	}
	
	public void addClientobj(Cliente c) 
	{
		arClientes.add(c);
	}
	
	public ArrayList<Cliente> getClientes() 
	{
		return this.arClientes;
	}

}
