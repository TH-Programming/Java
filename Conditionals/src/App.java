public class App {
    public static void main(String[] args) throws Exception {
        boolean isAlien = true;
        if (isAlien)
        {
            System.out.println("It's an alien!");
        }
        else {
            System.out.println("not alien");
        }

        int topScore = 99;
        if (topScore > 100){
            System.out.println("High Score!");
        }
        else if (topScore < 100)
        {
            System.out.println("No high Score");
        }
    }
}
