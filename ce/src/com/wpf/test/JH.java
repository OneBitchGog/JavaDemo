package com.wpf.test;


/**
 * 不需要中间变量  交换两个数的值
 * @author Administrator
 *
 */
public class JH {

	public static void main(String[] args) {
		
		int a = 10;
        int b = 8;
        
//        a = a + b ;
//        b = a - b;
//        a = a -b;
        
        a = a^b;
        b = a^b;
        a = a^b;
        
		System.out.println(a);
		System.out.println(b);
		
		
		
	}
	
}
