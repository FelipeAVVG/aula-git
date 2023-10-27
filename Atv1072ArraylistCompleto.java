import java.util.ArrayList;
import java.util.Scanner;

public class Atv1072ArraylistCompleto {
	public static void main(String[] args) {
			Scanner imprimir = new Scanner(System.in);
   			int saida = imprimir.nextInt();
   			
   			ArrayList<Integer> algarismo = new ArrayList<>();
   			ArrayList<Integer> entradasIn = new ArrayList<>();
   			ArrayList<Integer> entradasOut = new ArrayList<>();
   			
   			for(int x = 0; x < saida; x++) {
   				int numeros = imprimir.nextInt();
   				algarismo.add(numeros);
   			 if(numeros >= 10 && numeros <= 20) {
   				entradasIn.add(numeros);
			 }else{
				 entradasOut.add(numeros);
			 }
				 }
		imprimir.close();
		
			System.out.println(entradasIn.size() + " in:");
			System.out.println(entradasIn);
				
			System.out.println(entradasOut.size() + " out:");
			System.out.println(entradasOut);   		     		
   		}
	}
		







