package patterns.abstractFactory;

import patterns.abstractFactory.website.WebSiteTeamFactory;

public class WebSiteProject {
    public static void main(String[] args) {

        TeamFactory teamFactory = new WebSiteTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageTeam();
    }

}
