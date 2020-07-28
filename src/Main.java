public class Main {

    public static void main(String[] args) {

        System.out.println("Начало эстафеты!");
        for (int i = 1; i <= 5; i++) {
            if (i == 5) {
                System.out.println("Runner " + i + " бежит к финишу.");
                break;
            }
            Runner runner = new Runner("Runner " + i);
            runner.start();
            try {
                runner.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Runner " + (i + 1));
        }

        for (int i = 4; i >= 1; --i) {
            Runner runner = new Runner("Runner " + i);
            if (i == 4) {
                System.out.println("Runner 5 бежит к Runner " + i);
            }
            if (i == 1) {
                System.out.println("Runner " + i + " берет палочку.");
                break;
            }
            runner.start();
            try {
                runner.join();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Runner " + (i - 1));

        }
        System.out.println("Конец эстафеты!");
    }
}





