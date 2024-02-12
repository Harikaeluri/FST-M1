package Activities;
import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> colours = new HashMap<Integer, String>();
        colours.put(1, "Pink");
        colours.put(2, "Gray");
        colours.put(3, "Green");
        colours.put(4, "White");
        colours.put(5, "Blue");
        System.out.println("The Original map: " + colours);
        colours.remove(5);
        System.out.println("After removing " + colours);

        if(colours.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }

        System.out.println("Number of pairs in the Map is: " + colours.size());
    }
}