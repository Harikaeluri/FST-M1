package Activities;

public class Activity2 {
    public static void main(String args[]){
        int[] arr=new int[]{10, 77, 10, 54, -11, 10};
        int s=0;
        for( int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]==10)
            {
                s=s+10;
            }
        }
        if(s==30){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
