package InterfaceSportsScoringExample;

public class Soccer extends AbstractFootball{
	int goals;
	
	public Soccer(int goals) {
		super();
		this.goals =goals;
	}
	public void getScoringRubric() {
		footballMsg();
		System.out.println("Soccer scores 1 point for each goal scored");
		System.out.printf("%s5d%s%n%n", "A team with " + goals + " goal(s) has a total of ", calcPoints(), " point(s)");
		
	}
	public int calcPoints() {
		//score calculations go here, then return that score
		return goals;
	}
}
