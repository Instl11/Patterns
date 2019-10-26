package patterns.factoryMethod;

public class CppDevFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new CPPDeveloper();
    }
}
