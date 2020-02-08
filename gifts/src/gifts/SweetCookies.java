package gifts;

public class SweetCookies extends Sweet{
	public SweetCookies(String cookie_type,String 

			cookie_name,double price,double weight,double 

			sugar_content,int count)
			{
			this.sweet_type=cookie_type;
			this.name=cookie_name;
			this.price=price;
			this.weight=weight;
			this.sugar_content=sugar_content;
			this.count=count;
			sweet_type="*Choco Cookies*";
			}
			public void disp()
			{
			System.out.println("sweet type:"+sweet_type+"\ncookie type:"+sweet_type+"price in Rs.:"+price+"\nweight is:"+weight+" gms"+"\n sugar content:"+sugar_content

			+"%"+"\nnum of  :"+name+"is:"+count);
			}
			public String getName()
			{
			return name;
			}
			public double getWeight()
			{
			return weight;                         //of single 

			}
			public double getPrice()
			{
			return price;                    //single cookie cost
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

