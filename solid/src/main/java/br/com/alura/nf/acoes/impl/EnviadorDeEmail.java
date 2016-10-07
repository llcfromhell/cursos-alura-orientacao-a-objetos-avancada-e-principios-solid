package br.com.alura.nf.acoes.impl;

import br.com.alura.nf.NotaFiscal;
import br.com.alura.nf.acoes.AcaoAposGerarNota;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	public void enviaEmail(NotaFiscal nf) {
		System.out.println("Enviando NF por email");
	}

	@Override
	public void executa(NotaFiscal nf) {
		enviaEmail(nf);
	}

}
