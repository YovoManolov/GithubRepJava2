package removeAllEx;
import java.util.*;
class RemuveAllEx {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al2 = new ArrayList<String>();
		
		al.add("first");
		al.add("second");
		al.add("third");
		
		al2.add("first");
		al2.add("third");
		al2.add("sixth");
		
		///remove it's elements from a list that are \
		/// not contained in the specified collection.
		al2.retainAll(al);
		
		Iterator it = al2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}