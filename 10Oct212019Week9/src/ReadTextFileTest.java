
public class ReadTextFileTest {

	public static void main(String[] args) {
		
		ReadTextFileClass application = new ReadTextFileClass();
		
		application.openFile();
		
		application.readRecords();
		
		application.closeFile();
	}

}
