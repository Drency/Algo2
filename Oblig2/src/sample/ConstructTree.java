package sample;

import javafx.scene.Node;

import java.util.ArrayList;

public class ConstructTree {
    private ArrayList<Node> list;
    public ConstructTree(ArrayList<Node> list){
        this.list = list;

    }

    public void drawTree(){
        int branches = countTree(this.list);
    }

    public int countTree(ArrayList<Node> ls){
        return ls.size();
    }



}
