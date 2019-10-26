package patterns.abstractFactory;

public interface TeamFactory {

    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
