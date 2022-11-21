public class Main {
    public static void main(String[] args) {
        ITelephone iPhone;

        iPhone = new MobilePhone(4444225);
        iPhone.powerOn();
        iPhone.dial(4444225);
        iPhone.isRinging();
        iPhone.answer();

    }
}