
public class CoolThing {

	public static void main(String[] args) {
		int a [] = new int [300];
		
		for(int i = 0 ;i < a.length ; i++){
			a[i] = (int)(Math.random() *2000);
			//System.out.println(a[i]);
		}
		
		for(int c:a){
			System.out.println(c);
			
		}

	}

}