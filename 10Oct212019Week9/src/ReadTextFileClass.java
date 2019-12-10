import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFileClass {
	private Student record;
	private Scanner input;
	
	public void openFile() {
		try {
			input = new Scanner(new File("studentInfo.txt"));
			
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Can't open or acces file " + fileNotFoundException + "\n");
			System.exit(1);
		}
	}
	
	public void readRecords() {
		record = new Student();
		try {
			//while(true) {
			while(input.hasNext()) {
				record.setIdNumber(input.nextInt());
				record.setName(input.next());
				record.setAge(input.nextInt());
				record.setDebt(input.nextDouble());
				
				System.out.printf("%d %s %d %.2f\n", record.getIdNumber(),
						record.getName(), record.getAge(), record.getDebt());
			}//end while
		} catch (Exception e) {
			System.err.println(e);
			System.err.println(".....catch.....");
		}
		
		// MORE PROCESSING 
	}// end readRecords
	public void closeFile() {
		if(input != null)
			input.close();
	}
}
