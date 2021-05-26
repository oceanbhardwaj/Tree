class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        if(node==null)
        return 0;
        return 1+Math.max(height(node.left),height(node.right));
    }
}
///////////////////////////////////
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
