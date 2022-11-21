public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");
    }

    public void powerOn() {
        System.out.println("Desk phone is always connected to the powerline");
    }

    public void answer() {
        if (this.isRinging) {
            System.out.println("Answering the phone");
            this.isRinging = false;
        }

    }

    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.myNumber) {
            this.isRinging = true;
            System.out.println("ring ring");
        } else {
            this.isRinging = false;
        }

        return this.isRinging;
    }

    public boolean isRinging() {
        return this.isRinging;
    }
}

