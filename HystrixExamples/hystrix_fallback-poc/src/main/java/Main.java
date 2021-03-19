public class Main {
    public static void main(String[] args) {
        HystrixFallBackClass hystrixFallBackClass = new HystrixFallBackClass();
        System.out.println(hystrixFallBackClass.execute());
    }
}
