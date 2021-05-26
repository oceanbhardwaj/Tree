class Solution {
    public boolean isSymmetric(TreeNode root) {
        return mirror(root,root);
      
        
    }
    public boolean mirror(TreeNode t1,TreeNode t2 )
    {
        if(t1==null && t2==null)
            return true;
        if(t1==null || t2==null)
            return false;
        if(t1.val!=t2.val)
            return false;
        return (t1.val==t2.val) && mirror(t1.left,t2.right) && mirror(t2.left,t1.right);
        
        
    }
}
/////////////////////////////////////////////
class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode t1=q.poll();
            TreeNode t2=q.poll();
            if(t1==null && t2==null)
                continue;
            if(t1==null || t2==null)
                return false;
            if(t1.val!=t2.val)
            {
                return false;
            }
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }
}
////////////////////////////////////////////////
class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        int count=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            count++;
            for(int i=0;i<size;i++)
            {
                Node n=q.poll();
                if(n.left!=null)
                q.add(n.left);
                if(n.right!=null)
                q.add(n.right);
                
            }
        }
        return count;
    }
}
///////////////////////////////////////////////////////////////
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        Queue<TreeNode> q1=new LinkedList<>();
        Queue<TreeNode> q2=new LinkedList<>();
        q1.add(p);
        q2.add(q);
        while(!q1.isEmpty() && !q2.isEmpty())
        {
            TreeNode n1=q1.poll();
            TreeNode n2=q2.poll();
            if(n1==null && n2==null)
                continue;
            if(n1==null || n2==null)
                return false;
            if(n1.val!=n2.val)
                return false;
            q1.add(n1.left);
            q1.add(n1.right);
            q2.add(n2.left);
            q2.add(n2.right);
            
        }
        
       return true;
        
    }
}