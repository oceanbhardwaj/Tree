class Solution {
    List<Integer> a=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        if(root==null)
            return a;
          preOrder(root);
        return a;
    }
    public void preOrder(TreeNode root)
    {
        if(root==null)return;
        a.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
/////////////////////////////////////////////////////
class Solution {
    List<Integer> a=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        if(root==null)
            return a;
         Stack<TreeNode> s=new Stack<>();
        s.add(root);
        while(!s.isEmpty())
        {
            TreeNode c=s.pop();
            a.add(c.val);
             if(c.right!=null)
                 s.add(c.right);
            if(c.left!=null)
                s.add(c.left);
            
            
        }
        
        return a;
        
    }
}
//////////////////////////////////////////////////////
class Solution {
    List<Integer> a=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)
            return a;
        Stack<TreeNode> s=new Stack<>();
        while(!s.isEmpty() || root!=null)
        {
           while(root!=null)
           {
               s.push(root);
                a.add(root.val);
               root=root.left;
           }
        root=s.pop();
           
            root=root.right;
        
        
        }
        
        
        return a;
        
        
        
    }
        
}