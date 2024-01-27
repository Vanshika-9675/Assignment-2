import java.util.Scanner;
class problem2{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int S = obj.nextInt();
        int E= obj.nextInt();
        int W = obj.nextInt();
        while(S<=E){
            int celcius = (S-32)*5/9;
            System.out.println(S+" "+celcius);
            S+=W;
        }
    }
}