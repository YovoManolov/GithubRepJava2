package packageDemonstration;

class PkgTest {

	public static void main(String[] args) {
		Package pckg [] = Package.getPackages();
		
		for(int i = 0 ;i<pckg.length ;i++){
			System.out.println( "Name :  "+ pckg[i].getName() + "\n"+
					" Impementation title  " + pckg[i].getImplementationTitle() + "\n"+ 
				" ImplementationVendor  " + pckg[i].getImplementationVendor() + "\n"+ 
				" ImplementationVersion  " + pckg[i].getImplementationVersion() );			
		}

	}

}