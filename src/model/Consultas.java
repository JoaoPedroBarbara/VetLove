package model;

public class Consultas 
{
	String data;
	String descricao;
	public Consultas(String data, String descricao) {
		super();
		this.data = data;
		this.descricao = descricao;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	

}
