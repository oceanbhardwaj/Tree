class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       
       if(root==null && subRoot==null)
           return true;
        if(root==null )
            return false;
       
       
       return  Match(root,subRoot)|| isSubtree(root.left,subRoot) ||  isSubtree(root.right,subRoot);
          
        
    }
    public boolean Match(TreeNode root,TreeNode subRoot)
    {
        if(root==null && subRoot==null)
            return true;
        if(root==null || subRoot==null)
            return false;
        if(root.val!=subRoot.val)
            return false;
        
        return Match(root.left,subRoot.left) && Match(root.right,subRoot.right);
        
        
    }
}
//////////////////////////////////////////////////////////
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot==null)
            return true;
        if(root==null || subRoot==null)
            return true;
        String s1=preOrder(root);
        String s2=preOrder(subRoot);
        if(s1.contains(s2))
            return true;
        
        return false;
        
    }
    public String preOrder(TreeNode root)
    {
        if(root==null)
            return "";
        StringBuilder sb=new StringBuilder();
        Stack<TreeNode>s=new Stack<>();
        s.add(root);
        while(!s.isEmpty())
        {
        TreeNode c=s.pop();
            if(c==null)
                sb.append("#");
            else
          sb.append(","+c.val);
            if(c!=null)
            {
                s.push(c.right);
                s.push(c.left);
                
            }
                
        
        }
        return sb.toString();
    }
    
    
    
    
}