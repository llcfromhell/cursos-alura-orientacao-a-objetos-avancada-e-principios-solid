package br.com.alura;

public enum Cargo {

	DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVinteCincoPorcento()),
    TESTER(new QuinzeOuVinteCincoPorcento());
	
    private CalculoSalario calculoSalario;

	private Cargo(CalculoSalario calculoSalario) {
		this.calculoSalario = calculoSalario;
	}

	public CalculoSalario getCalculoSalario() {
		return calculoSalario;
	}

	
}
