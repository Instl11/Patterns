package patterns.abstractFactory;

public class CommonPM implements ProjectManager {
    @Override
    public void manageTeam() {
        System.out.println("PM coordinates team working");
    }
}
