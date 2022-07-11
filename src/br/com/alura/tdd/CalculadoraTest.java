package br.com.alura.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.Test;//est� importa��o vem do @Test

public class CalculadoraTest {
	//Ao inv�s de ter um m�todo MAIN, teremos um m�todo por cen�rio de teste, um m�todo p/ cada teste
	//Para dizer que vai ser o JUnit que vai fazer o teste dos m�todos abaixo marcamos com annotation @Test:
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		
		//vamos fazer a verifica��o:   //importa��o do Assert deve vir do org.junit
		//Assert substitui o System.out.println();
		Assert.assertEquals(12, soma);//Valor esperado e qual a v�riavel que far� o teste
	}
	
	
}
