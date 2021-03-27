public class App {
    public static void main(String[] args) throws Exception {
        double firstValue = 20.00d;
        double secondValue = 80.00d;

        double step3 = (firstValue + secondValue) * 100d;

    
        boolean step4 = step3 % 40.00d == 0 ? true:false;
        System.out.printf("%b", step4);

        if (!step4){
            System.out.println("Got some remainder");
        }

    }
}
