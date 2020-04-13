package tp1java;

import java.util.Scanner;

public class Nombres {
	
	public static int somme_Diviseurs(int number) {
		
		int j = 0;

        for(int i = 1; i <= number; i++) {
            if (number % i == 0) {
                j = j + i;
            }
        }
		return j;
	}
	
	static boolean areEquivalent(int num1, int num2)
    {

        return somme_Diviseurs(num1) == somme_Diviseurs(num2);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] T = {1,3,45,6,19,496,78,220};
		int[] S = {56,6,496,23,284,14,56,1};
		for (int i = 0; i < T.length; i++) {
            //System.out.println(T[i] + " ");
        }
		System.out.println("");
        for (int i = 0; i < S.length; i++) {
            //System.out.println(S[i] + " ");
        }
        
        int[] num1 = T;
        int[] num2 = S;
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < S.length; j++) {
                if (areEquivalent(num1[i], num2[j])) {
                    System.out.println(num1[i]+" "+num2[j]+"\n");
                } else {

                }
            }
        }
        
		Scanner ui = new Scanner(System.in);
        System.out.println("Entrez le numero : ");
        int number = ui.nextInt();
        System.out.println(somme_Diviseurs(number));
        ui.close();
        //
        
	}

}
