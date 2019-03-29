package main;
import java.util.ArrayList;
import java.util.List;

import main.Bill;
import main.Item;

public class Cart extends Bill{
    //one cart one bill
    public List<Item> inCart = new ArrayList<Item>();
    public List<Integer> quant = new ArrayList<Integer>();
    public int noOfItems=0;
	private Item a1;
	private int q1;
    public void updateCart(Item a,int q ){
    	inCart.add(a);
    	quant.add(q);
    	noOfItems=inCart.size();
   

    }
    public static void add(Item a)
    {
    	Cart c=new Cart();
    	c.set(a);
    	c.get();
    	
    }
    public Item get()
	{
		return a1;
	}
    public void set(Item a)
	{
		this.a1=a;
	}
    public static void quant(int q)
    {
    	Cart c=new Cart();
    	c.set1(q);
    	c.get1();
    	
    }
    public int get1()
	{
		return q1;
	}
    public void set1(int q)
	{
		this.q1=q;
	}
    public int totalAmt=0;
    public void finalizeCart(String name){
        super.getBill(name);//make it outside
        for(int i=0;i<noOfItems;i++){
            System.out.println("|  "+ inCart.get(i).itemName + "  " + inCart.get(i).mrp +"  "+quant.get(i)+'\n');
        }
        totalAmt = calcBill();
        System.out.println("total Amount: "+ Integer.toString(totalAmt));
    }
    public int calcBill() {
    	int total=0;
       for(int i=0;i<noOfItems;i++)
       {
    	total=total+(inCart.get(i).mrp)*(quant.get(i));
       }
    	return total;
    	
    }
}