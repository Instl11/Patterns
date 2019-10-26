package patterns.abstractFactory.banking;

import patterns.abstractFactory.*;

public class BankTeamFactory implements TeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new BankTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new CommonPM();
    }
}
