# HCF
import java.io.*;
import java.util.*;
public class HCF
{
public static void main(String args[])throws IOException

int a,b,c,d,e,hcf;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the two numbers:");
c=Integer.parseInt(br.readLine());
d=Integer.parseInt(br.readLine());
a=c;
b=d;
while(b!=0)
{
e=b;
b=a%b;
a=e;
}
hcf=a;
System.out.println("HCF of two numbers is = "+hcf);
}
}
