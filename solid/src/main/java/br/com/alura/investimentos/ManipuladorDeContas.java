package br.com.alura.investimentos;

public class ManipuladorDeContas {

	public double deposita(double valor, double saldo) {
		return saldo += valor;
	}

	public double saca(double valor, double saldo) {
		if (valor <= saldo) {
			saldo -= valor;
		} else {
			throw new IllegalArgumentException();
		}

		return saldo;
	}

	public double rende(double saldo, double percentual) {
		return saldo * percentual;
	}
}
