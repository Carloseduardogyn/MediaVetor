package vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
		double[] vet = new double[n];
		double media = 0;
		double soma = 0;
		
		for(int i=0; i<n; i++) {
			vet[i] = sc.nextDouble();
			soma = vet[i] + soma;
		}
		media = soma / n; 
		
		System.out.println(media);
		
		for(int i=0; i<n; i++) {
			if(vet[i] <= 10.0){
				System.out.println(vet[i]);
			}
		}
		
		
		
		
		sc.close();
	}

}
