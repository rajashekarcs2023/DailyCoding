package Trees;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> answer = new ArrayList<>();
            preorder(root,answer);
            return answer;
        
    }
    private void preorder(TreeNode root, List<Integer> answer){
        if (root == null){
            return;
        }
        answer.add(root.val);
        preorder(root.left, answer);
        preorder(root.right, answer);
        return;
    }
}