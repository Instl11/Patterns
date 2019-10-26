package patterns.singleton;

public class ProgramLogger {

    private static ProgramLogger programLogger = null;
    private static String logFile = "This is log file. \n\n";

    private ProgramLogger(){};

    public static synchronized ProgramLogger getProgramLogger(){
        if (programLogger == null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    public void addLogInfo(String logInfo){
        logFile += logInfo + "\n";
    }
    public void showLogFile(){
        System.out.println(logFile);
    }
}
