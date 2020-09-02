package cr.ac.ulead.entidades;

import cr.ac.ulead.entidades.Node;
import cr.ac.ulead.entidades.Persona;

import java.util.Stack;

public class Tree {

	public Node root; // first node of tree

	
	public Tree() 
	{
		root = null;
	}


	public void insert(Persona newData) {
		Node newNode = new Node(); 
		newNode.data = newData;
		if (root == null)
			root = newNode;

		else 
		{
			Node current = root; 
			Node parent;

			int CedulaNewData = Integer.parseInt(newData.getCedula());
			int CedulaData = Integer.parseInt(current.data.getCedula());

			while (true)

			{ 	parent = current;
				if (newData.getFecha_nacimiento().equals(current.data.getFecha_nacimiento())){
					if(CedulaData<CedulaNewData){

						current = current.leftChild;
						if (current == null)
						{
							parent.leftChild = newNode;
							return;
						}
					}
				}
				else if (newData.getFecha_nacimiento().compareTo(current.data.getFecha_nacimiento())<0)
				{
					current = current.rightChild;
					if (current == null) 
					{
						parent.rightChild = newNode;
						return;
					}
				} else if(newData.getFecha_nacimiento().compareTo(current.data.getFecha_nacimiento())>0){
					current = current.leftChild;
					if (current == null)
					{
						parent.leftChild = newNode;
						return;
					}
				}
			}
		}
	}

	public void inOrderGestor(){System.out.print("Inorder traversal:  ");
		inOrder(root);}

	public void preOrderGestor(){System.out.print("Preorder traversal: ");
		preOrder(root);}

	public void posOrder(){System.out.print("Postorder traversal: ");
		postOrder(root);}

	private void preOrder(Node localRoot) {
		if (localRoot != null) {
			System.out.print(localRoot.data.getNombre() + " ");
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}

	
	public void inOrder(Node localRoot) {
		if (localRoot != null) {
			inOrder(localRoot.leftChild);
			System.out.print(localRoot.data.getNombre() + " ");
			inOrder(localRoot.rightChild);
		}
	}

	
	private void postOrder(Node localRoot) {
		if (localRoot != null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			System.out.print(localRoot.data.getNombre() + " ");
		}
	}

	
	public void displayTree() {
		Stack globalStack = new Stack();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("......................................................");
		while (isRowEmpty == false) {
			Stack localStack = new Stack();
			isRowEmpty = true;

			for (int j = 0; j < nBlanks; j++)
				System.out.print(' ');

			while (globalStack.isEmpty() == false) {
				Node temp = (Node) globalStack.pop();
				if (temp != null) {
					System.out.print(temp.data.getNombre());
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);

					if (temp.leftChild != null || temp.rightChild != null)
						isRowEmpty = false;
				} else {
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for (int j = 0; j < nBlanks * 2 - 2; j++)
					System.out.print(' ');
			}
			System.out.println();
			nBlanks /= 2;
			while (localStack.isEmpty() == false)
				globalStack.push(localStack.pop());
		}
		System.out.println("......................................................");
	}
}
