public class ex_88_A  {
    public static void main(String[] args) {
        int orig = 30;
        ex_88_A x = new  ex_88_A();
        int y = x.doubled(orig);
        System.out.println("Orginal Value = "+orig);
        System.out.println("Doubled Value = "+y);
    }

    int doubled(int arg) {
        arg = arg * 2;  // arg is doubled
        return arg;     // the doubled value is returned
    }
}

