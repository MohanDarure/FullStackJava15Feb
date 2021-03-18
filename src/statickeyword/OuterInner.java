package statickeyword;

public class OuterInner {
    public static void main(String[] args) {
      Outer outer=new Outer();
      outer.show();
    //  Outer.Inner inner=new Outer.Inner();
    }
}
class Outer{
    int i= 18;
    public void show(){
        System.out.println(i);
    }

    public static void main(String[] args) {
    Outer outer=new Outer();
    outer.show();
    Outer.Inner inner=outer.new Inner();
    inner.innershow();

    }
    private class Inner{
        int i=10;
                public void innershow(){
                    System.out.println(i);
                }
    }

}