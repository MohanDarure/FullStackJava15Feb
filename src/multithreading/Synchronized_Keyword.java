package multithreading;

public class Synchronized_Keyword {
    int num;
    public  void set(){
        num++;
    }

    public static void main(String[] args) {
        Synchronized_Keyword synk =new Synchronized_Keyword();
        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=1000;i++){
                    synk.set();
                }
            }
        });
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=1000;i++)
                    synk.set();
            }
        });

        thread.start();
        thread1.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(synk.num);
    }
}
