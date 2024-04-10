import java.util.*;
import java.util.Stack;


class node{
    char value;
    node left,right;
    public node(char item)
    {
    value=item;
    left=right=null;
    }
}

public class Expressiontree{
    node root;

    //construction of expression treee
public void tree(String exp){
    Stack<node> stack= new Stack<>();
    for(int i = exp.length() - 1; i >= 0; i--){
        char c=exp.charAt(i);
        node N=new node(c);
        if(isoperator(c)){
            N.left=stack.pop();
            N.right=stack.pop();
        }
        stack.push(N);
    }
    root=stack.pop();
}
//to check expression is cherector or operator
boolean isoperator(char c){
    return c == '+' || c == '-' || c == '*' || c == '/';
}

// psotorder traversal 
public void postorder(node N){

    if (N==null)
      System.out.println("stackn is empty");
     
    Stack<node> stack=new Stack<>();
    stack.push(N);
    while (!stack.isEmpty()) {
        node current=stack.pop();
        System.out.println(current.value +"");
        
        if(current.left !=null)
         stack.push(current.left);
        if(current.right !=null)
         stack.push(current.left);
        
    }  
}

// to delete treee
public void deleteTree(node N){
    if(N== null)
      System.out.println("tree is empty");
       

   
      deleteTree(N.left);
      deleteTree(N.right);

      N= null;
}
public static void main(String[] args) {
    Expressiontree tree = new Expressiontree();
    String exp  = "+--a*bc/def";
    
    // Construct the expression tree
    tree.tree(exp);

    // Postorder traversal
    System.out.print("Postorder traversal: ");
    tree. postorder(tree.root);
    System.out.println();

    // Delete the entire tree
    tree.deleteTree(tree.root);
    tree.root = null;
}
}
