package multithreading;

public class RunnableDemo implements Runnable{
   @Override
    public void run(){
        System.out.println("we have used runnable");
    }
    public static void main(String[] args) {
      RunnableDemo runnableDemo = new RunnableDemo();
      Thread tread = new Thread(runnableDemo);
      tread.start();
    }
}
