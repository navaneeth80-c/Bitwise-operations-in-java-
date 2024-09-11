public class OddOrEvenBitwiseOps {
    public static void oddoreven(int num)
    {
        int BitMask=1;
        if((num & BitMask)==0)
        {
            System.out.println("its even");
        }else{
            System.out.println("its odd");
        }
    }
    public static void main(String[] args)
    {
        int num=0;
        oddoreven(num);
    }
}
