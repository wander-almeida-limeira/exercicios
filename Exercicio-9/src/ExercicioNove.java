
class BinaryTree {
	public int value;
	public BinaryTree right;
	public BinaryTree left;

	public int sum() {
		return value + (right == null ? 0 : right.sum()) + (left == null ? 0 : left.sum());
	}
}

class BinaryTreeTest {

	private BinaryTree root;

	public BinaryTreeTest() {
		root = null;
	}

	public void insert(int value) {
		BinaryTree item = new BinaryTree();
		item.value = value;
		item.right = null;
		item.left = null;

		if (root == null) {
			root = item;
		} else {
			BinaryTree node = root;
			BinaryTree pNode;
			while (true) {
				pNode = node;
				if (value <= node.value) {
					node = node.left;
					if (node == null) {
						pNode.left = item;
						return;
					}
				} else {
					node = node.right;
					if (node == null) {
						pNode.right = item;
						return;
					}
				}
			}
		}

	}

	public BinaryTree search(long value) {
		BinaryTree pNode = root;

		while (pNode.value != value) {
			if (value < pNode.value) {
				pNode = pNode.left;
			} else {
				pNode = pNode.right;
			}
		}
		return pNode;
	}
}

class ExercicioNove {

	public static void main(String[] args) {
		BinaryTreeTest binaryTreeTest = new BinaryTreeTest();
		binaryTreeTest.insert(43);
		binaryTreeTest.insert(432);
		binaryTreeTest.insert(2);
		binaryTreeTest.insert(1);
		binaryTreeTest.insert(22);
		binaryTreeTest.insert(28);
		binaryTreeTest.insert(33);

		//procura o nó cujo valor é 2
		BinaryTree binaryTree = binaryTreeTest.search(2);
		//calcula a soma dos nós subsequentes ao nó cujo valor é 2
		System.out.println("Soma dos nós subsequentes: " + (binaryTree.sum() - binaryTree.value));
		
		/*Result out =>
		 Soma dos nós subsequentes: 84
		*/
	}

}