package model;

import java.util.ArrayList;

public class Ficha 
{
	ArrayList<Vacina> vacinas;
	ArrayList<Consultas> consultas;
	
	public Ficha(ArrayList<Vacina> vacinas, ArrayList<Consultas> consultas) {
		super();
		this.vacinas = vacinas;
		this.consultas = consultas;
	}

	public ArrayList<Vacina> getVacinas() {
		return vacinas;
	}

	public void setVacinas(ArrayList<Vacina> vacinas) {
		this.vacinas = vacinas;
	}

	public ArrayList<Consultas> getConsultas() {
		return consultas;
	}

	public void setConsultas(ArrayList<Consultas> consultas) {
		this.consultas = consultas;
	}

	

}
