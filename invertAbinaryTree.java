public class invertAbinaryTree {
        {
        public TreeNode invertTree(TreeNode root) {
           if(root==null)
               return root;
            
            //swap r.l,r.r values
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            
            invertTree(root.left);
            invertTree(root.right);
            
            return root;
            
        }
    }

