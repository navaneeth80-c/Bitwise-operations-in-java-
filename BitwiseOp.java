

public class BitwiseOp {
    public static void main(String[] arrgs)
    {
       // System.out.println(1&1);
        //System.out.println(200>>3);
        //System.out.println();
        // for(int i=0;i<20;i++)
        // {
        // SettingIthBit(0,i);
        // }
       // ClearingIthBit(9, 4);
      // System.out.println(~0 <<4);
      System.out.println(AddBits(ClearLastBits(15, 2)));
    }
    public static void FindingIthBit(int num,int index)
    {
        System.out.println(num &(1<<(index-1)));
    }
    public static void SettingIthBit(int num,int index)
    {
        System.out.println(num | (1<<index));
    }
    public static void ClearingIthBit(int num,int index)
    {
        System.out.println(num & ~(1<<index-1));
    }
    public static int ClearLastBits(int num,int index)
    {
       return(num & (~0 << index));
    }
    public static int AddBits(int num)
    {
       int pow=0, Binary=0;
       while (num>0) {
        Binary=Binary+(int) Math.pow(10, pow) * (num%2);
        num=num/2;
        pow++;
       }
       return Binary;
    }
}


