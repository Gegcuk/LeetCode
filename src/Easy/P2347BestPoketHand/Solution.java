package Easy.P2347BestPoketHand;

//You are given an integer array ranks and a character array suits. You have 5
// cards where the ith card has a rank of ranks[i] and a suit of suits[i].
//
//The following are the types of poker hands you can make from best to worst:
//
//        "Flush": Five cards of the same suit.
//        "Three of a Kind": Three cards of the same rank.
//        "Pair": Two cards of the same rank.
//        "High Card": Any single card.
//Return a string representing the best type of poker hand you can make with the given cards.
//
//Note that the return values are case-sensitive.

//Example 1:
//
//Input: ranks = [13,2,3,1,9], suits = ["a","a","a","a","a"]
//Output: "Flush"
//Explanation: The hand with all the cards consists of 5 cards with the same suit, so we have a "Flush".
//Example 2:
//
//Input: ranks = [4,4,2,4,4], suits = ["d","a","a","b","c"]
//Output: "Three of a Kind"
//Explanation: The hand with the first, second, and fourth card consists of 3 cards with the same rank, so we have a "Three of a Kind".
//Note that we could also make a "Pair" hand but "Three of a Kind" is a better hand.
//Also note that other cards could be used to make the "Three of a Kind" hand.
//        Example 3:
//
//Input: ranks = [10,10,2,12,9], suits = ["a","b","c","a","d"]
//Output: "Pair"
//Explanation: The hand with the first and second card consists of 2 cards with the same rank, so we have a "Pair".
//Note that we cannot make a "Flush" or a "Three of a Kind".


import java.util.HashMap;

public class Solution {

        private static final String HIGH_CARD ="High Card";
        private static final String FLUSH = "Flush";
        private static final String THREE_OF_A_KIND = "Three of a Kind";
        private static final String PAIR ="Pair";


    public String bestHand(int[] ranks, char[] suits) {

        HashMap<Character, Integer> characters = new HashMap<>();
        HashMap<Integer, Integer> ranksNumber = new HashMap<>();
        for (char suit : suits) {
            characters.put(suit, characters.getOrDefault(suit, 0) + 1);
        }
        if(characters.containsValue(5)) return FLUSH;

        for (int rank : ranks) {
            ranksNumber.put(rank, ranksNumber.getOrDefault(rank, 0) + 1);
        }
        System.out.println(ranksNumber);

        for(Integer value : ranksNumber.values()) {
            if(value >= 3) return THREE_OF_A_KIND;
        }
        if (ranksNumber.containsValue(2)) return PAIR;
        return HIGH_CARD;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.bestHand(new int[]{4, 4, 2, 4, 4}, new char[]{'d','a','a','b','c'}));
    }

}

