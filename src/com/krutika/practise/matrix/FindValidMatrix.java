package com.krutika.practise.matrix;

public class FindValidMatrix {

	public static void main(String[] args) {
		int[] rowSum = { 3, 8 }, colSum = { 4, 7 };
		FindValidMatrix obj = new FindValidMatrix();
		int[][] resultMatrix = obj.restoreMatrix(rowSum, colSum);
		int rows = rowSum.length;
		int cols = colSum.length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(resultMatrix[i][j] + " ");
			}
			System.out.println("");
		}

	}

	public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
		int r = 0;
		int c = 0;
		int rows = rowSum.length;
		int cols = colSum.length;
		int[][] resultMatrix = new int[rows][cols];
		while (r < rows && c < cols) {
			int minVal = Math.min(rowSum[r], colSum[c]);
			resultMatrix[r][c] = minVal;
			rowSum[r] -= minVal;
			colSum[c] -= minVal;
			if (rowSum[r] == 0) {
				r++;
			} else {
				c++;
			}
		}
		return resultMatrix;
	}
}
