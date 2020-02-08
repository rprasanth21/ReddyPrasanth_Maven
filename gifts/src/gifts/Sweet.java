package gifts;

public abstract class Sweet {
	//public String choco_type;
	public String sweet_type;
	public String name;
	public double price;
	public double weight;
	public double sugar_content;
	public int count;

	abstract public void disp();
	abstract public String getName();
	//abstract public String getType();
	abstract public double getPrice();
	abstract public double getSugarContent();
	abstract public int getCount();
	abstract public double getWeight();

}
