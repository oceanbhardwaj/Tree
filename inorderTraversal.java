class Solution {
    List<Integer> a=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)
            return a;
        Stack<TreeNode> s=new Stack<>();
        while(!s.isEmpty() || root!=null)
        {
           while(root!=null)
           {
               s.push(root);
               root=root.left;
           }
        root=s.pop();
            a.add(root.val);
            root=root.right;
        
        
        }
        
        
        return a;
        
        
        
    }
        
}