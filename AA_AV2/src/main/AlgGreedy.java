package main;

public class AlgGreedy {
	
	//e = Entrada
	//s = Saida
	//n = Número de Atividades
	public static void retMaxAtividades(int e[], int s[], int n){
		int i;
		int j;
		System.out.print("Atividades Selecionadas: \n");
		i = 0;
		System.out.print(i+" ");
		for(j = 1; j < n; j++){
			if(e[j] >= s[i]){
				System.out.print(j+" ");
			}
		}
	}
	
	//Código que vai executar a função do Algoritmo Guloso
	public static void main(String[] args){
		int e[] = {1, 1, 1, 2, 3, 1};
		int s[] = {2, 4, 5, 3, 4, 4};
		int n = e.length;
		
		retMaxAtividades(e, s, n);
	}
	
}
