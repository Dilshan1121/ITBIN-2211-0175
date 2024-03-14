public class Inkey {
    public static void main(String[] args) {
        String pinkey = "Donkey";
        String blinkey = "Pinkey";
        String rinkey = "Monkey";

        Inkey ponkey = new Inkey(pinkey);
        Inkey ponkey2 = new Inkey(pinkey, blinkey, rinkey);
    }

    public Inkey(String x) {
        System.out.println(x);
    }

    public Inkey(String x, String y, String z) {
        System.out.println(y + " " + x);
        System.out.println(x + " " + z);
        System.out.println(y + " " + x + " " + z);
    }
}