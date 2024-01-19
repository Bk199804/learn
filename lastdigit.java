
/*You are given two integer numbers, the base a and the index b. You have to find the last digit of ab.  a = "3", b = "10"  */

public class lastdigit {
    public static void main(String[] args) {
        int base = 3;
        int exponent = 10;
        System.out.println(sol(base, exponent));

    }
    static int sol(int base,int exponent)
    {
        int result=1;
        
        for (int i = 0; i <exponent; i++) {
            result = result*base;
        }return result%10;
        
        
        
        
        

    }
    
}
