package br.com.alura.investimentos;

public class ContaComum {

	private double saldo = 0;

	private ManipuladorDeContas manipulador;

	public ContaComum() {
		this.manipulador = new ManipuladorDeContas();
	}

	public double getSaldo() {
		return saldo;
	}

	public void rende() {
		saldo = manipulador.rende(saldo, 0.01);
	}

	public void deposita(double valor) {
		saldo = manipulador.deposita(valor, saldo);
	}

}
