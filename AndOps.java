import java.util.*;
public class AndOps
{
    public static void main(String[] he)
    {
        // System.out.println(1 ^ 0);
        int[] num={1,2,3,4,5,6,7,8};
        ArrayList<Integer> list= new ArrayList<>();
        StringBuilder sc = new StringBuilder(100);
        for(int i=0;i<num.length;i++)
        {
            sc.append(Integer.toBinaryString(num[i]));
            if(sc.charAt(sc.length()-1)=='0')
            {
                list.add(num[i]);
            }
            sc.setLength(0);
            
        }
        System.out.println(list);

        // String s =Integer.toBinaryString(num);
        // System.out.println(s);
    }
}