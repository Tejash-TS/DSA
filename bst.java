import java.util.*;
class TejashBST{
 static class tree {
int data ;
tree left;
tree right;
tree(int data){
    this.data=data;
    this.left=this.right=null;
}

}
public static tree insert(tree root, int val){
    if(root==null){
        root=new tree(val);
        return root ;
    }
    if (root.data>val){
        root.left=insert(root.left,val);
    }
    else{
        root.right=insert(root.right,val);
    }
    
    return root;
   
}
public static void inorder(tree root){
    if (root==null){
        return;
    }
    inorder(root.left);
    System.out.println(root.data);
    inorder(root.right);
    
}

public static boolean search(tree root,int key){
    if(root==null){
        return false;
}
if(root.data>key){
    return search(root.left,key);
}
else if(root.data==key){
    return true;
}
else{
return search(root.right, key);
}
}
public static tree delete(tree root, int val){
if(root.data>val){
    root.left=delete(root.left,val);
}
else if(root.data<val){
root.right=delete(root.right,val);
}
else//root.data==val
{
    if (root.left==null && root.right==null){
        return null;
    }
    if(root.left==null){
        return root.right;
    }
    if(root.right==null){
        return root.left;
    }
    

}
return root;
}
    
    public static void main(String args[]){
    int values[]={8,5,3,2,1,4,6,10,11,14};
    tree root=null;
    for(int i=0;i<values.length;i++){
        root=insert(root,values[i]);
    }
    inorder(root);
    System.out.println();



    if(search(root,7)){
        System.out.println("found");
    }
    else{
        System.out.println("not found");
    }
   
    
    
    

}

}




