package codePointAt;

class CodePoitAdd {

       public static void main(String[] args) {
		  
			   String str = "JAVA";
			   System.out.println("String = " + str);
			        
			   //codepoint at index 1
			   int retval = str.codePointAt(1);
			        
			   //prints character at index1 in string
			   System.out.println("Character(unicode point) = " + retval);

	}

}