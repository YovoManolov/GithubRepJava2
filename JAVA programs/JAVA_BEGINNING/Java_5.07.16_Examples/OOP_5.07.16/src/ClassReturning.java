
public class ClassReturning {
   public static void main(String args[]){
	   Test2 ob1 = new Test2 (5);	   
	   Test2 ob2 = ob1.increaseBy10();
	   
	   System.out.println("a  : " + ob1.a);
	   System.out.println(" " + ob2.a);
	   
	  ob2 = ob2.increaseBy10();
	  System.out.println(" " + ob2.a);
	  
   }
}

class Test2 {
	int a;
	
	Test2 (int i) {
		a = i;
	}
	
	Test2 increaseBy10 () {
		Test2 temp = new Test2 (a + 10);
		return temp;
	}
}