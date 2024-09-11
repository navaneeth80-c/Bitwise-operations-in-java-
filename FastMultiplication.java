public class FastMultiplication {
    public static void main(String[] s)
    {
       System.out.println((char)(' '));

        
    }
    public static int fastMul(int num,int pow)
    {
        int ans=1;
        while (pow>0) {
            if((pow & 1) !=0)
            {
                ans= num * ans;
            }
            num*=num;
            pow=pow >> 1;
            
        }
        return ans;
       
            
        }
        public static void Addnumber(int num)
        {

        }
        public static void easySwap(int a,int b)
        {
            a=a^b;
            b=a^b;
            b=a^b;
            System.out.println("before b= "+a+" a= "+b);
            System.out.println("after a="+a+" b= "+b);
        }
    }
    

