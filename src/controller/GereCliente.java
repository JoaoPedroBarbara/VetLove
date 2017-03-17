package controller;

import java.util.ArrayList;

import model.Animal;
import model.Cliente;

public class GereCliente 
{
	public ArrayList<Cliente> arClientes;

	public GereCliente() 
	{
		arClientes = new ArrayList<>();
	}
	
	public void addCliente(int id, String nome, String morada, String email, String telefone)
	{
		Cliente c = new Cliente(id, nome, morada, email, telefone);
		arClientes.add(c);
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
