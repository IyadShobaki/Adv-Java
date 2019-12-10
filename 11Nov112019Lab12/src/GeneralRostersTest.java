//I Shobaki
//Lab12 sorting and searching
//Nov 13, 2019
//This is the driver to process the general master file

public class GeneralRostersTest {

	public static void main(String[] args) {
		System.out.println("Iyad Shobaki");
		System.out.println("Lab12 sorting and searching");
		System.out.println("Nov 13, 2019");
		System.out.println();

		GeneralRosters application = new GeneralRosters();

		application.openFile();

		application.readRecords();

		application.closeFile();

		application.sortRoster();

		application.searchRoster();
	}

}
