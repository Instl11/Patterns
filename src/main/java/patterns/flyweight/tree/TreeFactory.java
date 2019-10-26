package patterns.flyweight.tree;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    static Map<String, TreeCommon> commonTrees = new HashMap<>();

    public static Tree getTree(String name, String treeDescription, int x, int y) {

        TreeCommon commonTree = commonTrees.get(name);
        if (commonTree == null) {
            commonTree = new TreeCommon(name, treeDescription);
            commonTrees.put(name, commonTree);
        }
        return new Tree(x, y, commonTree);
    }
}
