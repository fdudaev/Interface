public class Main {
    public static void main(String[] args) {
        ITelephone iPhone;

        iPhone = new MobilePhone(4444225);
        iPhone.powerOn();
        iPhone.dial(4444225);
        iPhone.isRinging();
        iPhone.answer();

        ISmartWatch appleWatch;
        appleWatch = new iWatch();
        appleWatch.powerOn(200);
        System.out.println(appleWatch.batteryLife(200));
        appleWatch.wallpaper();
        appleWatch.wristStrap("Black");


    }
}