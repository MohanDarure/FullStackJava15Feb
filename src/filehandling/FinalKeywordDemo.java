package filehandling;

public class FinalKeywordDemo {
   final int i=10;
    public void show(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        final int i=12;
        FinalKeywordDemo finalKeywordDemo=new FinalKeywordDemo();
        finalKeywordDemo.show();
    }

    }
    class FinalKeywordOverriding extends FinalKeywordDemo{
    final int i=11;

        @Override
        public void show() {
            System.out.println(i);

        }

        public static void main(String[] args) {
            FinalKeywordOverriding demo = new FinalKeywordOverriding();
            demo.show();
        }
    }

