import java.util.Scanner;
class Problem5{
    public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
         int n = sc.nextInt();
         int pow = sc.nextInt();
         int out=1;
         while(pow>0){
            out*=n;
            pow--;
         }
         System.out.println(out);
    }
}