import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String folderPath = "C:\\Users\\David\\Documents\\testRename";
		
		File myFolder = new File(folderPath);

		// grabbing all of the files
		File[] fileArray = myFolder.listFiles();
		
		// grabbing the current date
		String currentDate = getCurrentDate();
		
		// string that will be replaced in the file name
		String toBeReplaced = "*";
		
		//loop that goes through all of the files in the folder
		for (int i = 0; i < fileArray.length; i++) 
        { 
			if(fileArray[i].isFile()) {
				String oldFileName = fileArray[i].getName();
				
				if(oldFileName.contains(toBeReplaced)) {
					String newFileName = oldFileName.replaceAll(toBeReplaced, currentDate);
					System.out.println(newFileName);
				}
				
			}		
			
        }
		
		System.out.println(fileArray.length);
	}
	
	public static String getCurrentDate() {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		String currentDate = (dateFormat.format(date));
		
		return currentDate;
	}

}
