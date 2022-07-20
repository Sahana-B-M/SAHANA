import java.util.Scanner;

public class prg3 {
    public static void main(String args[])
    {
        int a,i;
        String s=new String();
        String s1=new String();
        StringBuffer b=new StringBuffer();
        StringBuffer r=new StringBuffer();
        StringBuffer sb=new StringBuffer("java programming");
        System.out.println("Capacity="+sb.capacity());
        //System.out.println(sb.length());
        System.out.println("Enter String");
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        a=s.length();
        System.out.println("Reverse of String");
        for(i=a-1;i>=0;i--)
        {
            System.out.print(sb.charAt(i));
            b.append(sb.charAt(i));
            }
            s=b.toString();
        
        System.out.println("\n");
        System.out.println("Converted to UpperCase" +s.toUpperCase());
        r.append(s.toUpperCase());
        
        System.out.println("Enter 2nd String");
        Scanner sc1=new Scanner(System.in);
        s1=sc1.next();
        //sb.append().s.append()
        System.out.println(r.append(s1));

    }
}
