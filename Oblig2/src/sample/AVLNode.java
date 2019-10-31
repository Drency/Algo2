package sample;

import javafx.scene.Node;

public class AVLNode{
    private Node element, leftChild, rightChild;
    private int height;

    public AVLNode (Node element, Node leftChild, Node rightChild, int height){
        this.element = element;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.height = height;
    }

    public void addRoot(Node element){
        root = new Node<E>(null, this, element);
    }

    public Node getRoot(){
        return root;
    }


    //SET &  GET
    public void setElement(Node e){
        this.element = e;
    }

    public Node getElement(){
        return this.element;
    }

    public void setLeftChild(Node lC){
        this.leftChild = lC;
    }

    public Node getLeftChild(){
        return this.leftChild;
    }

    public  void setRightChild(Node rC){
        this.rightChild = rC;
    }

    public Node getRightChild(){
        return this.rightChild;
    }

    public void setHeight(int h){
        this.height = h;
    }

    public int getHeight(){
        return this.height;
    }
}
