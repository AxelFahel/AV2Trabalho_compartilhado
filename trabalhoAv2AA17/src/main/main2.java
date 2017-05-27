package main;

public class main2 {

	public static void main(String[] args){
		System.out.println(MemoizedCutRod(1, 5));
		
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
        return MemoizedCutRodAux(price, lenght);
    }

    public static int MemoizedCutRodAux(int price, int lenght) {

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