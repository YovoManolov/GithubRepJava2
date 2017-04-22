package linkedHashSet;

import java.util.*;
class LHSExample {

	public static void main(String[] args) {
		LinkedHashSet <String> lhs = new LinkedHashSet <String>();
		Random d = new Random();
		Double sum = 0.0 ;
		int i = 0;
		while(i < 5){	
		
			lhs.add(" " + d.nextDouble() + d.nextInt());
			if(i == 3){
				 lhs.add(" " + (sum =  (d.nextDouble() + d.nextInt())  ));
			}
		i ++;	
		}
		
		System.out.println("the LinkedHashList before duplicating string ");
		for(String ob : lhs){
			System.out.println(ob);
		}
		
		try{
			lhs.add(" " + sum);	
		}catch(Exception e){
			e.getStackTrace();
		}
		
		
		System.out.println("the LinkedHashList after duplicating string ");
		for(String ob : lhs){
			System.out.println(ob);
		}
	}

}
