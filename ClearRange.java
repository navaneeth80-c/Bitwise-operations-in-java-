import java.math.BigInteger;
public class ClearRange {
    public static void main(String[] s)
    {
     Clear_range(15, 2, 3);
   //System.out.println((1 << 2)-1);

    } 
    public static void Clear_range(int num, int Sind,int Eind)
    {
        int BitMask = (~0<< (Eind+1)) | ((1<< (Sind))-1);
        int br = num & BitMask;
      System.out.println(br);

    }
    public static int BitRep(int num)
    {
        int Binary=0,pow=0;
        while (num>0) {
            Binary=Binary+(int)Math.pow(10, pow) *(num % 2);
                      
        }
        return Binary;
    }
    // public static long DigRep(BigInteger num)
    // {
    //     BigInteger Diget=BigInteger.valueOf(0);
    //     long pow=0,Sum=0;int a =0;
    //     while (num != 0) {
    //         a=num %10;
    //         Diget=BigInteger.valueOf(a);
    //         num=num/10;
    //         Sum=Sum+(int)Math.pow(2, pow) * (int)Diget;
    //         pow++;
    //     }
    //     return Sum;
        
    // }
    
}
