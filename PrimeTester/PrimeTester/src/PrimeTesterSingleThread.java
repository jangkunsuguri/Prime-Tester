public class PrimeTesterSingleThread{
    public static void main(String[] args) throws InterruptedException{
    PrimeThread pThread = new PrimeThread(3,5000000);

    pThread.start();
    pThread.join();

    System.out.println("Prime Count = " + pThread.getPCount());
    System.out.println("# Seconds Used = " + pThread.getSTime());}
}