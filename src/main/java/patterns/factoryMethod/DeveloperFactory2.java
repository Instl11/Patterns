package patterns.factoryMethod;

public class DeveloperFactory2 {

    static Developer createDeveloper(DevSpeciality developer){
        switch (developer){
            case CPP: return new CPPDeveloper();
            case JAVA: return new JavaDeveloper();
            case PHP: return new PHPDevepoler();
        }
            return null;
    }
}
