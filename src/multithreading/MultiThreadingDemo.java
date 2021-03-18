package multithreading;


public class MultiThreadingDemo extends Thread{

    @Override
    public void run() {
        System.out.println("we have achived threading");
        super.run();
    }

    public static void main(String[] args) {
        MultiThreadingDemo multiThreadingDemo = new MultiThreadingDemo();
        multiThreadingDemo.start();
    }
}
