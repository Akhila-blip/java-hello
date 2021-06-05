package com.packages;

public class C
{
public static int i=25;
protected int k=15;
public void msg()
{
System.out.println(i);
}
public void msg1()
{
msg1();
}
public static void main(String[]args)
{
C c=new C();
System.out.println(c.k);
}
}