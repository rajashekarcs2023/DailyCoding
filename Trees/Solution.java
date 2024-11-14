package Trees;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> answer = new ArrayList<>();
        preorderTraversal(root,answer);
        return answer;
    }
    private void preorderTraversal(Node root,List<Integer> answer){
        if(root == null)
        return;
        List<Node> childrens = root.children;
        answer.add(root.val);
        for(Node childNode : childrens){
            preorderTraversal(childNode, answer);
        }
        return;
    }
}