package pkgclass.pkg44_assertion;

public class Test_Assertion {

    public static void main(String[] args) {
        int x = 1;
        assert (x>0);
        assert (x>0):"Assert Erroe Caught";
        System.out.println("Everything Ok");
    }

}
