public class Conversion
{
public static void main(String args[])
{
String s="200";
Integer i=Integer.valueOf(s);
System.out.println(i);
int i1=250;
String s1=String.valueOf(i1);
System.out.println(s1);
String s2="9959785948";
long l=Long.parseLong(s2);
System.out.println(l);
long l1=58423169431L;
String s3=String.valueOf(l1);
System.out.println(s3);
String s4="52.6";
float f=Float.parseFloat("52.6");
System.out.println(f);
float f1=45.3F;
String s5=String.valueOf(f1);
System.out.println(s5);
String s6="45.6";
double d=Double.parseDouble("45.6");
System.out.println(d);
double d1=15.8;
String s7=String.valueOf(d1);
System.out.println(s6);
String s8="hello";
char c=s8.charAt(1);
System.out.println("2nd character is:"+c);
char c1='a';
String s9=String.valueOf(c1);
System.out.println("String is:"+s9);
int i5=110;
long l6=i5;
System.out.println(l6);
long l7=500;
int i6=(int)l7;
System.out.println(i6);
int i7=450;
double d2=i7;
System.out.println(d2);
double d3=16.5;
int i8=(int)d3;
System.out.println(i8);
char c2='1';
int a =Integer.parseInt(String.valueOf(c2));
System.out.println(a);
int b=2;
char c3=(char)b;
System.out.println(c3);

}
}