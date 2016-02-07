import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class PercolationStats {

	public PercolationStats(int N, int T) throws IllegalArgumentException {

		if ((N <= 0) || (T <= 0)) {
			throw new IllegalArgumentException("T and N must ne bigger than 0!");
		}

	}

	public double mean() {
		return 0;
		// sample mean of percolation threshold
	}

	public double stddev() {
		return 0;
		// sample standard deviation of percolation threshold
	}

	public double confidenceLo() {
		return 0;
		// low endpoint of 95% confidence interval
	}

	public double confidenceHi() {
		return 0;
		// high endpoint of 95% confidence interval
	}

	public static void main(String[] args) {
		
		int gridSize = Integer.parseInt(args[0]);
		int trials = Integer.parseInt(args[1]);
		
		for (int i = 0; i == args[]; i++) {
			
		}
		
		Percolation p = new Percolation(20);
		
		

		System.out.println(args[0]);
		System.out.println(args[1]);
	}

}
