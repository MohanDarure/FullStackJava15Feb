package polymorphism;

public class MethodOverloadingDemo {
    int z=0;
    public void argg(int a , int b){
        z=a*b;
        System.out.println(z);
    }
    public void argg(int a, int b, int c){
        z=a*b*c;
        System.out.println(z);
    }
    public void argg(int a, int b, int c, int d){
        z=a*b*c*d;
        System.out.println(c);
    }
    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();
        demo.argg(2 ,7, 5);
    }
}
