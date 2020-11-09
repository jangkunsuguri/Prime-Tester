public class PrimeTester{
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();
        PrimeThread t1 = new PrimeThread(3, 5000000);
        PrimeThread t2 = new PrimeThread(5000001, 10000000);
        t1.start();
        t2.start();
        while (t1.isAlive() && t2.isAlive()) {
            Thread.sleep(10);
        }
        long end = System.nanoTime();
        long time = end - start;

        //t1.join();
        //t2.join();
        System.out.println("Thread 1 Prime Count = " + t1.getPCount());
        System.out.println("# Seconds Used = " + t1.getSTime());
        System.out.println("Prime Count = " + t2.getPCount());
        System.out.println("# Seconds Used = " + t2.getSTime());
        System.out.println("Total Prime Count:" + (t1.getPCount() + t2.getPCount()));
    }
}