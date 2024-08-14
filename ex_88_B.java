class Clock {
    String time;

    void setTime(String t) {
        time = t;
    }

    String getTime() {  // Change return type to String
        return time;    //  return type is changed from void to String
    }
}

public class ex_88_B {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("13:00");
        String tod = c.getTime();
        System.out.println("time => " + tod);
    }
}

