package model;

public class Animal 
{
	int id;
	String classificacao;
	String raca;
	String dataNasc;
	
	
	public Animal(int id, String classificacao, String raca, String dataNasc) {
		super();
		this.id = id;
		this.classificacao = classificacao;
		this.raca = raca;
		this.dataNasc = dataNasc;
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
	
	
	

}
