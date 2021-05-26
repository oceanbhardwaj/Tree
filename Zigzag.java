class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       
        List<List<Integer>> res=new ArrayList<>();
         if(root==null)
            return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean isFlag=true;
        while(!q.isEmpty())
        {
            int size=q.size();
            LinkedList<Integer> a=new LinkedList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode n=q.poll();
               
                if(isFlag)
                {
                    a.add(n.val);
                    
                }
                else
                {
                      
                    a.addFirst(n.val);
                
                }
                if(n.left!=null)
                        q.add(n.left);
                    
                    if(n.right!=null)
                        q.add(n.right);
                
               
            }
            isFlag=!isFlag;
             
            res.add(a);
        }
        return res;
        
    }
}