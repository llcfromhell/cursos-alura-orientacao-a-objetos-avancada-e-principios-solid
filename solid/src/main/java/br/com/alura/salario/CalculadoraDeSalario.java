package br.com.alura.salario;

import br.com.alura.salario.empresa.Funcionario;

public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario) {

		return funcionario.calculaSalario();
		
    }
}
