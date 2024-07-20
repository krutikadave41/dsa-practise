package com.krutika.practise.matrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LuckyNumsInMatrix {

	public static void main(String[] args) {
		LuckyNumsInMatrix obj = new LuckyNumsInMatrix();
		int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
		List<Integer> result = obj.luckyNumbers(matrix);
		result.forEach(System.out::println);
	}
	
    public List<Integer> luckyNumbers(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        HashSet<Integer> minRows = new HashSet<Integer>();
        for (int i = 0; i < rows; i++) {
            int minVal = matrix[i][0];
            for (int j = 0; j < cols; j++) {
                minVal = Math.min(minVal, matrix[i][j]);
            }
            minRows.add(minVal);
        }
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < cols; i++) {
            int maxVal = matrix[0][i];
            for (int j = 0; j < rows; j++) {
                maxVal = Math.max(maxVal, matrix[j][i]);
            }
            if (minRows.contains(maxVal)) {
                result.add(maxVal);
            }
        }
        return result;
    }
}
