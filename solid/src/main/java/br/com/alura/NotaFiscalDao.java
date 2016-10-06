package br.com.alura;

public class NotaFiscalDao implements AcaoAposGerarNota {

	public void persiste(NotaFiscal nf) {
		System.out.println("Persistindo NF no banco de dados");
	}

	@Override
	public void executa(NotaFiscal nf) {
		persiste(nf);
	}

}
