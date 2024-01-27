import java.util.Scanner;
class problem{
    public static void main(String args[]){
        int arr[] = new int[26];
        Scanner obj = new Scanner(System.in);
        String str= obj.nextLine();
        String out="";
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch>=97 && ch<=122){
                int ind = ch-97;
                arr[ind]++;
            }
        }
        for(int i=0;i<26;i++){
           if(arr[i]==1){
            out+=(char)(i+97);
           }
        }
        System.out.println(out);
    }
}