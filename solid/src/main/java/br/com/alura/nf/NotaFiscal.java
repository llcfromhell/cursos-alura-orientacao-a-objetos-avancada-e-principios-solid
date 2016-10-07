package br.com.alura.nf;

public class NotaFiscal {

	private double valor;
	private double valorComImpostos;

	public NotaFiscal(double valor, double valorComImpostos) {
		this.valor = valor;
		this.valorComImpostos = valorComImpostos;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValorComImpostos() {
		return valorComImpostos;
	}

	public void setValorComImpostos(double valorComImpostos) {
		this.valorComImpostos = valorComImpostos;
	}

	
	
}
