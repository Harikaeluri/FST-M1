package Activities;
import java.util.HashSet;

    public class Activity10 {
        public static void main(String[] args) {
            HashSet<String> hs = new HashSet<String>();
            // Adding element to HashSet
            hs.add("Blue");
            hs.add("Black");
            hs.add("Yellow");
            hs.add("Pink");
            hs.add("Maroon");
            hs.add("Red");

            //Print HashSet
            System.out.println("Original HashSet: " + hs);
            //Print size of HashSet
            System.out.println("Size of HashSet: " + hs.size());

            //Remove element
            System.out.println("Removing a element from HashSet: " + hs.remove("Pink"));
            //Remove element that is not present
            if(hs.remove("voilet")) {
                System.out.println("voilet removed from the Set");
            } else {
                System.out.println("voilet is not present in the Set");
            }

            //Search for element
            System.out.println("Checking if blue is present: " + hs.contains("Blue"));
            //Print updated HashSet
            System.out.println("Updated HashSet: " + hs);
        }
    }
