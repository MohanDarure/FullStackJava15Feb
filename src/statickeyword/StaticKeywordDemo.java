package statickeyword;

public class StaticKeywordDemo {
    static final String CollegeName;

    static {
        System.out.println("in static block");
        CollegeName = "KwcSangli";
    }
    int id;
    String Name;
public static void show(){
    System.out.println("in static method ");
}

    public static void main(String[] args) {
        StaticKeywordDemo.show();
        StaticKeywordDemo demo= new StaticKeywordDemo();
          demo.id=20;
          demo.Name="MdBrand";
          StaticKeywordDemo demo1=new StaticKeywordDemo();
          demo1.id=43;
          demo1.Name="Silent_Knight_1008";
        System.out.println();
        System.out.println("id=>"+demo.id+" Name=>" + demo.Name+ " CollegeName=>"+CollegeName);
        System.out.println("id=>"+demo1.id+ " Name=>"+demo1.Name+ " CollegeName=>"+CollegeName);
    }
}
