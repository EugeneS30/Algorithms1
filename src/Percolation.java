import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

	private int[][] grid;
	WeightedQuickUnionUF UF;
	private int N;
	private int j;
	private int i;
	

	public Percolation(int N) throws IllegalArgumentException {
		this.N = N;

		if (N <= 0) {
			throw new IllegalArgumentException("N mujst be bigger than 0!");
		}

		UF = new WeightedQuickUnionUF(N);

		// Initialize all grid sites to blocked (1)
		grid = new int[N][N];

		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				grid[i][j] = 1;

	}

	public void open(int i, int j) throws IndexOutOfBoundsException {

		// Randomly select i and j
		i = StdRandom.uniform(1, N);
		j = StdRandom.uniform(1, N);

		UF.find(p)
		grid[i][j] = 0;

	}

	public boolean isOpen(int i, int j) throws IndexOutOfBoundsException {
		if (0 == grid[i][j]) {
			return true;
		}

		return false;
	}

	public boolean isFull(int i, int j) throws IndexOutOfBoundsException {
		// is site (row i, column j) full?

		return false;
	}

	public boolean percolates() {
		// does the system percolate?
		return false;
	}

	public static void main(String[] args) {
		// test client (optional)
	}

}
