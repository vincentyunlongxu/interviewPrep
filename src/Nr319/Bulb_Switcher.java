package Nr319;

/**
 * Created by yunlongxu on 12/22/15.
 */
public class Bulb_Switcher {
    public static void main(String[] args){
        int lightOn = bulbSwitch(3);
        System.out.println(lightOn);
    }

    public static int bulbSwitch(int n) {
        return (int)Math.sqrt((double)n);
    }
}
