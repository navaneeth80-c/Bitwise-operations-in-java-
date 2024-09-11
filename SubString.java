public class SubString {
    public static  void main(String[] n)
    {
        String A= "ABCABCABCABCABC";
        String B="ABCABCABCABC";
        System.out.println(sub(A,B));
    } 

    public static String sub(String A,String B)
    {
        String R="";
        if(!((A+B).equals(B+A)))
        {
            return "";
        }else{
            return A.substring(0,StringSlice(A.length(), B.length()));

        }
    }
    public static int StringSlice(int a,int b)
    {
        int temp=0;
        while(b!=0)
        {
            temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    
}
