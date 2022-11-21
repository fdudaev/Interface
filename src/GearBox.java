public class GearBox implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public GearBox(int myNumber) {
        this.myNumber = myNumber;
    }

    public void dial(int phoneNumber) {
        if (this.isOn) {
            System.out.println("Now ringing " + phoneNumber + " on iPhone");
        } else {
            System.out.println("your iPhone is switched off");
        }

    }

    public void powerOn() {
        this.isOn = true;
        System.out.println("The iPhone is turned on");
    }

    public void answer() {
        if (this.isRinging) {
            System.out.println("Answering the phone");
            this.isRinging = false;
        }

    }

    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.myNumber && this.isOn) {
            this.isRinging = true;
            System.out.println("Ringtone is playing");
        } else {
            this.isRinging = false;
            System.out.println("iPhone is switched off or number is different");
        }

        return this.isRinging;
    }

    public boolean isRinging() {
        return this.isRinging;
    }
}

