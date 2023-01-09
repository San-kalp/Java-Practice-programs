package TimeComplexity;

public class Sum {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        Sum object1= new Sum();
        System.out.println(object1.findSum(99999));
        System.out.println("Time taken - " + (System.currentTimeMillis()-now)+" milliseconds.");
    }

   /*  public int findSum(int n){
        return n*(n+1)/2;
    } */

    public int findSum(int n){
        int sum =0;
        
        for(int i =1;i<=n;i++){
            sum+=i;

        }
        return sum;

    }


    
}
