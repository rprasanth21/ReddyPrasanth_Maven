package gifts;

public class Chocolates extends Sweet{
	public String choco_type;
	String choco_name;
	public Chocolates(String choco_type,String choco_name,double price,double weight,double sugar_content,int count)
	{
	this.choco_type=choco_type;
	this.name=choco_name;
	this.price=price;
	this.weight=weight;
	this.sugar_content=sugar_content;
	this.count=count;
	sweet_type="*chocolate*";
	}
	public void disp()
	{
	System.out.println("sweet type:"+sweet_type+"\nchoco type:"+choco_type+"price in Rs.:"+price+"\nweight is:"+weight+" gms"+"\n sugar content:"+sugar_content+"%"+"\nnum of  :"+choco_name+"is:"+count);
	}
	public String getName()
	{
	return name;
	}
	public double getWeight()
	{
	return weight;
	}
	public double getPrice()
	{
	return price;                   //of single chocolate
	}
	public double getSugarContent()
	{
	return sugar_content;
	}
	public int getCount()
	{
	return count;
	}

}

