package codechallenges.trees;

import codechallenges.linkedlist.stacksAndQueues.Node;

public class BinarySearchTree<T> extends BinaryTree {
  public BinarySearchTree() {
    super();
  }

  public void add(int val) {
    Node<Integer> newNode = new Node<Integer>(val);
    Node<Integer> current;
    if (root == null) {
      root = newNode;
    } else {
      current = root;
      while (current != null) {
        if (newNode.value.compareTo(current.value) < 0) {
          if (current.left == null) {
            current.left = newNode;
            return;
          }
          current = current.left;
        } else {
          if (current.right == null) {
            current.right = newNode;
            return;
          }
          current = current.right;
        }
      }
    }
  }

  public boolean contains(int val) {
    Node<Integer> current = root;
    while (current != null) {
      if (current.value == val) {
        return true;
      } else if (val < current.value) {
        current = current.left;
      } else {
        current = current.right;
      }
    }
    return false;
  }
}

// Help from Mandy and Youtube


