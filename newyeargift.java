import java.util.*;

abstract class newyear
{

abstract void noofsweets();

}

class sweet1 extends newyeargift
{

void noofsweets()
{

System.out.println("no of sweets are 4");

}
}

class sweet2 extends newyear
{

void noofsweets()
{

System.out.println("no of sweets are 6");

}
}

class sweet3 extends newyear
{

void noofsweets()
{

System.out.println("no of sweets are 8");

}
}

class newyeargift
{

public static void main(String args[])
{

Scanner sc=new Scanner(System.in);

int c1,c2,c3;

System.out.println("no of candies weights are");

c1=sc.nextInt();

c2=sc.nextInt();

c3=sc.nextInt();

int totalweight=c1+c2+c3;

sweet1 s1=new sweet1();

sweet2 s2=new sweet2();

sweet3 s3=new sweet3();

System.out.println("total weight "+totalweight);

s1.noofsweets();

s2.noofsweets();

s3.noofsweets();

}}}