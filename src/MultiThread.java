public class MultiThread {

    public static void main(String[] args) {
        ExampleThread examplethread = new ExampleThread();
        examplethread.start();

        ExampleThread examplethread1 = new ExampleThread();
        examplethread1.start();
    }

}

class ExampleThread implements Runnable{

    Thread examplehtread;
    int i = 5;
    int result = 10;

    @Override
    public void run() {
        while(i>=0){
            try {
                System.out.println(result/i);
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            i--;
        }
    }
    public void start() {
        System.out.println("Thread started");
        if (examplehtread == null) {
            examplehtread = new Thread(this);
            examplehtread.start();
        }
    }
}