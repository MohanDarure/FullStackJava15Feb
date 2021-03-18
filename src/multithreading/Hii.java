package multithreading;

public class Hii extends Thread{
    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println("hii");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

 class Hello extends Thread{
@Override
public void run(){
    for (int j=1; j<=5; j++){
        System.out.println("Hello");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

}
class HiiHello{
    public static void main(String[] args) {
        Hii hii =new Hii();
        Hello hello= new Hello();
        hii.start();
        hello.start();

        try {
            hii.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            hello.join();
        } catch (InterruptedException e) {
            e.printStackTrace();

        } System.out.println("bye");
    }
}
