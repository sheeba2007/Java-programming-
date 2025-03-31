class BinarySearchTree1{
	static class Node{
		int data;
		Node left,right;
		public Node(int item){
			data=item;
			left=right=null;
		}
	}
 	Node root;
	public BinarySearchTree1(){
		root=null;
	}
	public Node insert(Node root,int Key){
			root=new Node(key);
 			return root;
		}
		if(key<rootdata){
			root.left=insert(root.left,key);
		}else if(key>rootdata){
		root.right=insert(root.right,key);
		}
		return root;
	}
	public Boolean Search(Node root, int key){
		if(root==null){
			return false;
		}
		if(root.data==key){
			return true;
		}
		return search(root.left,key);
	}
	public void inorder(Node root){
		if(root!=null){
			inorder(root.left);
			System.out.print(rootdata+" ");
			inorder(root.right);
 	 	}
	}
	public static void main(String[]args){
		BinarySearchTree tree=new BinarySearchTree(){
			tree.root=tree.insert(tree.root,50);
			tree.root=tree.insert(tree.root,30);
			tree.root=tree.insert(tree.root,20);
			tree.root=tree.insert(tree.root,40);
			tree.root=tree.insert(tree.root,70);
			tree.root=tree.insert(tree.root,60);
			tree.root=tree.insert(tree.root,80);
			System.out.print("Inorder traversal of the BST:");
			tree.inorder(tree.root);
			System.out.println();
			int KeyToSearch=40;
			 System.out.println("Searching for node with key:"+KeyToSeach);
				if(tree.search(treeroot,KeyToSearch)){
					System.out.println("Node with key"+KeyToSearch+"found");
				}else{
					System.out.println("Node with key"+KeyToSearch+"found");
				}
				KeyToSearch=90;
				System.out.print("Searching For node with key:"+KeyToSeach);
				if(tree.search (tree.root,KeyToSearch)){
					System.out.print("Node with Key"+KeyToSearch+"Not found");
				
			}
		}
	}
}			
			
			

			
		
		


