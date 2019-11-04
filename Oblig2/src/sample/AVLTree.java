package sample;

import javafx.scene.Node;

public class AVLTree {

    private Node root;
    private Node child;

    public AVLTree(){

    }

    public void addNode(Node n){
        if(root == null)
            this.root = n;
        else
            this.child = n;
    }

    public Node getRoot(){
        return this.root;
    }

}
