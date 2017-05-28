package main;

//Função que executara o Corte de Hastes
public class RodCutting {
    static int cutRod(int preço[], int n) {
        if (n <= 0)
            return 0;
        int max_val = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++)
            max_val = Math.max(max_val, preço[i] + cutRod(preço, n-i-1));
        	return max_val;
    }
    
    /*Programa que ira ler os valores, calcular a quantidade e retornar
    a melhor solução*/
    public static void main(String args[]) {
    	int arr[] = new int[] {2, 4, 8, 5, 6, 7, 12, 14, 15, 18};
    	int tam = arr.length;
    	
    	/*No Println vai ser chamada a função para calcular o corte utilizando
    	das variáveis arr e tam.*/
    	System.out.println("Valor Maximo Obtido é "+ cutRod(arr, tam));
	}
}