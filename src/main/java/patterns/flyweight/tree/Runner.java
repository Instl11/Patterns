package patterns.flyweight.tree;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Tree> treeList = new ArrayList<>() {{
            add(TreeFactory.getTree("Birch", "Very good tree", 1, 5));
            add(TreeFactory.getTree("Birch", "Very good tree", 2, 4));
            add(TreeFactory.getTree("Birch", "Very good tree", 3, 3));
        }};
        for (Tree tr : treeList) {
            tr.draw();
        }
        TreeFactory.commonTrees.forEach((s, treeCommon) -> System.out.println(s + " " + treeCommon));
    }
}
