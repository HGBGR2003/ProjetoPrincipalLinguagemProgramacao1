package br.edu.ifgoiano.aluno.henrique.lista;

public class Fatura {
	private String numero;
	private String descricao;
	private int quantiCompradaItem;
	private double precoItem;
	
	public Fatura (String numero1, String descricao1,int quantidadeComprada, double imtemPreco) {
		this.numero = numero1;
		this.descricao = descricao1;
		this.quantiCompradaItem = quantidadeComprada;
		this.precoItem = imtemPreco;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantiCompradaItem() {
		return quantiCompradaItem;
	}
	public void setQuantiCompradaItem(int quantiCompradaItem) {
		this.quantiCompradaItem = quantiCompradaItem;
	}
	public double getPrecoItem() {
		return precoItem;
	}
	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}
	
	public double getTotalFatura() {
		double valorReformulado;
		valorReformulado = this.quantiCompradaItem * this.precoItem;
		
		if(this.quantiCompradaItem < 0 && this.precoItem < 0) {
			valorReformulado = 0;
		}
		
		if(this.quantiCompradaItem > 0 && this.precoItem < 0) {
			valorReformulado = 0;
		}
		
		if(this.quantiCompradaItem < 0 && this.precoItem > 0) {
			valorReformulado = 0.0;
		}
		
		if (this.precoItem > 0 && this.quantiCompradaItem > 0 ) {
			valorReformulado = this.quantiCompradaItem * this.precoItem;
		}
		
		return valorReformulado;

	}
	

}
