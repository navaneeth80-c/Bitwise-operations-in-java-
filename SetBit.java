public class SetBit {
    public static void main(String[] s)
    {
        System.out.println(setBit(15));

    }
    public static int setBit(int num)
    {
        int count =0;
        while(num>0)
        {
            if((num &1) !=0)
            {
                count++;
            }
            num=num >>1;

        }
        return count;
    }
    
}
