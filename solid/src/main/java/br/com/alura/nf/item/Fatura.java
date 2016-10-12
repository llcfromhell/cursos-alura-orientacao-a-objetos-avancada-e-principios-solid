package br.com.alura.nf.item;

import java.util.List;
import java.util.ArrayList;

import br.com.alura.boleto.Pagamento;

public class Fatura {

	private double valor;
	private List<Pagamento> pagamentos = new ArrayList<Pagamento>();
	private boolean pago;

	public double getValor() {
		return this.valor;
	}

	public void addPagamento(Pagamento pagamento) {

		this.pagamentos.add(pagamento);
			
		pago = totalValorPagamentosIgualValor(); 
		
	}

	private boolean totalValorPagamentosIgualValor() {

		return pagamentos.stream().mapToDouble(Pagamento::getValor).sum() == this.valor;
		
	}

}
