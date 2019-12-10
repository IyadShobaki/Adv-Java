package InterfaceSportsScoringExample;
//SportsScoring routine to teach how different sports are scored
public class SportsScoringTester {

	public static void main(String[] args) {
		/*
		Baseball sportBaseball = new Baseball(5);
		sportBaseball.getScoringRubric();
		
		Basketball sportBasketball = new Basketball(5, 10, 3);
		sportBasketball.getScoringRubric();
		
		Football sportFootball = new Football(1, 2, 3, 4, 5);
		sportFootball.getScoringRubric();
		*/
		
		
		//example with AbstractFootball
		SportsScoring[] listScorings = new SportsScoring[4];
		
		// add elements to list
		listScorings[0] = new Baseball(5);
		listScorings[1] = new AmericanFootball(1, 2, 3, 4, 5);
		listScorings[2] = new Basketball(10, 20, 5);
		listScorings[3] = new Soccer(3);
		// display carbon footprint of each object
		for (int i =0; i < listScorings.length; i++) {
			listScorings[i].getScoringRubric();
		}

	}

}
