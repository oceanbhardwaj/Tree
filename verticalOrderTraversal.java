/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    class Pair
    {
        int x;
        int y;
        TreeNode node;
        Pair(int x,int y,TreeNode node)
        {
            this.x=x;
            this.y=y;
            this.node=node;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
            return res;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(0,0,root));
        TreeMap<Integer,PriorityQueue<Pair>> pq=new TreeMap<>();
        Comparator co=new Comparator<Pair>(){
            public int compare(Pair p1,Pair p2)
            { if(p1.y==p2.y)
                return p1.node.val-p2.node.val;
                return p1.y-p2.y;
            }
        };
        while(!q.isEmpty())
        {
            Pair c=q.poll();
            pq.putIfAbsent(c.x,new PriorityQueue<>(co));
            pq.get(c.x).add(c);
            if(c.node.left!=null)
            {
                q.add(new Pair(c.x-1,c.y+1,c.node.left));
            }
             if(c.node.right!=null)
            {
                q.add(new Pair(c.x+1,c.y+1,c.node.right));
            }
            
        }
        
        for(int i:pq.keySet())
        {
            ArrayList<Integer>a1=new ArrayList<>();
            PriorityQueue<Pair> pp=pq.get(i);
            while(!pp.isEmpty())
            {
                a1.add(pp.poll().node.val);
            }
            res.add(a1);
        }
        return res;
        
        
        
        
        
        
        
        
        
        
        
        
    }
}