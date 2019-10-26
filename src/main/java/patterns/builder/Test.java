package patterns.builder;

public class Test {
    private String name;
    private int age;
    private String address;
    private int weight;

    private Test() {
    }

    public static TestBuilder builder() {
        return new TestBuilder();
    }

    public static class TestBuilder {

        Test test;

        private TestBuilder() {
            test = new Test();
        }

        public TestBuilder name(String name){
            test.name = name;
            return this;
        }
        TestBuilder age(int age) {
            test.age = age;
            return this;
        }
        TestBuilder address(String address) {
            test.address = address;
            return this;
        }
        TestBuilder weight(int weight) {
            test.weight = weight;
            return this;
        }
        Test build(){
            return test;
        }
    }
}
