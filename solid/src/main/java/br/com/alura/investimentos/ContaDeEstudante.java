package br.com.alura.investimentos;

public class ContaDeEstudante {

	private ManipuladorDeContas manipulador;

	private int milhas;
	private double saldo = 0;

	public ContaDeEstudante() {
		this.manipulador = new ManipuladorDeContas();
	}

	public void deposita(double valor) {
		saldo = manipulador.deposita(valor, saldo);
		this.milhas += (int) valor;
	}

	public int getMilhas() {
		return milhas;
	}

	public void rende() {
		throw new RuntimeException("Não pode render");
	}

}
