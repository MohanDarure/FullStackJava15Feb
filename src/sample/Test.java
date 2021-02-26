package sample;

public class Test {

    //primitive datatype
    int i = 12321313;
    long l = 0L;
    char c = 'C';
    boolean b = false;
    float f = 0.1F;
    double d = 0.2;
    byte bt = 9;
    short s = 1;


    //non primitive datatypes
    Integer integer = 9;
    Long aLong = 9L;
    Short aShort = 0;
    Float aFloat = 6.8F;
    Double dADouble = 12.0;
    Character character = 'c';
    Boolean aBoolean = false;
    Byte aByte = 21;

    String s1 = "Sahil";
    int a=199;
    public void cost(){
        System.out.println(a);
    }
    public void show() {
        System.out.println("Hello");
    }

    private void show1() {
        System.out.println("Show 1");
    }

    public int dispaly() {
        return 45;

    }
    //public - access modifier
    //static - JVM instantiate without creating the object of class

    //test code for git pull
    public static void main(String[] args) {


        Test sample = new Test();
        sample.show();
        sample.show1();
        sample.cost();

    }
}

