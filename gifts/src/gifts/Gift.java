package gifts;

public class Gift {
	Sweet s[];
	double total_weight;
	double total_sugar_content;
	double total_items_in_Gift;
	double total_price;
	public Gift(Sweet s[])
	{
	total_weight=0;
	 total_sugar_content=0;
	total_items_in_Gift=0;
	total_price=0;
	this.s=new Sweet[s.length];
	for(int i=0;i<s.length;i++)
	{
	this.s[i]=s[i];
	total_price=total_price+s[i].count*s[i].getPrice();
	total_weight=total_weight+s[i].getWeight();
	total_items_in_Gift+=s[i].getCount();
	total_sugar_content+=s[i].getSugarContent();
	}
	}
	public void sortBySugarCont()
	{
	Sweet temp;
	for(int i=0;i<s.length;i++)
	{
	for(int j=i+1;j<s.length;j++)
	{
	if(s[i].getSugarContent()>s[j].getSugarContent())
	{
	temp=s[i];
	s[i]=s[j];
	s[j]=temp;
	}
	}
	}
	}
	public void disp()
	{System.out.println("Items Sorted Based on Sugar Content");
	System.out.println("SWEET TYPE  \t    NAME   \t  WEIGHT    \t   PRICE     \t   COUNT    \t    SUGAR CONTENT");
	for(int i=0;i<s.length;i++)
	{
	System.out.println(s[i].sweet_type+"\t "+s[i].getName()+"   \t  "+s[i].getWeight()+"   \t   "+s[i].getPrice()+"     \t   "+s[i].getCount()+"       \t    "+s[i].getSugarContent());
	}
	System.out.println("Total Weight:"+total_weight);
	System.out.println("Total Sugar Content in The Box:"+total_sugar_content);

}
}

