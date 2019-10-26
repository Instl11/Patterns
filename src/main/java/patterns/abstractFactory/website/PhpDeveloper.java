package patterns.abstractFactory.website;

import patterns.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP Dev write code for website");
    }
}
