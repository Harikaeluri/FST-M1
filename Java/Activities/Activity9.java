package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String args[])
    {
        ArrayList<String> arr= new ArrayList<String>();
        arr.add("Haritha");
        arr.add("Harika");
        arr.add("Chaitanya");
        arr.add("Chandana");
        arr.add("Taslima");
        for(String s:arr){
            System.out.println(s);
        }
        System.out.println("3rd element in the list is: " + arr.get(2));
        System.out.println("Is Priya in list: " + arr.contains("Priya"));
        System.out.println("Size of ArrayList: " + arr.size());

        arr.remove("Haritha");
        System.out.println("New Size of ArrayList: " + arr.size());
    }
}
