package calc;

import java.util.Scanner;

public class Calculadora {

	
	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		double resultado = c.Somar(8,8);
		System.out.println(resultado);
		
		double resultado1 = c.Subtrair(5,3);
		System.out.println(resultado1);
		
		double resultado2 = c.Multiplicar(5,3);
		System.out.println(resultado2);
		
		double resultado3 = c.Dividir(6,2);
		System.out.println(resultado3);
			
	}
	
	public double Somar(double Param1,double Param2){
	
	return Param1 + Param2;
	
	}
	public double Subtrair(double Param1,double Param2){
		
		return Param1 - Param2;
		
		}
	public double Multiplicar(double Param1,double Param2){
		
		return Param1 * Param2;
		
		}
	public double Dividir(double Param1,double Param2){
		
		return Param1 / Param2;
		
		}
	
	// Calculadora 1.0.0 Data 10/05/2016
	
}
