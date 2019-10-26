package patterns.streamHomework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegExp {
    public static void main(String[] args) {

        String s = "Bycattab leb catt kkgdfs";
        Pattern pattern = Pattern.compile("(?=\\b\\w{6,12}\\b)\\w*(cat|dog)\\w*");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
