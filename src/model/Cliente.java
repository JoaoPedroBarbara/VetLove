package model;

import java.util.ArrayList;

public class Cliente 
{
	int id;
	String nome;
	String morada;
	String email;
	String telefone;
	
	public Cliente(int id, String nome, String morada, String email, String telefone) 
	{
		super();
		this.id = id;
		this.nome = nome;
		this.morada = morada;
		this.email = email;
		this.telefone = telefone;
		this.arAnimal = arAnimal;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public ArrayList<Animal> arAnimal;
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMorada() {
		return morada;
	}


	public void setMorada(String morada) {
		this.morada = morada;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public ArrayList<Animal> getArAnimal() {
		return arAnimal;
	}


	public void setArAnimal(ArrayList<Animal> arAnimal) {
		this.arAnimal = arAnimal;
	}


}
