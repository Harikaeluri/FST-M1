package Activities;

interface BicycleParts
{
    public int gears=0;
    public int speed=0;
}

interface BicycleOperations
{
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}
class Bicycle implements BicycleParts,BicycleOperations{
    public int gears;
    public int speed;
    Bicycle(int a,int b){
        this.gears=a;
        this.speed=b;
    }

    @Override
    public void applyBrake(int decrement) {
        this.speed=this.speed-decrement;
    }

    @Override
    public void speedUp(int increment) {
        this.speed=this.speed+increment;
    }
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + speed);
    }
        }
class MountainBike extends Bicycle{
    int seatHeight;
    MountainBike(int a,int b,int c){
        super(a,b);
        this.seatHeight=c;
    }
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    public String bicycleDesc() {
        return(super.bicycleDesc()+"\nSeat Height"+ seatHeight);
    }
}
public class Activity7 {

    public static void main(String[] args)
    {
        MountainBike mb=new MountainBike(3,0,30);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
        System.out.println(mb.bicycleDesc());

    }

}