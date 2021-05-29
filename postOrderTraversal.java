class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
       
    List<Integer> a=new ArrayList<>();
        
       dfs(root,a);
        return a;
        
    }
    public void dfs(TreeNode root,List<Integer> a)
    {
        if(root==null)
            return;
         dfs(root.left,a);
        dfs(root.right,a);
       
        a.add(root.val);
        
        
        
        
        
    }
}
////////////////////////////////////////////////////
class Solution {
    LinkedList<Integer> a=new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)
            return a;
        Stack<TreeNode> s=new Stack<>();
        while(!s.isEmpty() || root!=null)
        {
           while(root!=null)
           {
               s.push(root);
                a.addFirst(root.val);
               root=root.right;
           }
        root=s.pop();
           
            root=root.left;
        
        
        }
        
        
        return a;
        
        
        
    }
        
}