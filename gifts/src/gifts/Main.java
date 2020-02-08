package gifts;
import java.util.*;

public class Main {
	static Scanner sc;
	public static void main(String args[])
	{
		sc=new Scanner(System.in);
	Chocolates ch1=new Chocolates("cream","Dairy Milk",50,60,10.3,2);
	Chocolates ch2=new Chocolates("cream","Kit-Kat",20,40,8.2,3);
	Chocolates ch3=new Chocolates("candy","lollipop",10,5,3.0,5);
	SweetCookies c1=new SweetCookies("cookie","Good Day",2,15,5.0,8);
	SweetCookies c2=new SweetCookies("cookie","LotteChoco",2,15,6.9,7);
	Chocolates ch4=new Chocolates("candy","Mango Byte",3,12,2.0,4);
	Sweet s1[]=new Sweet [6];
	s1[0]=ch1;s1[1]=ch2;s1[2]=ch3;s1[3]=c1;s1[4]=ch4;s1[5]=c2;
	Gift g=new Gift(s1);
	g.sortBySugarCont();
	g.disp();
	Chocolates c[]=new Chocolates[4];
	c[0]=ch1;c[1]=ch2;c[2]=ch3;c[3]=ch4;
	System.out.println("Enter the range over which candies has to be dispalyed:");
	float low=sc.nextFloat();float high=sc.nextFloat();
	System.out.println("Identifying candies having the sugar cont."+low+"---"+high+" i.e, a specific predetermined range::");
	for(int i=0;i<c.length;i++)
	{
		if(c[i].choco_type.equals("candy") && c[i].getSugarContent()>=low && c[i].getSugarContent()<=high)
	{
	System.out.println(c[i].getName());
	}
	}
	}
}



