import java.util.*;
class evenodd
{
public static void main(String args[])
{
int a,b,e=0,o=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a value");
a=sc.nextInt();
while(a>0)
{
b=a%10;
if(a%2==0)
e++;
else
o++;
a=a/10;
}
System.out.println("odd digits="+o);
System.out.println("even digits="+e);
}
}