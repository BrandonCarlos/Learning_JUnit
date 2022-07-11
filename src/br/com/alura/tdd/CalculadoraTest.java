package br.com.alura.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.Test;//está importação vem do @Test

public class CalculadoraTest {
	//Ao invés de ter um método MAIN, teremos um método por cenário de teste, um método p/ cada teste
	//Para dizer que vai ser o JUnit que vai fazer o teste dos métodos abaixo marcamos com annotation @Test:
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		
		//vamos fazer a verificação:   //importação do Assert deve vir do org.junit
		//Assert substitui o System.out.println();
		Assert.assertEquals(12, soma);//Valor esperado e qual a váriavel que fará o teste
	}
	
	
}
