public class ex_63_B  {
    String name;

    public static void main(String[] args) {
        ex_63_B [] h = new ex_63_B [3];
        int z = 0;
        while (z < 3) {  // Changed condition to z < 3
            h[z] = new ex_63_B ();
            h[z].name = "soumya";
            if (z == 1) {
                h[z].name = "ayu";
            }
            if (z == 2) {
                h[z].name = "ved";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
            z = z + 1;
        }
    }
}

