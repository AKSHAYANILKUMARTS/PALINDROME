import java.util.Scanner;
public class palindrome
{
    public static void main(String[] args) 
    {
        String str,str1,rev="";
        int i,length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        str=sc.nextLine();
        str1=str.toLowerCase();
        length=str1.length();
        for(i=length-1;i>=0;i--)
        {
            rev=rev+str1.charAt(i);
        }
        if(str1.equals(rev))
        {
            System.out.println("Palindriome");
        }
        else
        {
            System.out.println("Not Palindriome");
        }
        
    }
}