public class Runner extends Thread {

    public Runner(String name) {
        super(name);
    }

    public void run() {

        System.out.println(Thread.currentThread().getName() + " берет палочку.");
        System.out.print(Thread.currentThread().getName() + " бежит к ");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
