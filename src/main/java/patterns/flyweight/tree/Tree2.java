package patterns.flyweight.tree;

public class Tree2 {
    private int x;
    private int y;
    private String name;
    private String treeDescription;

    public Tree2(int x, int y, String name, String treeDescription) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.treeDescription = treeDescription;
    }

    public void draw() {
        System.out.println("We plant " + name + " on x: " + x + " and y: " + y + " coordinates");
    }
}
