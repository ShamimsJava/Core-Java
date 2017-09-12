package pkgclass.pkg31;

public class ToStting_Method {
    
    String s1, s2;

    public ToStting_Method(String st1, String st2) {
        this.s1 = st1;
        this.s2 = st2;
    }

    @Override
    public String toString() {
        return "["+s1+" "+s2+"]";
    }

    public static void main(String[] args) {
        ToStting_Method tsm = new ToStting_Method("Hello", "World!!");
        System.out.println(tsm);
    }
    
}
