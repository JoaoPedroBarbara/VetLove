package controller;

import java.util.ArrayList;

import model.Animal;
import model.Cliente;
import model.Ficha;

public class GereAnimal 
{
	public ArrayList<Animal> arAnimais;

	public GereAnimal() 
	{
		arAnimais = new ArrayList<>();
	}
	
	public void addAnimal(int id, String classificacao, String raca, String dataNasc, Ficha ficha)
	{
		Animal a = new Animal(id, classificacao, raca, dataNasc, ficha);
		arAnimais.add(a);
		
	}
	
	public void addAnimalobj(Animal a) 
	{
		arAnimais.add(a);
	}
	
	public ArrayList<Animal> getAnimais() 
	{
		
		return this.arAnimais;
	}

}
