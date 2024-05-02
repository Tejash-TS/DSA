import java.util.Stack;

class TreeNode {
    char data;
    TreeNode left, right;

    public TreeNode(char data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class ET {
    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static TreeNode constructET(String prefix) {
        Stack<TreeNode> stack = new Stack<>();

        // Reading the prefix expression in reverse order
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);
            System.out.println(c);

            if (isOperator(c)) {
                

                TreeNode operatorNode = new TreeNode(c);
                operatorNode.left = stack.pop();
                operatorNode.right = stack.pop();

                stack.push(operatorNode);
            } else {
                TreeNode operandNode = new TreeNode(c);
                stack.push(operandNode);
            }
        }

        return stack.pop();
    }

    
    public static void deleteTree(TreeNode root) {
        if (root == null)
            return;

        deleteTree(root.left);
        deleteTree(root.right);
        root = null; // This line just to emphasize the deletion, though not really necessary in Java

    }
   public static void Postorder(TreeNode root){
if(root==null){
    return;
}
Postorder(root.left);
Postorder(root.right);
System.out.println(root.data);
   }

    public static void main(String[] args) {
        String prefixExpression = "+--a*bc/def"; // Example prefix expression
        TreeNode root = constructET (prefixExpression);
        System.out.println("Postorder traversal of the expression tree:");
         Postorder(root);
        // Deleting the entire tree
        deleteTree(root);
        System.out.println("\nTree deleted.");
    }
}
