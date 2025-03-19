package Easy.tasks101_200.P119PascalTriangleII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);
        if(rowIndex == 0) return currentRow;
        currentRow.add(1);
        if(rowIndex == 1) return currentRow;
        for(int i = 0; i < rowIndex-1; i++){
            currentRow = nextRow(currentRow);
        }
        return currentRow;
    }

    public static List<Integer> nextRow(List<Integer> currentRow){
        List<Integer> nextRow = new ArrayList<>();
        nextRow.add(1);
        for(int i = 1; i < currentRow.size(); i++){
            nextRow.add(currentRow.get(i) + currentRow.get(i-1));
        }
        nextRow.add(1);
        return nextRow;
    }
}
