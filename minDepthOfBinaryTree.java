class Solution {
    int min=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        int count=1;
        dfs(root,count);
        return min;
    }
    public void dfs(TreeNode root,int count)
    {
     if(root==null)
         return;
        if(root.left==null && root.right==null)
        {
            min=Math.min(count,min);
            return;
        }
        dfs(root.left,count+1);
        dfs(root.right,count+1);
    
    }
}
//////////////////////////////////////////////////
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        if(root.left==null)
           return 1+minDepth(root.right);
        if(root.right==null)
            return 1+minDepth(root.left);
        
        
        
        
        
        return 1+Math.min(minDepth(root.left),minDepth(root.right));
        
        
        
        
        
    }
}