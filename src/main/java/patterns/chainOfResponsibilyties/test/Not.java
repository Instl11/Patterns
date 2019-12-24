package patterns.chainOfResponsibilyties.test;

public abstract class Not {
    private int level;
    protected Not notifier;

    public Not(int level) {
        this.level = level;
    }

    public void setNotifier(Not notifier) {
        this.notifier = notifier;
    }

    void notifyMessage(String message, int priority){
        if (priority >= level){
            printMessage(message);
            if (notifier != null){
                notifier.notifyMessage(message, priority);
            }
        }
    }

    void printMessage(String message){}
}

