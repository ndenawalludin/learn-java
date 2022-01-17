public class TreeNode_Nden {
        private String word;    
    private TreeNode_Nden left;   
    private TreeNode_Nden right;  
    public TreeNode_Nden(String s){
        word = s;
        left = null;
        right = null;
    }
    public void add(String value) {
        if (left == null) {     
            left = new TreeNode_Nden(value);     
        } else if( right == null){      
            right = new TreeNode_Nden(value);            
        } else {        
            if(countNodes(left) <= countNodes(right)){               
                left.add(value);                
            } else {        
                right.add(value);
            }   
        }
    }
    
    public static int countNodes( TreeNode_Nden root ) {
        if ( root == null ){
            
            return 0;  
                }else {
            
            int count = 1;   
            
            count += countNodes(root.left);
            
            count += countNodes(root.right); 
            return count;  
        }
    }
        public TreeNode_Nden getLeft(){
        return left;
    }
    public TreeNode_Nden getRight(){
        return right;
    }
    public String getWord(){
        return word;
    }
}