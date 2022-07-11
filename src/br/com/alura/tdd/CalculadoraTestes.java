package br.com.alura.tdd;

public class CalculadoraTestes {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		//Este � o teste de 1 cen�rio apenas, pois existem N cen�rios possiveis
		int soma = calc.somar(3, 7);
		System.out.println(soma);
		
		soma = calc.somar(3, 0);
		System.out.println(soma);
		
		soma = calc.somar(0, 0);
		System.out.println(soma);
		
		soma = calc.somar(3, -1);
		System.out.println(soma);
	}
}
