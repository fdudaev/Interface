public class MacBook implements IComputer {

    private String color;
    private double ramSize;


    public MacBook(String color, double ramSize) {

        this.color = color;
        this.ramSize = ramSize;

    }

    @Override
    public void lable() {
        System.out.println(color + " color looks good on your laptop");
        System.out.println(ramSize + "gb is a decent RAM size for this laptop");
    }

    @Override
    public void powerOn(boolean isPowerOn) {
        String message = isPowerOn ? "Turning on your PC" : "Turn the switch on";
        System.out.println(message);
    }


    @Override
    public void screen() {
        System.out.println("Welcome message is displayed on your screen");
    }

    @Override
    public void connectKeyboard() {
        System.out.println("KeyBoard is connected");
    }

    @Override
    public void connectMouse() {
        System.out.println("Mouse is connected");
    }

}
