package Easy.tasks101_200.P118PascalTriangle;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        currentList.add(1);
        resultList.add(currentList);
        for (int i = 1; i < numRows; i++) {
            currentList = generateList(currentList);
            resultList.add(currentList);
        }
        return resultList;
    }

    private List<Integer> generateList(List<Integer> currentList) {
        List<Integer> newList = new ArrayList<>();
        newList.add(1);
        for (int i = 0; i < currentList.size() - 1; i++) {
            newList.add(currentList.get(i) + currentList.get(i + 1));
        }
        newList.add(1);
        return newList;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int numRows = 5;
        List<List<Integer>> pascalTriangle = solution.generate(numRows);

        for (List<Integer> row : pascalTriangle) {
            for (Integer num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
