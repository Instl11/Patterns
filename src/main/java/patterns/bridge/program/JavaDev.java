package patterns.bridge.program;

public class JavaDev implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java dev writes Java code");
    }
}
