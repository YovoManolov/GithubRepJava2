package example1;
import java.util.regex.*;

public class Example1 {
	public static void main(String[] args) {
		String mainStr = " A 08 ** That's me ** 96 A " ;
		String pattern = "(.* )(\\d)" ;
		
        Pattern objPattern = Pattern.compile(pattern);
        
        //Matcher must be called from the pattern object
        //The argument of matcher is the String in witch we will search ;
        
        
        Matcher objMatcher = objPattern.matcher(mainStr); 
        
        if(objMatcher.find()) {
        	//We must to check if there is a coincidence for each capturing group
        	System.out.println("Coincidence for capturing group one : " + objMatcher.group(0));
        	System.out.println("Coincidence for capturing group two : " + objMatcher.group(1));
        }else{
        	System.out.println("We have nothing found");
        }
        
	}

}