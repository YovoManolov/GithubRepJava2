package seqDimSonigramApp.fileHandling;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import seqDimSonigramApp.dataModels.LogEntity;

public class LogFileReader {
	
	private static final String LOG_FILE_PATH = "logs_BCS37_20181103.csv";
	private static final String COMMA_SEPARATOR = ",";

	/*We read all the info from the log file
	and store it as list of LogEntity objects*/
	public static List<LogEntity> readToList() {
		String line;
		String[] logElements;
		
		List<LogEntity> records = new ArrayList<LogEntity>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(LOG_FILE_PATH))) {
			//skip attr description
			line = br.readLine();
			
			//add only components, eventsName, eventContext and description 
			//from a log record
			while ((line = br.readLine()) != null) {
				logElements = line.split(COMMA_SEPARATOR);
				if(logElements.length == 8 ) {
					records.add(
								new LogEntity(logElements[2] == null ? "" : logElements[2] //eventContext
											, logElements[3] == null ? "" : logElements[3] //component
											, logElements[4] == null ? "" : logElements[4] //eventName
											, logElements[5] == null ? "" : logElements[5] //description
											, logElements[7] == null ? "" : logElements[7] //ip
											)
							
						 );
				}else {
					records.add(
							new LogEntity(logElements[2] == null ? "" : logElements[2] //eventContext
										, logElements[3] == null ? "" : logElements[3] //component
										, logElements[4] == null ? "" : logElements[4] //eventName
										, logElements[5] == null ? "" : logElements[5] //description
										, " "
										)
					 );
				}
				
			}
			return records;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return records;
		} catch (IOException e) {
			e.printStackTrace();
			return records;
		} 
		
	}
}
