package sample;


import javafx.scene.Node;

public class AVLNode{
    private Node leftChild, rightChild;
    private int height, element;

    public AVLNode (int element, int height){
        this.element = element;
        this.height = height;
    }

    //SET &  GET
    public void setElement(int e){
        this.element = e;
    }

    public int getElement(){
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
