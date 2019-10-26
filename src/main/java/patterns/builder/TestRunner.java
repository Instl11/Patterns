package patterns.builder;

public class TestRunner {
    public static void main(String[] args) {

        Test build = Test.builder().address("Slyckaya").age(22).name("Bob").weight(185).build();
        System.out.println();
    }
}
