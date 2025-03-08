package Easy.P589NaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> resultList = new ArrayList<>();
        if(root == null) return resultList;
        if(root.children == null) {
            resultList.add(root.val);
            return resultList;
        }
        Stack<Node> op = new Stack<>();
        op.push(root);
        while(!op.isEmpty()){
            Node node = op.pop();
            resultList.add(node.val);
            for(int i = node.children.size()-1; i >= 0; i--){
                Node child = node.children.get(i);
                op.push(child);
            }
        }
        return resultList;
    }


}


// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};