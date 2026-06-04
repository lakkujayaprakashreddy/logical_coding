package innovationM.faq;

public class ClimbStairs {
    public static void main(String[] args) {
        int n=5;
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n){
        int first=1;
        int second=2;
        int result=0;
        for(int i=3;i<=n;i++){
            result=first+second;
            first=second;
            second=result;
        }
        return second;
    }
}
