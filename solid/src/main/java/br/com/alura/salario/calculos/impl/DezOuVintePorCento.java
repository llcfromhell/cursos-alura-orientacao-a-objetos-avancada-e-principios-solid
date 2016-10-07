package br.com.alura.salario.calculos.impl;

import br.com.alura.salario.calculos.CalculoSalario;
import br.com.alura.salario.empresa.Funcionario;

public class DezOuVintePorCento implements CalculoSalario {

	public double calcular(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		} else {
			return funcionario.getSalarioBase() * 0.9;
		}
	}

}
