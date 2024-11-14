package Trees;

import java.util.List;

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


class Solution {
    public int maxDepth(Node root) {
        return height(root);
    }
    private int height(Node root){
        if(root == null){
            return 0;
        }
        int ans = 0;
        for(Node currentChild : root.children){
            ans = Math.max(ans, height(currentChild));
        }
        return 1+ans;
    }
}
