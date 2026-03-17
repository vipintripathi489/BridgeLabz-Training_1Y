public class BackgroundJobExample {

    public static void main(String[] args) {

        // Runnable functional interface using lambda expression
        Runnable task = () -> {
            System.out.println("Background task started...");

            try {
                // Simulating long-running task
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Background task completed!");
        };

        // Creating a thread and passing Runnable
        Thread backgroundThread = new Thread(task);

        backgroundThread.start();  // Start background execution

        System.out.println("Main thread continues execution...");
    }
}