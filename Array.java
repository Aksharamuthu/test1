package com.javaclass;

public class Array {
public static void main(String[] args) {
	   int [] i=new int [5];
	   
	   
	   i[0]=5;
	   i[1]=10;
	   i[2]=15;
	   i[3]=20;
	   i[4]=25;
	   i[5]=30;
	   i[6]=35;
	
	   
	   
	   System.out.println(i[0]);
	   System.out.println(i[1]);
	   System.out.println(i[2]);
       System.out.println(i[3]);
	   System.out.println(i[4]);
	   
	   
	  
	 int j=0;
	 do {
		 System.out.println(i[j]);
		 j++;
		
	}
	 while (j<=4); 
	 
	}

}

