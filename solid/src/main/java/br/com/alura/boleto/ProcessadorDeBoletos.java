package br.com.alura.boleto;

import java.util.List;

import br.com.alura.nf.item.Fatura;

public class ProcessadorDeBoletos {

	public void processa(List<Boleto> boletos, Fatura fatura) {

        for(Boleto boleto : boletos) {
        	
            Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
            
            fatura.addPagamento(pagamento);
        }

    }
	
}
