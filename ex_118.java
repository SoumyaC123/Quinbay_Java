public class ex_118{
    public static void main(String[] args) {
        ex_118 output = new ex_118();
        output.go();
    }

    void go() {
        int value = 7;
        for (int i = 1; i < 8; i++) {  // Loop runs from i = 1 to i = 7
            value++;  // Increment value by 1
            if (i > 4) {
                System.out.print(++value + " ");  // Increment value and print it
            }
            if (value > 14) {
                System.out.println(" i = " + i);  // Print i and exit the loop
                break;
            }
        }
    }
}

