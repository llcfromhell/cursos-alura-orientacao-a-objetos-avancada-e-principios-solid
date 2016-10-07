package br.com.alura.salario.empresa;

import br.com.alura.salario.calculos.CalculoSalario;
import br.com.alura.salario.calculos.impl.DezOuVintePorCento;
import br.com.alura.salario.calculos.impl.QuinzeOuVinteCincoPorcento;

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
