package br.com.alura.salario.calculos.impl;

import br.com.alura.salario.calculos.CalculoSalario;
import br.com.alura.salario.empresa.Funcionario;

public class QuinzeOuVinteCincoPorcento implements CalculoSalario {

	@Override
	public double calcular(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 2000.0) {
			return funcionario.getSalarioBase() * 0.75;
		} else {
			return funcionario.getSalarioBase() * 0.85;
		}
	}

}
