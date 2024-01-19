/*Given N,  reverse the digits of N. Input : 122 */


public class reverse {
    public static void main(String[] args) {
        long n = 122;
        System.out.println(sol(n));
    }
    static long sol(long n)
    {
        long rev = 0;
        while(n>0){
            long last = n%10;
            rev = rev *10 + last;
            n = n/10;
        }
        return rev;
           
       
    }
}
