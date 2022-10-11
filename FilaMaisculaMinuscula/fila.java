package FilaMaisculaMinuscula;
import java.util.Scanner;
public class fila {
	Scanner entrada = new Scanner(System.in);
	 public void FilaLetras() {
		    String letra;
			Scanner entrada = new Scanner(System.in);
			int cont = 1;
			int contmin = 1;
			int aux = 0;
			int auxmin = 0;
			char vetorMaiusculo[] = new char[cont];
			char vetorMinusculo[] = new char[cont];
			//char novovetorMaiusculo[] ;

			while (true) {
				System.out.print("Digite uma letra: ");
				letra = entrada.nextLine();	
		        if("".equals(letra)) {
		        	System.out.println("Finalizando ...");
		            break;
		        }else {
		        	char c1 = letra.charAt(0);
		        	if (Character.isUpperCase(c1)) {
		        		vetorMaiusculo[aux] = c1;
		        		cont++;
		        		aux++;
		        		char novovetorMaiusculo[] =  new char[cont];
//		        		
		            	for (int i = 0; i < vetorMaiusculo.length; i++) {
		            		novovetorMaiusculo[i] = vetorMaiusculo[i];
		    			}
		            	vetorMaiusculo = novovetorMaiusculo;
					} else {
						vetorMinusculo[auxmin] = c1;
						contmin++;
		        		auxmin++;
		        		
		        		char novovetorMinusculo[] =  new char[contmin];
		        		
		            	for (int i = 0; i < vetorMinusculo.length; i++) {
		            		novovetorMinusculo[i] = vetorMinusculo[i];
		    			}
		            	vetorMinusculo = novovetorMinusculo;
					}
		        }

			}
			
			System.out.println("Vetor maiusculo");
			
			for (int i = 0; i < vetorMaiusculo.length; i++) {
				System.out.println(vetorMaiusculo[i] + " ,");
			}
			
			System.out.println("Vetor minusculo");
			
			for (int i = 0; i < vetorMinusculo.length; i++) {
				System.out.println(vetorMinusculo[i] + " ,");
			}
	 }
}
