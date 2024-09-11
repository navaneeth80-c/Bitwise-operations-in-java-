public class TestBits {
    public static void main(String[] s)
    {
        System.out.println(binaryrep(11));
    }

    public static int binaryrep(int n)
    {
        int pow=0,binary=0;
        while (n>0) {
            binary =binary+(int)Math.pow(10, pow++)* (n %2);
            n=n/2;
          //  pow++;
            
        }
        return binary;
    }
    
}
