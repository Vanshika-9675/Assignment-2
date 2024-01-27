import java.util.Scanner;
class Problem3{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int even=0;
       int odd=0;
       while(n>0){
         int number= n%10;
         if(number%2==0){
           even+=number;
         } 
         else{
            odd+=number;
         }
         n=n/10;
       }
       System.out.println(even+" "+odd);
    }
}