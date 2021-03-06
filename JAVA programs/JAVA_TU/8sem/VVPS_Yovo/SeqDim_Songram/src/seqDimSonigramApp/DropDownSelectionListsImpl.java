package seqDimSonigramApp;

import java.util.List;

import seqDimSonigramApp.dataModels.LogData;

public class DropDownSelectionListsImpl {
	
	private List<String> allEventNames;
	private List<String> allEventContexts;
	private List<String> allComponents;
	
	public DropDownSelectionListsImpl() {
		super();
		allEventNames = LogData.getLogEventNames();
		allEventContexts = LogData.getLogEventContexts();
		allComponents = LogData.getLogComponents();
	}
	
	
	public void listAllEventContexts() {
		//found contexts for chosen user
		System.out.println("\n List of all event contexts: ");
		for(int i = 0;i< allEventContexts.size(); i++) {
			System.out.println( i + ": " + allEventContexts.get(i));
		}
	}
	public void listAllComponents() {
		//found contexts for chosen user
		System.out.println("\n List of all components: ");
		for(int i = 0;i< allComponents.size(); i++) {
			System.out.println( i + ": " + allComponents.get(i));
		}
	}
	
		//found contexts for chosen user
	public void listAllEventNames() {
		System.out.println("\n List of all event names: ");
		for(int i = 0;i< allEventNames.size(); i++) {
			System.out.println( i + ": " + allEventNames.get(i));
		}
	}
	
	public String getSelectedComponent(int choice) {
		
		return allComponents.get(choice);
	}
	

	public String getSelectedEventNames(int choice) {
		
		return allEventNames.get(choice);
	}
	

	public String getSelectedEventContexts(int choice) {
		
		return allEventContexts.get(choice);
	}
	
	
}
