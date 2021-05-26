class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
          return true;
        int left=Height(root.left);
        int right=Height(root.right);
        if(Math.abs(left-right)>1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
        
    }
    public int Height(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1+Math.max(Height(root.left),Height(root.right));
    }
}
////////////////////////////////////////////////////////////////////////////
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
          return true;
      return call(root)!=-1;
    }
    public int call(TreeNode root)
    {
        if(root==null)
            return 0;
        int left=call(root.left);
            if(left==-1)
                return -1;
        int right=call(root.right);
        if(right==-1)
            return -1;
        
        if(Math.abs(left-right)>1)
            return -1;
        
        return 1+Math.max(left,right);
    }
}
        