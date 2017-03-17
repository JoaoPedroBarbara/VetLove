package model;

public class Animal 
{
	int id;
	String classificacao;
	String raca;
	String dataNasc;
	Ficha ficha;
	
	
	
	
	
	public Ficha getFicha() {
		return ficha;
	}


	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}


	public Animal(int id, String classificacao, String raca, String dataNasc, Ficha ficha) {
		super();
		this.id = id;
		this.classificacao = classificacao;
		this.raca = raca;
		this.dataNasc = dataNasc;
		this.ficha = ficha;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public double getGastosVacinas()
	{
		double total = 0;
		for(Vacina v : ficha.getVacinas())
		{
			total += v.getPreco();
			
			
		}
		return total;
	}
	
	
	

}
