package com.nt.service;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public int sum(int x, int y) {
		return x+y;
	}
    public static void main( String[] args )
    {
        App s = new App();
        System.out.println("sum is :"+s.sum(10, 20));
    }
}
