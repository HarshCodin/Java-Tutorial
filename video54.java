interface Bicycle{
    int a = 45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int x = 45;
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khusi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po po");
    }
}

public class video54 {
    public static void main (String[]args){
        AvonCycle cycleHarsh = new AvonCycle();
        cycleHarsh.applyBreak(1);
        // you can create properties in Interfaces
        System.out.println(cycleHarsh.a);
        System.out.println(cycleHarsh.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarsh.a = 454;
        // System.out.println(cycleHarsh.a);
        cycleHarsh.blowHornK3g();
        cycleHarsh.blowHornmhn();
    }
}
