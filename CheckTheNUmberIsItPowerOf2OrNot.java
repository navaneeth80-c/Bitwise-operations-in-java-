import java.util.Scanner;

public class CheckTheNUmberIsItPowerOf2OrNot {
    public static void main(String[] s)
    {
      Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(PowerOfThreeOrNot(num))
        {
            System.out.println(num+" is a power of : ");
        }else{
            System.out.println(num+" its not a power of 9");
        }
        System.out.println(2 & 3);

    }

    public static boolean PowerOfTwoOrNot(int num)
    {
        if(((num) & (num-1))==0)
        {
            return true;
        }
        return false;
    }
    public static boolean PowerOfThreeOrNot(int num)
    {
        if(((num)&(num-1))==(num-1))
        {
            return true;
        }
        return false;
    }
    
}
