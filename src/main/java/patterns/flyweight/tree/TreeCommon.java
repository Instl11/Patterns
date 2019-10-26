package patterns.flyweight.tree;


public class TreeCommon {
    private String name;
    private String treeDescription;

    public TreeCommon(String name, String treeDescription) {
        this.name = name;
        this.treeDescription = treeDescription;
    }

    public void draw(int x, int y) {
        System.out.println("We plant " + name + " on x: " + x + " and y: " + y + " coordinates");
    }
}
