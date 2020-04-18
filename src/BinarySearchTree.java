import java.util.*;
        import java.io.*;
class SearchNode{
    SearchNode left,right;
    int data;
    SearchNode(int data){
        this.data=data;
        left=right=null;
    }}

class BinarySearchTree{

    public static int getHeight(SearchNode root){
        if(root==null){
            return -1;
        }
        else {
        return 1 + Math.max(getHeight(root.left),getHeight(root.right));
        }
    }

    public static SearchNode insert(SearchNode root,int data){
        if(root==null){
            return new SearchNode(data);
        }
        else{
            SearchNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int noOfNodes=sc.nextInt();
        SearchNode root=null;
        while(noOfNodes-- > 0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);

        System.out.println();
        System.out.println(height);
    }
}