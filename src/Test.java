public class Test {
    public static void main(String[] args) throws Exception {
        info(1, 2);
    }

    public static void info(int a, int b) throws Exception {
        if (a > b) {
            System.out.println("А больше Б");
        } else {
            throw new Exception();
        }
    }
}
