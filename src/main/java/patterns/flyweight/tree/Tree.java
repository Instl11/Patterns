package patterns.flyweight.tree;

public class Tree {
    private int x;
    private int y;
    private TreeCommon commonTree;

    public Tree(int x, int y, TreeCommon type) {
        this.x = x;
        this.y = y;
        this.commonTree = type;
    }

    public void draw() {
        commonTree.draw(x, y);
    }


}
