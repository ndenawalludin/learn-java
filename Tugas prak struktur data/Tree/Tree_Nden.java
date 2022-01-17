public class Tree_Nden {
    public TreeNode_Nden root;    
    public Tree_Nden(){
        root = null;
    }
        public TreeNode_Nden returnRoot(){
            return root;
        }
    public boolean isEmpty(){
        return root == null;
    }
    public void insert(String value){
        if(isEmpty()){
            root = new TreeNode_Nden(value);
        }else{
            root.add(value);
        }
    }
        public TreeNode_Nden getRoot(){
            return root;
        }
         public void preOrder() {
        preOrder(root);
    }

       public void preOrder(TreeNode_Nden root) {
         if (root != null) {            
       System.out.println(root.getWord());  
       preOrder(root.getLeft());     
       preOrder(root.getRight());    
}
       }
}