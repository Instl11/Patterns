package patterns.abstractFactory;

import patterns.abstractFactory.banking.BankTeamFactory;

public class BankProject {
    public static void main(String[] args) {

        TeamFactory teamFactory = new BankTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageTeam();
    }
}
