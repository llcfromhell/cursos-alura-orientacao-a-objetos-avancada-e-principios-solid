package br.com.alura.nf.item;

import java.util.Collections;
import java.util.List;

import br.com.alura.boleto.Pagamento;

public class Fatura {

	private List<Pagamento> pagamentos;
	private double valor;
	private boolean pago;

	public double getValor() {
		return this.valor;
	}

	public List<Pagamento> getPagamentos() {
		return Collections.unmodifiableList(this.pagamentos);
	}
	
	public void addPagamento(Pagamento p) {
		this.pagamentos.add(p);
	}

	public void setPago() {
		this.pago = true;
	}

	public boolean isPago() {
		return pago;
	}

}
