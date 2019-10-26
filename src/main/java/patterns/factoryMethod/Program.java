package patterns.factoryMethod;

public class Program {
    public static void main(String[] args) {

       DeveloperFactory developerFactory = new JavaDevFactory();
       Developer developer = developerFactory.createDeveloper();
       developer.writeCode();

    }

    static DeveloperFactory createDevFactoryBySpeciality(DevSpeciality speciality){
        switch (speciality){
            case CPP: return new CppDevFactory();
            case JAVA: return new JavaDevFactory();
        }
        return null;
    }


}
