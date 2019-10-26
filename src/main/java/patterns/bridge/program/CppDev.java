package patterns.bridge.program;

public class CppDev implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp dev writes C++ code");
    }
}
