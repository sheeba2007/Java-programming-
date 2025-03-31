class node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class BinarySearchTreedelete{
	Node root;
	void delete(int data){
		root=deletenode(root,data);
	}
	Node deletenode(node currentnode,int data){
		if(current Node==null){
			return current Node;
		}
 		if(data<current Node.data){
			current Node.left=delete Node(current Node.left,data);
		}else if(data>current Node.data){
			currentnode.right=deletenode(currentnode.right,data);
		}else{
			if(currentnode.left==null){
				return currentnode.right;
			}else if(currentnode.right==null){
				return currentnode.left;
			}
		}
		return currentnode;
	}
	void printTree(){
		printTree(root);
	}
	void printTree(Nodenode){
		if(node==null){
			printTree(node.left);
			System.out.print(node.data+" ");
			printTree(node.right);
		}
	}
	public static void main(String[]args){
		BinarySearchTree2 bst=new BinarySearchTree2();
		bst.root=new node(50);
		bst.root.left=new node(30);
		bst.root.right=new node(70);
		bst.root.right.left=new node(20);
		bst.root.left.right=new node(40);
		System.out.println("Before deletion:");
		bst.printTree();
		bst.delete(70);
		System.out.println("After deletion:");
		bst.printTree();
	}
}
		