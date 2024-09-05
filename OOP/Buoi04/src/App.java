import OtherPack.Otherpack;

public class App {
    public static void main(String[] args) throws Exception {
        Test t = new Test();
        System.out.println(t.b);
        System.out.println(t.c);

        Otherpack o = new Otherpack();
        System.out.println(o.b);
    }

}
