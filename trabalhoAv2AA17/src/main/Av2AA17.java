package trabalhoAv2AA17;

public class Av2AA17 {

	// Função Principal
	public static void main(String[] args) {
	
		int[] p = { 1, 5, 8, 9, 10, 17, 17, 20, 24, 30 };
		int n = 7;
		System.out.println("Maximo obitido = "+ bottomUp_RodCut(n, p));

	}
	
	//Função para execulta o corte das hastes
	
	public static int bottomUp_RodCut(int n, int p[]) {
		int[] dp = new int[n + 1];
		dp[1] = p[1];
		for (int i = 1; i <= n; i++) {
			int max = p[i];
			for (int j = 1; j <= i / 2; j++) {
				max = Math.max(max, dp[j] + dp[i - j]);
			}
			dp[i] = max;
		}

		return dp[n];
	}

	

}


