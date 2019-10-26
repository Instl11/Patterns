package patterns.command;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {

        TextFile f = new TextFile();
        String path = "D://books/";
        Command save = new SaveCommand(f, path);
        Command open = new OpenCommand(f);
        Command print = new PrintCommand(f);

        Button button = new Button(save);
        button.click();

        button.setCommand(open);
        button.click();

        Map<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);

        map.entrySet().forEach(e -> e.setValue(e.getValue()*20));
        System.out.println(map);
    }
}



