 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        int left=Height(root.left);
        int right=Height(root.right);
        int max=left+right;
        return Math.max(max,Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)));
        
    }
    
    public int Height(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1+Math.max(Height(root.left),Height(root.right));
    }
    
    
    
    
    
}
/////////////////////////////////////////
class Solution {
    int max=Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        call(root);
        return max;
        
    }
    
    public int call(TreeNode root)
    {
        if(root==null)
            return 0;
        int lh=call(root.left);
        int rh=call(root.right);
        max=Math.max(lh+rh,max);
        return 1+Math.max(lh,rh);
    }
    ///////////////////////////////////////////
 */
class Solution {
   HashMap<TreeNode,Integer> h=new HashMap<>();
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        call(root);
        return dfs(root);
        
        
    }
    public int dfs(TreeNode root)
    {
        if(root==null)
            return 0;
        int l1=0;
        int r1=0;
        if(root.left!=null && h.containsKey(root.left))
        l1=h.get(root.left);
         if(root.right!=null && h.containsKey(root.right))
         r1=h.get(root.right);
        
        return Math.max(l1+r1,Math.max(dfs(root.left),
                                       dfs(root.right)));
    }
    
    public int call(TreeNode root)
    {
        if(root==null)
            return 0;
        int lh=call(root.left);
        int rh=call(root.right);
        int d=1+Math.max(lh,rh);
        h.put(root,d);
        return d;
    }
    
    
    
    
    
}
    
    
    
    
}