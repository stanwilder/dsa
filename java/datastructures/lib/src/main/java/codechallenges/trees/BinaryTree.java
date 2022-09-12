package codechallenges.trees;

import codechallenges.linkedlist.stacksAndQueues.Node;

import java.util.ArrayList;

public class BinaryTree <T> {
public Node<T> root = null;
public BinaryTree() {
}

public BinaryTree(Node<T> root) {
  this.root = root;
}
public ArrayList<T> preOrderTraversal() {
  ArrayList<T> arrayList = new ArrayList<>();
  preOrder(arrayList, root);
  return arrayList;
}
public void preOrder(ArrayList<T> list, Node<T> root){
  list.add(root.value);
  if(root.left != null) {
    preOrder(list, root.left);
  }
  if (root.right != null) {
    preOrder(list, root.right);
  }
}
public ArrayList<T> inOrderTraversal() {
  ArrayList<T> arrayList = new ArrayList<>();
  inOrder(arrayList, root);
  return arrayList;
}
public void inOrder(ArrayList<T> list, Node<T> root) {
  if (root.left != null) {
   inOrder(list, root.left);
  }
  list.add(root.value);
  if (root.right != null) {
    inOrder(list, root.right);
  }
}
public ArrayList<T> postOrderTraversal() {
  ArrayList<T> arrayList = new ArrayList<>();
  postOrder(arrayList, root);
  return arrayList;
}
public void postOrder(ArrayList<T> list, Node<T> root) {
  if (root.left != null) {
    postOrder(list, root.left);
  }
  if (root.right != null) {
    postOrder(list, root.right);
  }
  list.add(root.value);
}
  }

//  Help from Mandy and Youtube


