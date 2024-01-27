import java.util.Scanner;
class Problem6{
    public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
         int n = sc.nextInt();
         int output=0;
         while(n>0){
            int num = n%10;
            n=n/10;
            output=output*10+num;
         }
         System.out.println(output);
    }
}
