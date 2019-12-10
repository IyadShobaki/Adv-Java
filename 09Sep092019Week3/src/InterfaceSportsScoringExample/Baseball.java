package InterfaceSportsScoringExample;
//Baseball class

public class Baseball implements SportsScoring {
	int runs;
	
	public Baseball(int runs) {
		super();
		this.runs = runs;
	}
	
	public void getScoringRubric() {
		System.out.println("Baseball scores 1 point for each run scored");
		System.out.printf("%s%d%s%n%n","A team with " + runs + " run has a total of ", calcPoints(), " point(s)");
	}
	public int calcPoints() {
		//score calculations go here, then return that score
		
		return runs;
	}
}//end class
