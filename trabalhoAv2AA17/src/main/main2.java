package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class main2 {

	public static void main(String[] args){
		System.out.println(MemoizedCutRod(1, 5));
		
	}
	
    //finds maximum of two given integers
    public static int max(int a, int b) {
        return (a > b) ? a : b;

    }

    public static int MemoizedCutRod(int price, int lenght) throws FileNotFoundException {

        int[] r = new int[lenght + 1];
        for (int i = 1; i <= lenght; i++) {
            r[i] = 0;
        }
        return MemoizedCutRodAux(price, lenght);
    }

    public static int MemoizedCutRodAux(int price, int lenght) {
    	int v=0;
    	int total=0;
    	
    	Scanner in = new Scanner(new FileReader("dados.txt"));
    	while (in.hasNextLine()) {
    	    String line = in.nextLine();
    	    System.out.println(line);
    	    total++;
    	}
    	
		System.out.println(total);
		int[] priceTable = new int[total];
		
		while (in.hasNext()) {
			priceTable[v] = in.nextInt();
			v++;
		}

        if (lenght == 0) {
            return 0;
        }
        int q = 0;
        for (int i = 1; i <= lenght; i++) {
            q = max(q, priceTable[i] + MemoizedCutRodAux(price, lenght - i));
        }

        return q;
    }
}