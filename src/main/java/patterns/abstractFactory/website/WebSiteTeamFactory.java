package patterns.abstractFactory.website;

import patterns.abstractFactory.*;
import patterns.abstractFactory.banking.BankTester;
import patterns.abstractFactory.banking.JavaDeveloper;

public class WebSiteTeamFactory implements TeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new WebTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new CommonPM();
    }
}
