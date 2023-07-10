import java.util.Scanner;
public class en_decode {
    static void encode(String str,int k){
        for(int i=0;i<str.length();i++){
            int val=str.charAt(i);
            int encodeval=val+k;

            if(encodeval>122){
                 encodeval=96+(encodeval-122);
            }
            char a=(char)encodeval;
            System.out.print(a);
        }
    }

    static void decode(String str,int k){
        for(int i=0;i<str.length();i++){
            int val=str.charAt(i);
            int decodeval=val-k;

            if(decodeval<97){
                decodeval=123-(97-decodeval);
            }
            char a=(char)decodeval;
            System.out.print(a);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Type encode for encrypt and decode for decrypt:");
        String en=sc.next();
        System.out.print("Type message to "+en+":");
        String str=sc.next();
        System.out.print("enter the number of shifts:");
        int k=sc.nextInt();
        if(en.equals("encode")){
            System.out.print("the encode sequence is:");
            encode(str,k);
        }
        else if(en.equals("decode")){
            System.out.print("the decode sequence is:");
            decode(str,k);
        }
        else {
            System.out.print("please enter 'encode' or 'decode'");
        }
    }
}
