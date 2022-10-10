package Recursividade;

public class Recursividade {
	
	//Crie uma função recursiva que receba um número  inteiro positivo N e calcule o somatório dos números  de 1 a N.
	public int Q1(int num){
		if(num == 0) {
			return 0;
		}	
		return num + Q1(num - 1);
    }
	//Faça uma função recursiva que receba um número  inteiro positivo N e imprima todos os números  naturais de 0 até N em ordem crescente.
	public int Q2(int fim, int inicio) {
		if (inicio != fim) {
			System.out.print(inicio+ ", ");
			return Q2(fim ,inicio + 1);
		} else {
			return fim ;
		}

	}
	//Crie um programa, que contenha uma função  recursiva que receba dois inteiros positivos k e n e  calcule kn. Utilize apenas multiplicações. O programa  principal deve solicitar ao usuário os valores de k e n  e imprimir o resultado da chamada da função.
	public int Q3(int k, int num) {
		if (num == 1) {
			return k;
		} else {
			return k * Q3(k, num -1);
		}
	}
	
	
}
