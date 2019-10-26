package patterns.abstractFactory.website;

import patterns.abstractFactory.Tester;

public class WebTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Tester tests code for WebSite");
    }
}
