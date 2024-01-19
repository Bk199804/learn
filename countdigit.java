/*Given a number N. Count the number of digits in N which evenly divide N. */

public class countdigit {
    public static void main(String[] args) {
        int N = 12;
        System.out.println(sol(N));
    }
    static int sol(int N)
    {
        int temp = N;
        int count =0,rem;
        while(temp>0){
            rem=temp%10;
            if(rem!=0&&N%rem==0)
            {
                count++;
            }temp=temp/10;
        }return count;
    }

}
