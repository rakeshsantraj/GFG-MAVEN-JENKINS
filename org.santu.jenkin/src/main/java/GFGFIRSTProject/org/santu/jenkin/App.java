package GFGFIRSTProject.org.santu.jenkin;

import GFGFIRSTProject.org.santu.jenkin.Mycal.MyCalc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MyCalc ob = new MyCalc();
		System.out.println(ob.sum(10, 5));
		System.out.println(ob.diff(10, 5));
		System.out.println(ob.mul(10, 5));
		System.out.println(ob.div(10, 5));
    }
}
