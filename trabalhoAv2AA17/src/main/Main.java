package main;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o tamanho da tabela?");
		int tamTab = s.nextInt();
		System.out.println(MemoizedCutRod(1, 2));
		
	}
	
    //finds maximum of two given integers
    public static int max(int a, int b) {
        return (a > b) ? a : b;

    }

    public static int MemoizedCutRod(int price, int lenght) {

        int[] r = new int[lenght + 1];
        for (int i = 1; i <= lenght; i++) {
            r[i] = 0;
        }
        return MemoizedCutRodAux(price, lenght, r);
    }

    public static int MemoizedCutRodAux(int price, int lenght, int[] r) {

        int[] priceTable = new int[11];
        priceTable[1] = 1;
        priceTable[2] = 5;
        priceTable[3] = 8;
        priceTable[4] = 9;
        priceTable[5] = 10;
        priceTable[6] = 17;
        priceTable[7] = 17;
        priceTable[8] = 20;
        priceTable[9] = 24;
        priceTable[10] = 30;

        if (r[lenght] >= 0) {
            return r[lenght];
        }

        if (lenght == 0) {
            return 0;
        }
        int q=1;

        for (int i = 1; i <= lenght; i++) {
            q = max(q, priceTable[i] + MemoizedCutRodAux(price, lenght, r));
            r[lenght] = q;
        }
        return q;
    }
}