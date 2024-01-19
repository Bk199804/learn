/*Given a positive integer N, determine whether it is odd or even.
 N=1 */
 
public class evenodd {
    public static void main(String[] args) {
       int N=2; 
       System.out.println(sol(N));
    }
    static String sol(int N)
    {   
        if(N%2==0)
        return "even";
        else
        return "odd";
        
        
    }

}
