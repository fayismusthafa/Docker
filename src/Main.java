public class Main {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Hello world!");
        while(true) {
            try {
                Thread.sleep(2*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("I'm still here! Iteration " + count++);
        }
    }
}