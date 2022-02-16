package BinaryTree;

public class Client {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();	// 1 true 2 false false true 3 true 4 true 5 false false true 6 false false false
		bt.display();						// 1 true 2 true 4 false false true 5 false false true 3 false false
		bt.inOrder();
		System.out.println();
		bt.preOrder();
		System.out.println();
		bt.postOrder();
		System.out.println();
		bt.leftView();
		System.out.println();
		bt.rightView();
	}

}
