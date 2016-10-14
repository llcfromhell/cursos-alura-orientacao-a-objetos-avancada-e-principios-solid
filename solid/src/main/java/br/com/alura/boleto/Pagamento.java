package br.com.alura.boleto;

public class Pagamento {

	private double valor;

	private MeioDePagamento meioPagamento;

	public Pagamento(double valor, MeioDePagamento meioPagamento) {
		this.valor = valor;
		this.meioPagamento = meioPagamento;
	}

	public double getValor() {
		return valor;
	}

	public MeioDePagamento getMeioPagamento() {
		return meioPagamento;
	}

	

}
