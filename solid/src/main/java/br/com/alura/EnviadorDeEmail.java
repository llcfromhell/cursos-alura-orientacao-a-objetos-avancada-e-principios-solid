package br.com.alura;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	public void enviaEmail(NotaFiscal nf) {
		System.out.println("Enviando NF por email");
	}

	@Override
	public void executa(NotaFiscal nf) {
		enviaEmail(nf);
	}

}
