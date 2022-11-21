public class iWatch implements ISmartWatch {

    private double weight;
    private int price;
    private int batteryLife;


    public iWatch() {

    }

    @Override
    public int powerOn(int batteryLife) {
        if (batteryLife > 0 && batteryLife <= 100) {
            System.out.println("Your watch is turned on");
        } else if(batteryLife > 101) {
            System.out.println("Your battery is over charged, please drain the battery");
        } else if (batteryLife <= 0){
        System.out.println("Your phone does not have a charge. Please charge your phone");
        }
        return batteryLife;
    }

    @Override
    public void wallpaper() {
        System.out.println("Nice wallpaper you have chosen");
    }

    @Override
    public String batteryLife(int batteryLife) {
        if(batteryLife > 101) {
            return "Issue with battery over heat, please cool down your phone";
        }
        return "Your battery life is: " + batteryLife + "%";
    }

    @Override
    public String wristStrap(String color) {
        System.out.println(color + " is nice color, will look good on your watch");
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }
}
