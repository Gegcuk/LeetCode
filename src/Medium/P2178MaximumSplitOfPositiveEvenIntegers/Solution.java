package Medium.P2178MaximumSplitOfPositiveEvenIntegers;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> resultList = new ArrayList<>();
        if(finalSum %2 != 0) return resultList;

        long leftNumber = 0;
        long rightNumber = finalSum - leftNumber;
        long current = 0;
        while (current != finalSum && leftNumber < rightNumber){
            if(resultList.isEmpty()){
                leftNumber += 2;
            } else {
                leftNumber = resultList.getLast() + 2;
            }
            if(leftNumber >= rightNumber/2){
                resultList.add(rightNumber);
                break;
            }
            rightNumber = rightNumber - leftNumber;
            resultList.add(leftNumber);
            current += leftNumber;
        }
        return resultList;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximumEvenSplit(24));
    }

}
