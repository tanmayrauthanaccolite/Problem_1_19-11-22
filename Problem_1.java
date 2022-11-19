package Problem_1;

import java.util.Scanner;

public class Problem_1 {
    public static int computePointOfInterception(int a,int b)
    {
        do
        {
            a=(a+2)%12;
            b=(b+1)%12;
        }while(a!=b);

        if(a==0)
            return 12;
        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter position of Node X ");
        int pos1=sc.nextInt();
        System.out.println("Enter position of Node Y ");
        int pos2=sc.nextInt();
        int meetingPosition=computePointOfInterception(pos1,pos2);
        System.out.println("They meet at position "+meetingPosition);
    }
}
