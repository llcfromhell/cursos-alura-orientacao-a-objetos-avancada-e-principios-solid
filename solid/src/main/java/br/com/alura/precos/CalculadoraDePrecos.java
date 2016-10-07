package br.com.alura.precos;

import br.com.alura.precos.item.Compra;
import br.com.alura.precos.valores.ServicoDeEntrega;
import br.com.alura.precos.valores.TabelaDePreco;

public class CalculadoraDePrecos {

	private TabelaDePreco tabelaDePreco;
	private ServicoDeEntrega servicoDeEntrega;

	public void CalculadoraDeSalario(TabelaDePreco tabelaDePreco, ServicoDeEntrega servicoDeEntrega ) {
		this.tabelaDePreco = tabelaDePreco;
		this.servicoDeEntrega = servicoDeEntrega;
	}
	
	public double calcula(Compra produto) {

        double desconto = tabelaDePreco.descontoPara(produto.getValor());
        double frete = servicoDeEntrega.calculaFretePara(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
}