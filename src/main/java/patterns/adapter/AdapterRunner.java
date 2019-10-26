package patterns.adapter;

public class AdapterRunner {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToDatabase();
        dataBase.delete();
        dataBase.insert();
        dataBase.select();
        dataBase.update();
    }
}
